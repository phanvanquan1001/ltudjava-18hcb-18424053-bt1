/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qldiem;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;
/**
 *
 * @author minhq
 */
class function {
     Scanner scanner = new Scanner(System.in);
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
             //System.out.println(username);
             //       System.out.println(password);                  
            String currentDirectory = System.getProperty("user.dir")+ "\\text\\"+ filename;
            File f = new File(currentDirectory );
            System.out.println(currentDirectory);
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f), "UTF8"));
            String line;
            while ((line = br.readLine()) != null){
     
                String[] output = line.split(",");
                
              
               if (username.equals(output[0]))  {
            
                    if (password.equals(output[2])) return 1;
                }
            }
            br.close();
            
         } 
        catch (IOException ex) 
        {
        System.out.println("Loi ghi file: " + ex);
        }
        return 1;
     }
    

     int remove( String  username, String filename) {
        
        try {
     //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
             //System.out.println(username);
             //       System.out.println(password);                  
            String currentDirectory = System.getProperty("user.dir")+ "\\text\\"+ filename;
            String tempfile = System.getProperty("user.dir")+ "\\text\\filetemp.csv";
            File input = new File( currentDirectory);
            File temp = new File(tempfile);
            FileWriter fw = new FileWriter(temp);
            System.out.println(currentDirectory);
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(input), "UTF8"));
            String line;
            
            while ((line = br.readLine()) != null){
                String[] output = line.split(",");
                if (username.equals(output[0]))  {
                    continue;
                }
                
                fw.write(line+"\n");
             }
            System.out.println("done");
            br.close();
            fw.close();
            input.delete();
            temp.renameTo(input);
            
            
            
            showfile(filename);
            
         } 
        catch (IOException ex) 
        {
        System.out.println("Loi ghi file: " + ex);
        }
        return 0;
     }
     
    int change( String  username, String filename) {
        
        try {
     //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
             //System.out.println(username);
             //       System.out.println(password);                  
            String currentDirectory = System.getProperty("user.dir")+ "\\text\\"+ filename;
            String tempfile = System.getProperty("user.dir")+ "\\text\\filetemp.csv";
            File input = new File( currentDirectory);
            File temp = new File(tempfile);
            FileWriter fw = new FileWriter(temp);
            System.out.println(currentDirectory);
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(input), "UTF8"));
            String line;
            System.out.println("Moi ban nhap diem mon 1 ");
            float D1 = scanner.nextFloat();
               System.out.println("Moi ban nhap diem mon 2 ");
            float D2 = scanner.nextFloat();
               System.out.println("Moi ban nhap diem mon 3 ");
            float D3 = scanner.nextFloat();

            
            while ((line = br.readLine()) != null){
                String[] output = line.split(",");
                if (username.equals(output[0]))  {
                    String newline = output[0]+","+output[1]+","+D1+","+D2+","+D3+","+output[3];
                    fw.write(newline+"\n");
                    continue;
                }
                
                fw.write(line+"\n");
             }
            System.out.println("done");
            br.close();
            fw.close();
            input.delete();
            temp.renameTo(input);
            
            
            
            showfile(filename);
            
         } 
        catch (IOException ex) 
        {
        System.out.println("Loi ghi file: " + ex);
        }
        return 0;
    }
        
        int add( String filename ) {
        try {

            String inputDirectory = System.getProperty("user.dir")+ "\\text\\tempfile.csv" ;
          // FileWriter fw = new FileWriter(inputDirectory, true);
            File fileDir = new File(inputDirectory);
 
            BufferedWriter out1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileDir), "UTF8"));
            System.out.println(" nhap theo dinh dang MSSV    ,  Ho Ten   , CMND , GIOITINH");
            String line = scanner.next();
            //out.append(line).append("\r\n");
            
 
            out1.flush();
	    out1.close();    
         } 
        catch (IOException ex) 
        {
        System.out.println("Loi ghi file: " + ex);
        }
        return 1;
     }
         
void result( String  namefile) {
        try {
     //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
     
            String currentDirectory = System.getProperty("user.dir")+ "\\text\\"+ namefile;
            File f = new File(currentDirectory );
            System.out.println(currentDirectory);
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f), "UTF8"));
            String line;
            int dau =0;
            int tong =0;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                tong++;
                String[] output = line.split(",");
                int D2 = Integer.parseInt(output[2]);
                int D3 = Integer.parseInt(output[3]);
                int D4 = Integer.parseInt(output[4]);
                if (D2<5 | D3 < 5| D4<5  ){
                    continue;
                }
                else {
                    dau++;
                }
                    
                
                
             }
            System.out.println("tong so luong sinh vien: "+ tong);
            System.out.println("tong so luong sinh vien dau: "+ dau);
            System.out.println("tong so luong sinh vienrot : "+ (tong - dau));
            System.out.println("ti le sinh vien dau/rot: "+ (dau/(tong- dau)));
            br.close();
         } 
        catch (IOException ex) 
        {
        System.out.println("Loi ghi file: " + ex);
        }
    
     }
     
     
     
     
     
       int changePassword( String  username, String filename) {
        
        try {
     //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
             //System.out.println(username);
             //       System.out.println(password);                  
            String currentDirectory = System.getProperty("user.dir")+ "\\text\\"+ filename;
            String tempfile = System.getProperty("user.dir")+ "\\text\\filetemp.csv";
            File input = new File( currentDirectory);
            File temp = new File(tempfile);
            FileWriter fw = new FileWriter(temp);
            System.out.println(currentDirectory);
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(input), "UTF8"));
            String line;
            System.out.println("Moi ban nhap mat khau moi diem mon 1 ");
            float D1 = scanner.nextFloat();
 

            
            while ((line = br.readLine()) != null){
                String[] output = line.split(",");
                if (username.equals(output[0]))  {
                    String newline = output[0]+","+output[1]+","+D1+","+output[3];
                    fw.write(newline+"\n");
                    continue;
                }
                
                fw.write(line+"\n");
             }
            
            br.close();
            fw.close();
            input.delete();
            temp.renameTo(input);
            
            
            
            showfile(filename);
            
         } 
        catch (IOException ex) 
        {
        System.out.println("Loi ghi file: " + ex);
        }
        return 0;
    } 
}