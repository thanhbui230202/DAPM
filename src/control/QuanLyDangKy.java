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
import model.DangKiBienSo;

/**
 *
 * @author OS
 */
public class QuanLyDangKy {
    public List<DangKiBienSo> runSQLReturnListDangKi(String sql){
        List<DangKiBienSo> listDangKi = new ArrayList<>();
        Connection con = GetConnectServer.getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next())
           {
               DangKiBienSo dangKiMoi = new DangKiBienSo();
               
               dangKiMoi.setIdDangKi(rs.getString("idDangKi"));
               dangKiMoi.setIdThongTinXeNo(rs.getString("idThongTinXeNo"));
               dangKiMoi.setTenChuXe(rs.getString("tenChuXe"));
               dangKiMoi.setCccdChuXe(rs.getString("cccdChuXe"));
               dangKiMoi.setDiaChi(rs.getString("diaChi"));
               dangKiMoi.setGmailChuXe(rs.getString("gmailChuXe"));
               dangKiMoi.setIdAccountDangKi(rs.getString("idAccountDangKi"));
               dangKiMoi.setIdAccountDuyet(rs.getString("idAccountDuyet"));
               dangKiMoi.setMaHoSoKhaiLePhiTruocBa(rs.getString("maHoSoKhaiLePhiTruocBa"));
               dangKiMoi.setMaSoThue(rs.getString("maSoThue"));
               dangKiMoi.setNamsinh(rs.getString("namSinh"));
               dangKiMoi.setSdtNLTT(rs.getString("sdtNLTT"));
               dangKiMoi.setSoHoaDonDienTu(rs.getString("soHoaDonDienTu"));
               dangKiMoi.setSoSeriKTCLXX(rs.getString("soSeriKTCLXX"));
               dangKiMoi.setSoToKhaiHaiQuan(rs.getString("soToKhaiHaiQuan"));
               dangKiMoi.setTinhTrangDangKi(rs.getString("tinhTrangDangKi"));               
               dangKiMoi.setBienSoXe(rs.getString("bienSoXe"));
               
               listDangKi.add(dangKiMoi);
           }
            return listDangKi;
        } catch (SQLException e) {
            System.out.println("Lỗi lấy toàn bộ đăng kí");
        }
        return null;
    }
    
    public List<DangKiBienSo> getAllDangKi(){
        String sql = "select * from DangKiBienSo";
        List<DangKiBienSo> listDK = runSQLReturnListDangKi(sql);
        return listDK;
    }
    
    public List<DangKiBienSo> getAllDangKi(String trangthai1, String trangthai2){
        String sql = "";
        if(trangthai1.equals("DD") & trangthai2.equals("KD"))
        {
            sql = "select * from DangKiBienSo where tinhTrangDangKi = 'DD' or tinhTrangDangKi = 'KD'";
        }
        else
            if(trangthai1.equals("DD") && trangthai2.equals("CD"))
            {
                sql = "select * from DangKiBienSo where tinhTrangDangKi = 'DD' or tinhtrangdangki = 'CD'";
            }
            else
            if(trangthai1.equals("KD") && trangthai2.equals("CD"))
            {
                sql = "select * from DangKiBienSo where tinhTrangDangKi = 'KD' or tinhtrangdangki = 'CD'";
            }
        List<DangKiBienSo> listDangKi = runSQLReturnListDangKi(sql);
        return listDangKi;
    }

    public List<DangKiBienSo> getAllDangKi(String trangthai){
        String sql = "";
        if(trangthai.equals("DD"))
        {
            sql = "select * from DangKiBienSo where tinhTrangDangKi = 'DD'";
        }
        else
            if(trangthai.equals("KD"))
            {
                sql = "select * from DangKiBienSo where tinhTrangDangKi = 'KD'";
            }
            else
                sql = "select * from DangKiBienSo where tinhTrangDangKi = 'CD'";
        List<DangKiBienSo> listDangKi = runSQLReturnListDangKi(sql);
        return listDangKi;
    }
    
    public List<DangKiBienSo> getAllDangKisdt_ten_cccd(String tim){
        String sql = "Select * from DangKiBienSo where (idDangKi like N'%" + tim + "%')"
                + "or (tenChuXe like N'%" + tim +"%') or (cccdChuXe like N'%" + tim + "%') ";
        List<DangKiBienSo> listDK = runSQLReturnListDangKi(sql);
        return listDK;
    }
    
    public void addDangKi(DangKiBienSo dk){
         Connection con = GetConnectServer.getConnection();
         String sql = "insert into DangKiBienSo(idDangKi,tenChuXe,namSinh, diaChi, cccdChuXe, sdtNLTT, soHoaDonDienTu, maSoThue,"
                 + "maHoSoKhaiLePhiTruocBa,soToKhaiHaiQuan,soSeriKTCLXX,gmailChuXe,idThongTinXeNo,tinhTrangDangKi,idAccountDangKi,idAccountDuyet,bienSoXe"
         + "VALUES(dbo.getIdDangKiNext(),?,?,?,?,?,?,?,?,?,?,?,?,'CD',?,?,?)";
         try {
           PreparedStatement preparedStatement = con.prepareStatement(sql);
           preparedStatement.setString(1, dk.getTenChuXe());
           preparedStatement.setString(2, dk.getNamsinh());
           preparedStatement.setString(3, dk.getDiaChi());
           preparedStatement.setString(4, dk.getCccdChuXe());
           preparedStatement.setString(5, dk.getSdtNLTT());
           preparedStatement.setString(6, dk.getSoHoaDonDienTu());
           preparedStatement.setString(7, dk.getMaSoThue());
           preparedStatement.setString(8, dk.getMaHoSoKhaiLePhiTruocBa());
           preparedStatement.setString(9, dk.getSoToKhaiHaiQuan());
           preparedStatement.setString(10, dk.getSoSeriKTCLXX());
           preparedStatement.setString(11, dk.getGmailChuXe());
           preparedStatement.setString(12, dk.getIdThongTinXeNo());
           preparedStatement.setString(13, dk.getIdAccountDangKi());
           preparedStatement.setString(14, dk.getIdAccountDuyet());
           preparedStatement.setString(15, dk.getBienSoXe());
           
           preparedStatement.execute();
        } catch (SQLException e) {
             System.out.println("Lỗi add Đăng kí");
        }
    }
    
    public void delDangKi(String id){
        Connection con = GetConnectServer.getConnection();
        String sql = "DELETE DangKiBienSo "
                + "where idDangKi = ?";
        try{
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, id);
            preparedStatement.execute();
        }
        catch(SQLException e){
            System.out.println("lỗi tại xóa theo id");
        }
    }
    
    public DangKiBienSo getDangKiById(String id){
        Connection con = GetConnectServer.getConnection();
        DangKiBienSo dangKiMoi = new DangKiBienSo();
        String sql = "select * from DangKiBienSo where idDangKi = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, id);
           
            ResultSet rs = preparedStatement.executeQuery();
           
            rs.next();
            dangKiMoi.setIdDangKi(rs.getString("idDangKi"));
            dangKiMoi.setIdThongTinXeNo(rs.getString("idThongTinXeNo"));
            dangKiMoi.setTenChuXe(rs.getString("tenChuXe"));
            dangKiMoi.setCccdChuXe(rs.getString("cccdChuXe"));
            dangKiMoi.setDiaChi(rs.getString("diaChi"));
            dangKiMoi.setGmailChuXe(rs.getString("gmailChuXe"));
            dangKiMoi.setIdAccountDangKi(rs.getString("idAccountDangKi"));
            dangKiMoi.setIdAccountDuyet(rs.getString("idAccountDuyet"));
            dangKiMoi.setMaHoSoKhaiLePhiTruocBa(rs.getString("maHoSoKhaiLePhiTruocBa"));
            dangKiMoi.setMaSoThue(rs.getString("maSoThue"));
            dangKiMoi.setNamsinh(rs.getString("namSinh"));
            dangKiMoi.setSdtNLTT(rs.getString("sdtNLTT"));
            dangKiMoi.setSoHoaDonDienTu(rs.getString("soHoaDonDienTu"));
            dangKiMoi.setSoSeriKTCLXX(rs.getString("soSeriKTCLXX"));
            dangKiMoi.setSoToKhaiHaiQuan(rs.getString("soToKhaiHaiQuan"));
            dangKiMoi.setTinhTrangDangKi(rs.getString("tinhTrangDangKi")); 
            dangKiMoi.setBienSoXe(rs.getString("bienSoXe"));
            
            return dangKiMoi;
        } catch (SQLException e) {
            System.out.println("lỗi tại getDKById");
        }
        return null;
    }
    
    public void updateTinhTrangDangKi_DaDuyet(String idDangKi, String idNguoiDuyet){
        Connection con = GetConnectServer.getConnection();
        String sql = "update DangKiBienSo set tinhTrangDangKi = 'DD', idAccountDuyet = ? where idDangKi = ?";
        try{
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, idNguoiDuyet);
            preparedStatement.setString(2, idDangKi);
            
            preparedStatement.execute();
        }
        catch(SQLException e){
            System.out.println("Lỗi update tinh trang");
        }
    }
    
    public void updateTinhTrangDangKi_KhongDuyet(String idDangKi, String idNguoiDuyet){
        Connection con = GetConnectServer.getConnection();
        String sql = "update DangKiBienSo set tinhTrangDangKi = 'KD', idAccountDuyet = ? where idDangKi = ?";
        try{
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, idNguoiDuyet);
            preparedStatement.setString(2, idDangKi);
            
            preparedStatement.execute();
        }
        catch(SQLException e){
            System.out.println("Lỗi update tinh trang");
        }
    }
    
    public int demSoLuongDangKi()
    {
        int dem = 0;
        Connection con = GetConnectServer.getConnection();
        try{
            String sql = "select count(idDangKi) from DangKiBienSo";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            
            rs.next();
            String countUser = rs.getString(1);
            dem = Integer.parseInt(countUser);
            return dem;
        }
        catch (SQLException e){
            System.out.println("Lỗi đếm");
        }
        return 0;
    }
    
    public int demSoLuongDangKiDaDuyet()
    {
        int dem = 0;
        Connection con = GetConnectServer.getConnection();
        try{
            String sql = "select count(idDangKi) from DangKiBienSo where tinhTrangDangKi = 'DD'";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            
            rs.next();
            String countUser = rs.getString(1);
            dem = Integer.parseInt(countUser);
            return dem;
        }
        catch (SQLException e){
            System.out.println("Lỗi đếm");
        }
        return 0;
    }
    public void updateBienSoXe(String idDangKi, String bienSoXe){
        Connection con = GetConnectServer.getConnection();
        String sql = "update DangKiBienSo set bienSoXe = ? where idDangKi = ?";
        try{
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, bienSoXe);
            preparedStatement.setString(2, idDangKi);
            
            preparedStatement.execute();
        }
        catch(SQLException e){
            System.out.println("Lỗi update bien so");
        }
    }
}
