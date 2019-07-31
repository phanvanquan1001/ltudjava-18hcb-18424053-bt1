/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qldiem;

import java.util.ArrayList;
import java.util.Scanner;
/*Quan ly 1 mang hs gồm 
HSCap 1(MaHS, TenHS, DiemToan, DiemVan)
HSCap 2(MaHS, TenHS, DiemToan, DiemVan,DiemLy)
HSCap 3(MaHS, TenHS, DiemToan, DiemVan,DiemTiengAnh)
Nhap va xuat 1 mang HS.
Xuat ra xep loai cua tung HS trong mang.*/
/**
 *
 * @author minhq
 */
public class QLDIEM extends SV{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        //lấy user nhạp từ bàn phím
        System.out.print("Username: ");
        String user=sc.nextLine();
         //lấy pass nhạp từ bàn phím
        System.out.print("Password: ");
        String pass=sc.nextLine();
        try{
        if(user.equals("")||pass.equals("")){
        System.out.println("Vui lòng nhập đủ thông tin.");}
        if(user.equals("giaovu")&&pass.equals("giaovu")){
            System.out.println("Đây là chức năng dành cho Giáo Vụ");
             // TODO code application logic here
             ArrayList<SV> mang=new ArrayList();
              while (true) {
            System.out.println("Ban muon nhap gi 1. HSCap1 2. HSCap2 3. HSCap 3  4. ket thuc");
            Scanner a = new Scanner(System.in);
            int chon = a.nextInt();
            SV b = null;
            if (chon == 1) {
                b = new AddSV();
            }
            
            if (chon == 4) {
                break;
            }
            b.nhap();
            mang.add(b);

        }
        for(int i=0;i<mang.size();i++)
        {
            mang.get(i).Xuat();
            mang.get(i).xeploaiSV();
        }
          }
        
        
        else{
            System.out.println("Sai User hoặc Pass");
        }
        }
        catch(Exception e){
            System.out.println("Kết nối thất bại");
          
        }
    }
    
}
