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
        // TODO code application logic here
        ArrayList<NewClass> mang = new ArrayList();
        NewClass lop = new NewClass(); 
        Scanner scanner = new Scanner(System.in);
        int HCB17 = 0;
        int HCB18 =0;
        int giaovu =0 ;
        String username ;
        String password ;
        
        while(true)
        {
            System.out.println("Vui lòng dang nhap\n");
            System.out.println("Username: ");
            username = scanner.next();
            System.out.println("Password: ");
            password = scanner.next();        
            HCB17 =lop.login(username, password, "17HCB.csv");
            HCB18 = lop.login(username, password, "18HCB.csv");
            //giaovu = lop.login(username, password, "giaovu.csv");
            if (HCB17==1 || HCB18==1 || giaovu== 1 ) break;
            else {
                System.out.println("Vui lòng kiểm tra lại username hoặc password");
            }
        }
        if(HCB17 ==1 | HCB18 ==1){
            while(true){
                System.out.println("CHÀO MỪNG ĐẾN VỚI TRANG XEM ĐIỂM CỦA SINH VIÊN\n");
         
                System.out.println("Chọn Chức Năng\n");
                System.out.println("0: Đăng Xuất");
                System.out.println("1: Xem Điểm Môn Java\n");
                System.out.println("2: Xem Điểm Môn KCPM\n");
                System.out.println("3: Xem Điểm Môn MMT\n");
                System.out.println("4: Xem Điểm Môn TKGD\n");
                
                
                int value = scanner.nextInt();
                
                if (value==0) break;
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
        
        if(giaovu ==1 ){
            while(true){
                System.out.println("Chọn Chức Năng");
                System.out.println("moi ban nhap tinh nang\n");
                System.out.println("0: an 0 de dang xuat");
                System.out.println("1: import DSlop 17HCB");
                System.out.println("2: import DSlop 18HCB");
                System.out.println("3: xem diem mon cac mon");
                System.out.println("4: nhap ma so sinh vien de remove khoi mon nao do");
                System.out.println("5: Sua diem sinh vien theo ma so va mon hoc");
                System.out.println("6: Them sinh vien vao danh sach lop");
                System.out.println("7: Tong ket mon hoc");
                System.out.println("8: Doi mat khau");
            Scanner a = new Scanner(System.in);
            int chon = a.nextInt();
            NewClass b = null;
            if (chon == 1) {
                b = new HSCap1();
            }
            if (chon == 2) {
                b = new HSCap2();
                
                
                
                int value = scanner.nextInt();
                if (value==0) break;
                String fileinput;
                switch (value) {
                case 1:
                   
                fileinput = scanner.next();
                    lop.importfile( fileinput,"khoa2017.csv");
                        //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                    break;
                case 2:
                fileinput = scanner.next();
                        //lop.showinfor(username, "danhsachKCPM.csv");         
                    lop.importfile(fileinput, "khoa2018.csv"); 
                    break;

                case 3:
                    System.out.println("Import bang diem //Moi ban nhap lop ma ban can xem diem theo thu tu sau: danhsachJAVA.csv, danhsachKCPM.csv, danhsachMMT.csv, danhsachTKGD.csv ");
                    fileinput = scanner.next();
                    lop.showfile(fileinput);         
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break;                  
                    
                case 4:
                    System.out.println("moi ban nhap maso sinh vien de remove");
                    
                    MSSV = scanner.next();
                    System.out.println("moi ban ten mon ma can remove theo ten danhsachJAVA.csv, danhsachKCPM.csv, danhsachMMT.csv, danhsachTKGD.csv");
                    fileinput = scanner.next();
                    lop.remove(MSSV,fileinput );         
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break;
                case 5:
                    System.out.println("moi ban nhap maso sinh vien de sua diem");
                    
                     MSSV = scanner.next();
                    System.out.println("moi ban ten mon ma can sua diem theo ten danhsachJAVA.csv, danhsachKCPM.csv, danhsachMMT.csv, danhsachTKGD.csv");
                    fileinput = scanner.next();
                    lop.change(MSSV,fileinput );         
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break;
                case 6:
                    System.out.println("Moi ban them sinh vien vao he thong vd:  khoa2018.csv hoac 2017.csv");
                    
                    String LOP = scanner.next();
                  
                    lop.add(LOP);         
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break;                   
                case 7:
                    System.out.println("tong ket theo mon - danhsachJAVA.csv, danhsachKCPM.csv, danhsachMMT.csv, danhsachTKGD.csv ");
                    
                    String Mon = scanner.next();
                  
                    lop.result(Mon);         
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break;  
                 case 8:
                    System.out.println("Doi mat khau khoa 2017 hoac 2018");
                     
                     MSSV = scanner.next();
                  
                    lop.changePassword(MSSV,"khoa2017.csv");
                    lop.changePassword(MSSV,"khoa2018.csv");
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break; 
                    
                }
            
            }
        }
    }
}
