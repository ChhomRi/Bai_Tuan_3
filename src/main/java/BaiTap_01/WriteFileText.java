/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BaiTap_01;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class WriteFileText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<SanPham> ds = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //Nhập thông tin 3 sản phẩm
        for (int i = 0; i < 3; i++){
        System.out.print("Nhap ma so san pham:");
        String MaSo = sc.nextLine();
        System.out.print("Nhap ten san pham:");
        String ten = sc.nextLine();
        System.out.print("Nhap gia san pham");
        float gia = Float.parseFloat(sc.nextLine());
        ds.add(new SanPham(MaSo, ten, gia));
        
        
        }
        try {
            //Tạo luồng ghi file
            FileWriter fw = new FileWriter("SanPham.txt");
            //Ghi từng san phẩm vào file với mỗi dòng là một sản phẩm
            for (SanPham sp : ds){
                fw.write(sp.toString() + "\n");
                
            }
            //đống luồng
            fw.close();
            System.out.println("Da ghi xong danh sach san pham vao SanPham.txt");
            
        } catch (Exception ex) {
            System.out.println("Loi xay ra:" + ex.toString());
            System.out.println("Ghi file that bai");
        }
    }
    
}
