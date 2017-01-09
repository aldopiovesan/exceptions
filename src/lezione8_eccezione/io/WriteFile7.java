/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione8_eccezione.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author tss
 */
public class WriteFile7 {

    public static void main(String[] args) throws IOException {

        String source = "titigigifgifofgofg \n gkghkfkgfkf";

        Files.write(Paths.get("/home/tss/nuovofile.txt"),
                source.getBytes(),
                StandardOpenOption.CREATE);
    }

}
