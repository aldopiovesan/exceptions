/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione8_eccezione.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author tss
 */
public class CopyFile7 { //metodo x copiare file 
    
    public static void main(String[] args) throws IOException {
        
        
        Files.copy(
               Paths.get("/home/tss/scrivi.txt"),
                Paths.get("/home/tss/copia1.txt"),
                StandardCopyOption.REPLACE_EXISTING);
        
        
        
    }
    
}
