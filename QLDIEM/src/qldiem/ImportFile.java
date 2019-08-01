/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qldiem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author minhq
 */
public class ImportFile{
    void ShowFile( String  namefile) {
        try {
     //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
     
            String currentDirectory = System.getProperty("user.dir")+"\\"+ namefile;
            File f = new File(currentDirectory );
            System.out.println(currentDirectory);
            try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f), "UTF8"))) {
                String line;
                while ((line = br.readLine()) != null){
                    System.out.println(line);
                    //String[] output = line.split(",");
                    //System.out.println(output[0]);
                }
            }
         } 
        catch (IOException ex) 
        {
        System.out.println("Loi đọc file: " + ex);
        }
    
     }
    
    
     void ImportFile( String importInput , String importOutput ) {
        try {
     //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
     
            String inputDirectory = System.getProperty("user.dir")+"\\"+ importInput;
            String outputDirectory = System.getProperty("user.dir")+"\\"+ importOutput;
            File input = new File(inputDirectory );
            File output = new File(outputDirectory );
            BufferedReader br;
            try (FileWriter fw = new FileWriter(output, true)) {
                br = new BufferedReader(new InputStreamReader(new FileInputStream(input), "UTF8"));
                String line;
                while ((line = br.readLine()) != null){
                    System.out.println(line);
                    fw.write("\n" + line);
                    
                    //String[] output = line.split(",");
                    //System.out.println(output[0]);
                }
            }
            br.close();
         } 
        catch (IOException ex) 
        {
        System.out.println("Loi ghi file: " + ex);
        }
    
     }
    
}
