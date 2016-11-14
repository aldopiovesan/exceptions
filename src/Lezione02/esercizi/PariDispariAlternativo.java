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
public class PariDispariAlternativo {

    public static void main(String[] args) {

        String risultato = "";

        int indice = 0;

        //crea oggetto scanner per leggere input
        Scanner s = new Scanner(System.in);

        System.out.println("inserisci il numero");

        //leggo il numero in input1
        int numero = s.nextInt();

        while (indice < numero) {
            indice += 2;

        }
         //risultato è una stringa, vengono comparati indice e numero
         risultato = indice == numero ? "numero pari" : "numero dispari";
        
        System.out.println(risultato);
        
        
                

    }

    
    
}
