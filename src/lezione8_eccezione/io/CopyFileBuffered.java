/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione8_eccezione.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author tss
 */
public class CopyFileBuffered {

    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        BufferedWriter bw = null;

        //si potrebbe usare il try with more resources x evitare di scrivere la parte finally 
        try {
            br = new BufferedReader(new FileReader("/home/tss/scrivi.txt"));
            bw = new BufferedWriter(new FileWriter("/home/tss/tac.txt"));
            String riga;
            while ((riga = br.readLine()) != null) {

                bw.write(riga);
                bw.newLine();
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (br != null) {
                br.close();
            }
            if (bw != null) {
                bw.close();
            }
        }

    }

}
