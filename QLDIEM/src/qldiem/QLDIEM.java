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
                lop.showinfor(username,"DiemJAVA.csv");
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
                String fileoutput;
                switch (value) {
                case 1:
                fileinput = scanner.next();
                    lop.importfile( fileinput,"17HCBOUT.csv.csv");
                        //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                    break;
                case 2:
                fileinput = scanner.next();
                        //lop.showinfor(username, "danhsachKCPM.csv");         
                    lop.importfile(fileinput, "18HCBOUT.csv"); 
                    break;

                case 3:
                    System.out.println("Import bang diem //Moi nhap lop can xem diem (Diem18HCB-CTT001.csv) ");
                    fileinput = scanner.next();
                    lop.showfile(fileinput);         
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break;                  
                    
                case 4:
                    System.out.println("Nhập MaSV cần Xóa");
                    
                    MSSV = scanner.next();
                    System.out.println("Nhập Lớp có SV cần Xóa (17HCB.csv , 18HCB.csv");
                    fileinput = scanner.next();
                    lop.remove(MSSV,fileinput );         
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break;
                case 5:
                    System.out.println("Nhập MaSV cần sửa điểm");
                    
                     MSSV = scanner.next();
                    System.out.println("Nhập môn có SV cần sửa điểm (Diem18HCB-CTT001.csv)");
                    fileinput = scanner.next();
                    lop.change(MSSV,fileinput );         
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break;
                case 6:
                    System.out.println("Thêm sinh viên vào  hệ thống vd:  18HCB.csv hoac 17HCB.csv");
                    
                    String LOP = scanner.next();
                  
                    lop.add(LOP);         
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break;                   
                case 7:
                    System.out.println("Tổng kết môn học");
                    
                    String Mon = scanner.next();
                  
                    lop.result(Mon);         
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break;  
                 case 8:
                    System.out.println("Đổi mật khẩu");
                     
                     MSSV = scanner.next();
                  
                    lop.changePassword(MSSV,"khoa2017.csv");
                    lop.changePassword(MSSV,"khoa2018.csv");
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break; 
                    
                
                case 9:
                    System.out.println("Nhập tên khóa học+.csv.   vd: 18HCB.csv   \n Hoặc Thời Khóa Biểu vd: TKB18HCB.csv ");                     
                    String khoa = scanner.next(); 
                    lop.showfile(khoa);

                break; 
                    
                }


                    
               
            }
        }
        }   
        
   }
}

