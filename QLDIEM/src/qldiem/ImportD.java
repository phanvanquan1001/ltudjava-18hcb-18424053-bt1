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
public class ImportD {
      public static void main(String[] args) {
        NewClass lop = new NewClass();
        lop.importfile("Diem.CSV", "DiemOUT.CSV");
    }
}
