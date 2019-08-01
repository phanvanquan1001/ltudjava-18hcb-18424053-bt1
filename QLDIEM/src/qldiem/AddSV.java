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
public class AddSV extends SV {
     public void nhap()
    {
        System.out.println("Moi Nhap Ma: ");
        Scanner a = new Scanner(System.in);
        this.MaSV=a.nextLine();
        
        System.out.println("Moi Nhap ten: ");
        Scanner b = new Scanner(System.in);
        this.HoTen=b.nextLine();
        
        System.out.println("Mời Nhập điểm GK: ");
        Scanner c = new Scanner(System.in);
        this.DGK=c.nextDouble();
        
        System.out.println("Mời Nhập Điểm CK: ");
        Scanner d= new Scanner(System.in);
        this.DCK=d.nextDouble();
        
        System.out.println("Mời Nhập Điểm Khác: ");
        Scanner e=new Scanner(System.in);
        this.DKhac=e.nextDouble();
        
        
    }
}
