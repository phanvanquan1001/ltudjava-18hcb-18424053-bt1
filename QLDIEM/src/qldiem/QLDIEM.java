/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qldiem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.io.FileWriter;
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
public class QLDIEM{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        NewClass lop = new NewClass(); 
        Scanner scanner = new Scanner(System.in);
        int 17HCB = 0;
        int 18HCB =0;
        int giaovu =0 ;
        String username ;
        
        while(true)
        {
            System.out.println("Moi ban dang nhap\n");
            System.out.println("Username: ");
            username = scanner.next();
            System.out.println("Password: ");
            String password = scanner.next();        
            17HCB =lop.login(username, password, "17HCB.csv");
            18HCB = lop.login(username, password, "18HCB.csv");
            //giaovu = lop.login(username, password, "giaovu.csv");
            if (17HCB==1 || 18HCB==1 || giaovu== 1 ) break;
            else {
                System.out.println("Vui lòng kiểm tra lại username hoặc password");
            }
        }
        if(17HCB ==1 | 18HCB ==1){
            while(true){
                System.out.println("CHÀO MỪNG ĐẾN VỚI CỔNG LÀM VIỆC CỦA GIÁO VỤ\n");
         
                System.out.println("Chọn Chức Năng\n");
                System.out.println("1: Xem Điểm Môn Java\n");
                System.out.println("2: Xem Điểm Môn KCPM\n");
                System.out.println("3: Xem Điểm Môn MMT\n");
                System.out.println("4: Xem Điểm Môn TKGD\n");
                
                
                int value = scanner.nextInt();
                
                switch (value) {
                case 1:
                lop.showinfor(username,"danhsachJava.csv");
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break;
                case 2:
                lop.showinfor(username, "danhsachKCPM.csv");         
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break;
                case 3:
                lop.showinfor(username, "danhsachMMT.csv");         
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break;
                case 4:
                lop.showinfor(username, "danhsachTKGD.csv");         
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break;
                }
        
        
        
        
        
         
        }
    }
    
}
