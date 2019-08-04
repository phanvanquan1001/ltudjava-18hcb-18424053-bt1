/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qldiem;

/**
 *
 * @author minhq
 */
public class ImportTKB extends file{
    
     public static void main(String[] args) {
        file f = new file();
        f.importfile("tkb18.CSV", "tkb18OUT.CSV");
    }
}
