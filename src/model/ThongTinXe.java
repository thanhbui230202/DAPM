/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author OS
 */
public class ThongTinXe {
    private String idThongTinXe;
    private String idLoaiXeNo;
    private String mauSon;
    private String nhanHieu;
    private String soLoai;
    private String theLoaiDangKi;
    private String liDo;

    public ThongTinXe() {
    }

    public ThongTinXe(String idThongTinXe, String idLoaiXeNo, String mauSon, String nhanHieu, String soLoai, String theLoaiDangKi, String liDo) {
        this.idThongTinXe = idThongTinXe;
        this.idLoaiXeNo = idLoaiXeNo;
        this.mauSon = mauSon;
        this.nhanHieu = nhanHieu;
        this.soLoai = soLoai;
        this.theLoaiDangKi = theLoaiDangKi;
        this.liDo = liDo;
    }

    public String getIdThongTinXe() {
        return idThongTinXe;
    }

    public void setIdThongTinXe(String idThongTinXe) {
        this.idThongTinXe = idThongTinXe;
    }

    public String getIdLoaiXeNo() {
        return idLoaiXeNo;
    }

    public void setIdLoaiXeNo(String idLoaiXeNo) {
        this.idLoaiXeNo = idLoaiXeNo;
    }

    public String getMauSon() {
        return mauSon;
    }

    public void setMauSon(String mauSon) {
        this.mauSon = mauSon;
    }

    public String getNhanHieu() {
        return nhanHieu;
    }

    public void setNhanHieu(String nhanHieu) {
        this.nhanHieu = nhanHieu;
    }

    public String getSoLoai() {
        return soLoai;
    }

    public void setSoLoai(String soLoai) {
        this.soLoai = soLoai;
    }

    public String getTheLoaiDangKi() {
        return theLoaiDangKi;
    }

    public void setTheLoaiDangKi(String theLoaiDangKi) {
        this.theLoaiDangKi = theLoaiDangKi;
    }

    public String getLiDo() {
        return liDo;
    }

    public void setLiDo(String liDo) {
        this.liDo = liDo;
    }
    
    
}
