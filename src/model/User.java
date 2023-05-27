/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author OS
 */
public class User {
    private String idAccount;
    private String sdt;
    private String cccd;
    private String passWords;
    private String chucVu;
    private String queQuan;
    private String hoVaTen;
    private String gioiTinh;

    public User() {
    }

    public User(User user){
        this.idAccount = user.idAccount;
        this.sdt = user.sdt;
        this.cccd = user.cccd;
        this.passWords = user.passWords;
        this.chucVu = user.chucVu;
        this.queQuan = user.queQuan;
        this.hoVaTen = user.hoVaTen;
        this.gioiTinh = user.gioiTinh;
    }

    public User(String idAccount, String sdt, String cccd, String passWords, String chucVu, String queQuan, String hoVaTen, String gioiTinh) {
        this.idAccount = idAccount;
        this.sdt = sdt;
        this.cccd = cccd;
        this.passWords = passWords;
        this.chucVu = chucVu;
        this.queQuan = queQuan;
        this.hoVaTen = hoVaTen;
        this.gioiTinh = gioiTinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    
    public String getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(String idAccount) {
        this.idAccount = idAccount;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getPassWords() {
        return passWords;
    }

    public void setPassWords(String passWords) {
        this.passWords = passWords;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }
    
    
}
