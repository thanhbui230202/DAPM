/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import connect.GetConnectServer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ThongTinXe;

/**
 *
 * @author OS
 */
public class QuanLyThongTinXe {
    public static List<ThongTinXe> runSQLreturnListTTX(String sql){
        List<ThongTinXe> listTTX = new ArrayList<>();
        Connection con = GetConnectServer.getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next())
            {
                ThongTinXe ttx = new ThongTinXe();
                ttx.setIdThongTinXe(rs.getString("idThongTinXe"));
                ttx.setIdLoaiXeNo(rs.getString("idLoaiXeNo"));
                ttx.setSoLoai(rs.getString("soLoai"));
                ttx.setMauSon(rs.getString("mauSon"));
                ttx.setTheLoaiDangKi(rs.getString("theLoaiDangKi"));
                ttx.setLiDo(rs.getString("liDo"));
                ttx.setIdAccount(rs.getString("idAccount"));
                ttx.setNhanHieu(rs.getString("nhanHieu"));
                
                listTTX.add(ttx);
            }
            return listTTX;
        }
        catch(SQLException e){
            System.out.println("lỗi lấy toàn bộ ttx 1");
        }
        return null;
    }
    
    public void addTTX(ThongTinXe ttx){
        Connection con = GetConnectServer.getConnection();
        String sql = "Insert into ThongTinXe(idThongTinXe,idLoaiXeNo, mauSon, nhanHieu, soLoai, theLoaiDangKi, liDo, idAccount)"
                + "values (dbo.getIdThongTinXeNext(),?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, ttx.getIdLoaiXeNo());
            preparedStatement.setString(2,ttx.getMauSon());
            preparedStatement.setString(3, ttx.getNhanHieu());
            preparedStatement.setString(4,ttx.getSoLoai());
            preparedStatement.setString(5,ttx.getTheLoaiDangKi());
            preparedStatement.setString(6, ttx.getLiDo());
            preparedStatement.setString(7, ttx.getIdAccount());
            
            preparedStatement.execute();
            
        } catch (SQLException e) {
            System.out.println("Lỗi tại add ttx");
        }
    }
    
    public List<ThongTinXe> getAllTTXByIdAccount(String id)
    {
        String sql = "select * from ThongTinXe where idAccount = '" +id+"'" ;
        List<ThongTinXe> listTTX = runSQLreturnListTTX(sql);
        return listTTX;
    }
    
    public ThongTinXe getTTXById(String id)
    {
        String sql="Select * from ThongTinXe where idThongTinXe = ?";
        ThongTinXe newTTX= new ThongTinXe();
        Connection con = GetConnectServer.getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            
            rs.next();      
            newTTX.setIdLoaiXeNo(rs.getString("idLoaiXeNo"));
            newTTX.setIdAccount(rs.getString("idAccount"));
            newTTX.setIdThongTinXe(rs.getString("idThongTinXe"));
            newTTX.setMauSon(rs.getString("mauSon"));
            newTTX.setNhanHieu(rs.getString("nhanHieu"));
            newTTX.setSoLoai(rs.getString("soLoai"));
            newTTX.setTheLoaiDangKi(rs.getString("theLoaiDangKi"));
            newTTX.setLiDo(rs.getString("liDo"));
            
            return newTTX;
        } catch (SQLException e) {
            System.out.println("lỗi tại get ttx by id");
        }
        return null;
    }
    public void delTTX(String id){
        Connection con = GetConnectServer.getConnection();
        String sql = "DELETE ThongTinXe "
                + "where idThongTinXe = ?";
        try{
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, id);
            preparedStatement.execute();
        }
        catch(SQLException e){
            System.out.println("lỗi tại xóa theo idTTX");
        }
    }
    
    public void updateTTX(ThongTinXe ttx)
    {
        Connection con = GetConnectServer.getConnection();
        String sql = "Update ThongTinXe set idLoaiXeNo = ?, mauSon = ?, nhanHieu =?, soLoai =?,theLoaiDangKi=?,liDo=? where idThongTinXe = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, ttx.getIdLoaiXeNo());
            preparedStatement.setString(2, ttx.getMauSon());
            preparedStatement.setString(3, ttx.getNhanHieu());
            preparedStatement.setString(4, ttx.getSoLoai());
            preparedStatement.setString(5, ttx.getTheLoaiDangKi());
            preparedStatement.setString(6, ttx.getLiDo());
            preparedStatement.setString(7, ttx.getIdThongTinXe());
            
            preparedStatement.execute();
        } catch (SQLException e) {
             System.out.println("Sai tại cập nhật dữ liệu ttx");
        }
 
    }
    
    public List<String> getIdThongTinXeById(String id)
    {
        List<String> allThongTinXe = new ArrayList<>();
        Connection con = GetConnectServer.getConnection();
        String sql = "select idThongTinXe from ThongTinXe where idAccount = '" +id +"'";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet rs =  preparedStatement.executeQuery();
            while(rs.next())
            {
                allThongTinXe.add(rs.getString("idThongTinXe"));
            }
        } catch (SQLException e) {
            System.out.println("Lỗi tại lấy tên thông tin xe");
        }
        return allThongTinXe;
    }
}
