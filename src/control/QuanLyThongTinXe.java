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
                
            }
            return listTTX;
        }
        catch(SQLException e){
            System.out.println("lỗi lấy toàn bộ ttx");
        }
        return null;
    }
    
    public void addTTX(ThongTinXe ttx){
        Connection con = GetConnectServer.getConnection();
        String sql = "Insert into ThongTinXe(idThongTinXe,idLoaiXeNo, mauSon, nhanHieu, soLoai, theLoaiDangKi, liDo)"
                + "values (dbo.getIdThongTinXeNext(),?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, ttx.getIdLoaiXeNo());
            preparedStatement.setString(2,ttx.getMauSon());
            preparedStatement.setString(3, ttx.getNhanHieu());
            preparedStatement.setString(4,ttx.getSoLoai());
            preparedStatement.setString(5,ttx.getTheLoaiDangKi());
            preparedStatement.setString(6, ttx.getLiDo());
            
            preparedStatement.execute();
            
        } catch (SQLException e) {
            System.out.println("Lỗi tại add ttx");
        }
    }
    
    
}
