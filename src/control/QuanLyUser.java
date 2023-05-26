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
    public List<User> runSQLReturnListUser(String sql)
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
        
        String sql = "Select * from Account where sdt = ?, passwords = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, sdt);
            preparedStatement.setString(2, passwords);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            rs.next();      
            newUser.setIdAccount(rs.getString("idAccount"));
            newUser.setHoVaTen(rs.getString("hoVaTen"));
            newUser.setSdt(rs.getString("sdt"));
            newUser.setCccd(rs.getString("cccd"));
            newUser.setPassWords(rs.getString("passwords"));
            newUser.setChucVu(rs.getString("chucVu"));
            newUser.setQueQuan(rs.getString("queQuan"));
            
            return newUser;
        } catch (SQLException e) {
            System.out.println("lỗi check");
        }
        return null;
    }
}
