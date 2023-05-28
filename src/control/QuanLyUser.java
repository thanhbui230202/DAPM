/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import java.util.List;
import model.User;
import connect.GetConnectServer;
import java.sql.Connection;
import java.sql.*;
/**
 *
 * @author OS
 */
public class QuanLyUser {
    public static List<User> runSQLReturnListUser(String sql)
    {
        List<User> listUser = new ArrayList<>();
        Connection con = GetConnectServer.getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next())
           {
               User newUser = new User();
               
               newUser.setIdAccount(rs.getString("idAccount"));
               newUser.setHoVaTen(rs.getString("hoVaTen"));
               newUser.setSdt(rs.getString("sdt"));
               newUser.setCccd(rs.getString("cccd"));
               newUser.setPassWords(rs.getString("passwords"));
               newUser.setChucVu(rs.getString("chucVu"));
               newUser.setQueQuan(rs.getString("queQuan"));
               newUser.setGioiTinh(rs.getString("gioiTinh"));
               
               listUser.add(newUser);
           }
            return listUser;
        } catch (SQLException e) {
            System.out.println("Lỗi lấy toàn bộ user");
        }
        return null;
    }
    
    public User checkUser(String sdt, String passwords){
        User newUser = new User();
        Connection con = GetConnectServer.getConnection();
        
        String sql = "Select * from Account where sdt = ? and passwords = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, sdt);
            preparedStatement.setString(2, passwords);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            rs.next();      
            newUser.setIdAccount(rs.getString("idAccount"));
            newUser.setSdt(rs.getString("sdt"));
            newUser.setCccd(rs.getString("cccd"));
            newUser.setPassWords(rs.getString("passwords"));
            newUser.setChucVu(rs.getString("chucVu"));
            newUser.setQueQuan(rs.getString("queQuan"));
            newUser.setHoVaTen(rs.getString("hoVaTen"));
            newUser.setGioiTinh(rs.getString("gioiTinh"));
            
            return newUser;
        } catch (SQLException e) {
            System.out.println("lỗi check dang nhap");
                    return null;
        }
    }
    
    public List<User> getAllUsers(){
        String sql = "Select * from Account";
        List<User> listUser = runSQLReturnListUser(sql);
        return listUser;
    }
    
    public int demSoLuongNguoiDung(){
        int dem = 0;
        Connection con = GetConnectServer.getConnection();
        try{
            String sql = "select count(idAccount) from Account";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            
            rs.next();
            String countUser = rs.getString(1);
            dem = Integer.parseInt(countUser);
            return dem;
        }
        catch (SQLException e){
            System.out.println("Lỗi đếm ng dùng");
        }
        return 0;
    }
    
    public void delUser(String id)
    {
        Connection con = GetConnectServer.getConnection();
        String sql = "DELETE Account "
                + "where idAccount=?";
        try{
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, id);
            preparedStatement.execute();
        }
        catch(SQLException e){
            System.out.println("lỗi tại xóa theo id");
        }
    }
    
    public void updateUser(User user)
    {
        Connection con = GetConnectServer.getConnection();
        String sql = "UPDATE Account "
                +"SET hoVaTen=?,gioiTinh=?,cccd=?,queQuan=? "
                + "WHERE idAccount=? ";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, user.getHoVaTen());
            preparedStatement.setString(2, user.getGioiTinh());
            preparedStatement.setString(3, user.getCccd());
            preparedStatement.setString(4, user.getQueQuan());
            preparedStatement.setString(5, user.getIdAccount());
            
            preparedStatement.execute();
            
        } catch (SQLException e) {
             System.out.println("Sai tại cập nhật dữ liệu");
        }
        
    }
    
    public void updatePassword(String id, String newPass)
    {
        Connection con = GetConnectServer.getConnection();
        String sql = "UPDATE Account "
                +"SET passwords=? "
                + "WHERE idAccount=? ";
         try {

            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, newPass);
            preparedStatement.setString(2, id);
            
            preparedStatement.execute();
        } catch(SQLException e){
            System.out.println("Sai tại cập nhật mật khẩu");
        }
    }
    
    public User getUserById(String id)
    {
        String sql="Select * from Account where idAccount = ?";
        User newUser= new User();
        Connection con = GetConnectServer.getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            
            rs.next();      
            newUser.setIdAccount(rs.getString("idAccount"));
            newUser.setHoVaTen(rs.getString("hoVaTen"));
            newUser.setSdt(rs.getString("sdt"));
            newUser.setCccd(rs.getString("cccd"));
            newUser.setPassWords(rs.getString("passwords"));
            newUser.setChucVu(rs.getString("chucVu"));
            newUser.setQueQuan(rs.getString("queQuan"));
            newUser.setGioiTinh(rs.getString("gioiTinh"));
            
            return newUser;
        } catch (SQLException e) {
            System.out.println("lỗi tại get user by id");
        }
        return null;
    }
    
     public List<User> getAllUserid_name_sdt(String tim){
       String sql="Select * from Account where (idAccount like '%" + tim + "%') "
               + "or (hoVaTen like '%" + tim + "%') or (sdt like '%" + tim + "%') ";
       List<User> listXe=runSQLReturnListUser(sql);
       return listXe;
    }
     
    public void addUser(User user){
        String sql;
        Connection con = GetConnectServer.getConnection();
        if (user.getChucVu().equals("Admin")){
             sql="INSERT INTO Account (idAccount, sdt, cccd, passWords, chucVu, queQuan, hoVaTen, gioiTinh) "
                + "VALUES (dbo.getIdAccountADNext(),?,?,?,?,?,?,?)";
        }
        else 
            sql="INSERT INTO Account (idAccount, sdt, cccd, passWords, chucVu, queQuan, hoVaTen, gioiTinh)"
                + "VALUES (dbo.getIdAccountUserNext(),?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, user.getSdt());
            preparedStatement.setString(2, user.getCccd());
            preparedStatement.setString(3, user.getPassWords());
            preparedStatement.setString(4, user.getChucVu());
            preparedStatement.setString(5, user.getQueQuan());
            preparedStatement.setString(6, user.getHoVaTen());
            preparedStatement.setString(7, user.getGioiTinh());
            
            preparedStatement.execute();
        }
        catch (SQLException e){
            System.out.println(e);
            System.out.println("Sai tại add user");
        }
            
    }
     
     
}
