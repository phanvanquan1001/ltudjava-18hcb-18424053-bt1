/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qldiem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.FileOutputStream;

/**
 *
 * @author minhq
 */
public class file {
    Scanner scanner = new Scanner(System.in);
     void showfile( String  namefile) {
        try {
     //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
     
            String currentDirectory = System.getProperty("user.dir")+ "\\"+ namefile;
            java.io.File f = new java.io.File(currentDirectory );
            //System.out.println(currentDirectory);
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f), "UTF8"));
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                //String[] output = line.split(",");
                //System.out.println(output[0]); 
             }
            br.close();
         } 
        catch (IOException ex) 
        {
        System.out.println("Loi ghi file: " + ex);
        }
    
     }
    
        int showinfor( String MSSV ,String  namefile) {
        try {
     //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
     
            String currentDirectory = System.getProperty("user.dir")+ "\\"+ namefile;
            java.io.File f = new java.io.File(currentDirectory );
            //System.out.println(currentDirectory);
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f), "UTF8"));
            String line;
            while ((line = br.readLine()) != null){
                
                String[] output = line.split(",");
                if (MSSV.equals(output[0]))
                {
                    System.out.println(line);
                    return 1;
                }
                //System.out.println(output[0]); 
             }
            br.close();
         } 
        catch (IOException ex) 
        {
        System.out.println("Loi ghi file: " + ex);
        }
        return 0;
     }
     void importfile( String importInput , String importOutput ) {
        try {
     //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
     
            String inputDirectory = System.getProperty("user.dir")+ "\\"+ importInput;
            String outputDirectory = System.getProperty("user.dir")+ "\\"+ importOutput;
            java.io.File input = new java.io.File(inputDirectory );
            java.io.File output = new java.io.File(outputDirectory );
            FileWriter fw = new FileWriter(output, true);
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(input), "UTF8"));
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                fw.write("\n" + line);
                
                //String[] output = line.split(",");
                //System.out.println(output[0]); 
             }
            fw.close();
            br.close();
         } 
        catch (IOException ex) 
        {
        System.out.println("Loi ghi file: " + ex);
        }
    
     }
}
