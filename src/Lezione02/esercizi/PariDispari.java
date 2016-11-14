/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione02.esercizi;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Legge un numero in input e stampa se pari o dispari 
 *
 * @author tss
 */
public class PariDispari {
    
    public static void main(String[] args) {
        
        String risultato;
        
        
        //crea oggetto scanner per leggere input
        Scanner s = new Scanner(System.in);
        
       
        System.out.println("inserisci il numero");
        
        
        //leggo il numero in input1
        int numero = s.nextInt();
        
        
        
        
        if ((numero % 2)==0) { risultato="il numero è pari" ;
        
        } else { risultato="il numero è dispari";
                
                }
        
        System.out.println( risultato);
    }
    
}
