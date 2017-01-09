/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione8_eccezione.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author tss
 */
public class WalkDir7 {
    
    public static void main(String[] args) throws IOException {
        
        
        Files.walkFileTree(Paths.get("/home/tss/Scaricati"), new PrintFileVisitor());
        
    }

}
    

