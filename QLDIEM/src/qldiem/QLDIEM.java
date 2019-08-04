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
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author minhq
 */
public class QLDIEM{

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        function lop = new function(); 
        file f = new file();
        Scanner scanner = new Scanner(System.in);
        int khoa2017 = 0;
        int khoa2018 =0;
        int giaovu =0 ;
        String username ;
        String MSSV;
        String username1;
        String password;
        System.out.println("Moi ban dang nhap\n");
        
        while(true)
        {
            System.out.println("Username:\n");
            username1 = scanner.next();
            System.out.println("Password:\n");
            password = scanner.next();        
            khoa2017 =lop.login(username1, password, "17HCB.csv");
            khoa2018 = lop.login(username1, password, "18HCB.csv");
            giaovu = lop.login(username1, password, "giaovu.csv");
            username = username1;
            if (khoa2017==1 || khoa2018==1 || giaovu== 1 ){
                System.out.println("dang nhap thanh cong");
                
            }
            else {
                System.out.println("ban da nhap sai username hoac password");
            }
        
        
        if(khoa2017 ==1 | khoa2018 ==1){
            while(true){
                System.out.println("moi ban nhap tinh nang\n");
                System.out.println("0: de dang xuat\n");
                System.out.println("1: Xem Điểm\n");
                
                
                int value = scanner.nextInt();
                if (value==0) break;
                switch (value) {
                case 1:
                f.showinfor(username,"DiemJAVA.csv");
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break;
                
                }
            
            }
        }
        
        
        
        
        
        
        
        if(giaovu == 1 ){
            while(true){
                System.out.println("moi ban nhap tinh nang\n");
                System.out.println("0: an 0 de dang xuat");
                System.out.println("1: Import DSL 17HCB ");
                System.out.println("2: Import DSL 18HCB");
                System.out.println("3: Xem Điểm");
                System.out.println("4: Xóa SV");
                System.out.println("5: Sửa điểm SV");
                System.out.println("6: Thêm SV Vào Lớp");
                System.out.println("7: Tổng kết môn học");
                System.out.println("8: Đổi mật khẩu");
                System.out.println("9: Danh Sách SV");
		System.out.println("10: TKB");
                              
                
                
                int value = scanner.nextInt();
                if (value==0) break;
                String fileinput;
                
                switch (value) {
                case 1:
                fileinput = scanner.next();
                    f.importfile( fileinput,"17HCBOUT.csv");
                        //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                    break;
                case 2:
                fileinput = scanner.next();
                        //lop.showinfor(username, "danhsachKCPM.csv");         
                    f.importfile(fileinput, "18HCBOUT.csv"); 
                    break;

                case 3:
                    System.out.println("Import bang diem //Moi nhap lop can xem diem (Diem18HCB-CTT001.csv) ");
                    fileinput = scanner.next();
                    f.showfile(fileinput);         
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break;                  
                    
                case 4:
                    System.out.println("Nhap MaSV Can Xoa");
                    
                    MSSV = scanner.next();
                    System.out.println("Nhap Lop Co SV n Xoa (17HCB.csv , 18HCB.csv");
                    fileinput = scanner.next();
                    lop.remove(MSSV,fileinput );         
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break;
                case 5:
                    System.out.println("Nhap SV Can Sua Diem");
                    
                     MSSV = scanner.next();
                    System.out.println("Nhap Mon Co SV Can Sua Diem (Diem18HCB-CTT001.csv)");
                    fileinput = scanner.next();
                    lop.change(MSSV,fileinput );         
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break;
                case 6:
                    System.out.println("Them Sinh Vien vd:  18HCB.csv hoac 17HCB.csv");
                    
                    String LOP = scanner.next();
                  
                    lop.add(LOP);         
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break;                   
                case 7:
                    System.out.println("Tong Ket Mon Hoc");
                    
                    String Mon = scanner.next();
                  
                    lop.result(Mon);         
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break;  
                 case 8:
                    System.out.println("Doi Mat Khau");
                     
                     username = scanner.next();
                
                    lop.changePassword(username, "giaovu.csv");
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break; 
                    
                
                case 9:
                    System.out.println("Danh Sach SV Theo Lop ");                     
                   
                    System.out.println("Danh Sach SV Lop 17HCB");
                    f.showfile("17HCB.csv");
                    System.out.println("Danh Sach SV Lop 18HCB");
                    f.showfile("18HCB.csv");

                break; 
                case 10:
                    System.out.println("Thoi khoa bieu ");                     
                   
                    System.out.println("TKB Lop 17HCB");
                    f.showfile("TKB17HCB.csv");
                    System.out.println("TKB Lop 18HCB");
                    f.showfile("TKB18HCB.csv");
                    
                }


                    
               
            }
        }
        }   
        
   }
}

