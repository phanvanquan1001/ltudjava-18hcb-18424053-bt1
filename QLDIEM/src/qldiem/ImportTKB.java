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
public class ImportTKB extends function{
    
     public static void main(String[] args) {
        function lop = new function();
        lop.importfile("tkb18.CSV", "tkb18OUT.CSV");
    }
}
