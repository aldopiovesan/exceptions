/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione02;

/**
 *
 *
 * @author tss
 */
public class Main {

    //variabile statica
    private int colore;

    //variabile d'istanza
    private int carattere;

    /**
     * da questo metodo partirà l'esecuzione
     *
     * @param args
     */
    public static void main(String[] args) {

        // commento su una sola riga
        /*
        
        commento su piu righe
         */
        int totale = 10;
        String positivo;

        if (totale > 0) {

            //variabile locale
            int x = 5;
            positivo = "il totale è positivo";

        } else {
            int x = 10;
            positivo = "il toale è negativo";

        }

        //if ternario
        positivo = (totale > 0) ? "il totale è positivo" : "il totale è negativo";

        totale += 20;

        System.out.println("totale " + totale);

    }

}
