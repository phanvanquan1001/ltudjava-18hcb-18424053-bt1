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

/**
 *
 * @author minhq
 */
public class ImportDSL17HCB extends function {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        function lop = new function();
        lop.importfile("17HCB.CSV", "17HCBOUT.CSV");
    }
}
