/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione02.esercizi;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class PariDispariTernario {
    
    public static void main(String[] args) {
        
        
        String risultato;
        
         //crea oggetto scanner per leggere input
        Scanner s = new Scanner(System.in);
        boolean verifica =true;
        
        
       
        System.out.println("inserisci il numero");
        
        
        //leggo il numero in input1
        int numero = s.nextInt();
        
        
        risultato = ((numero % 2)==0) ? "numero pari" : "numero dispari";
        
        System.out.println(risultato);
        
        
        
        
    }
    
}
