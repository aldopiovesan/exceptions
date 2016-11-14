/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione02.esercizi;

import java.util.Scanner;

/**
 * leggi numero input e stampa se è primo o no
 *
 * @author tss
 */
public class NumeroPrimo {

    public static void main(String[] args) {

        String risultato;
        int indice = 0;
        int indiceDue = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("inserisci numero");

        int numero = s.nextInt();

        while (indice < numero) {
            indice += 2;
        }

        while (indiceDue < numero) {
            indiceDue += 3;
        }

        if (indice == numero && indice != 2) {
            System.out.println("il numero nn è primo");

        } else {
            if (numero == indiceDue && indiceDue!=3) {
                System.out.println("il numero nn è primo");

            } else {
                System.out.println("il numero è primo");

            }

        }
    }
}
