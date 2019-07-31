/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qldiem;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author minhq
 */
public class Longin {
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
            System.out.println("đăng nhập thành công");
        }
        }
        catch(Exception e){
            System.out.println("Kết nối thất bại");
        }
}
