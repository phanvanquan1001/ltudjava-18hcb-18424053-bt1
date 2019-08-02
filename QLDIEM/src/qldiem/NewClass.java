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
/**
 *
 * @author minhq
 */
class NewClass {
    void showfile( String  namefile) {
        try {
     //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
     
            String currentDirectory = System.getProperty("user.dir")+ "\\"+ namefile;
            File f = new File(currentDirectory );
            System.out.println(currentDirectory);
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
            File f = new File(currentDirectory );
            System.out.println(currentDirectory);
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f), "UTF8"));
            String line;
            while ((line = br.readLine()) != null){
                
                String[] output = line.split(",");
                if (MSSV == output[0])
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
            File input = new File(inputDirectory );
            File output = new File(outputDirectory );
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
     
     int login( String  username, String password, String filename) {
        try {
     //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
                               
            String currentDirectory = System.getProperty("user.dir")+ "\\"+ filename;
            File f = new File(currentDirectory );
            System.out.println(currentDirectory);
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f), "UTF8"));
            String line;
            while ((line = br.readLine()) != null){
                //System.out.println(line);
                String[] output = line.split(",");
                String buffer = output[0];
                if (buffer== username){// && output[2] == password)  {
                    System.out.println(username);
                    System.out.println(password);
                    return 1;
                }
                
                    
                 
             }
            br.close();
            
         } 
        catch (IOException ex) 
        {
        System.out.println("Loi ghi file: " + ex);
        }
        return 0;
     }
     
       
}
