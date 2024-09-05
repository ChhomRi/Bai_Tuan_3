/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap_01;

/**
 *
 * @author ADMIN
 */
public class SanPham {
    private String MaSo;
    private String Ten;
    private float Gia;

    public SanPham(String MaSo, String Ten, float Gia) {
        this.MaSo = MaSo;
        this.Ten = Ten;
        this.Gia = Gia;
    }

    public String getMaSo() {
        return MaSo;
    }

    public void setMaSo(String MaSo) {
        this.MaSo = MaSo;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public float getGia() {
        return Gia;
    }

    public void setGia(float Gia) {
        this.Gia = Gia;
    }

    @Override
    public String toString() {
         return MaSo + " - " + Ten + " - " + Gia;
    }
    
    
}
