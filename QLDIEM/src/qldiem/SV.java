/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qldiem;
import java.util.Scanner;
/**
 *
 * @author minhq
 */
public class SV {
    public String MaSV;
    public String HoTen;
    public String GioiTinh;
    public String CMND;
    public double DGK;
    public double DCK;
    public double DKhac;
    public void Xuat(){
     System.out.print("MaSV:" + MaSV + " TenSV:"+ HoTen + " Điểm GK:"+ DGK+ " Điểm CK:"+DCK + "Điểm khác"+DKhac);
    }
   
    public void XepLoai(double DTB){
    if(DTB>8)
        System.out.println("Giỏi");
    if(DTB>6.5&&DTB<8)
        System.out.println("Khá");
    if(DTB>5&&DTB<6.5)
        System.out.println("Trung Bình");
    if(DTB<5)
        System.out.println("Yếu");
    }
    public void xeploaiSV()
    {
        double dtb= (float)((DGK + DCK + DKhac)/3.0);
        XepLoai(dtb);
    }
}
