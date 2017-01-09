/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione8_eccezione;

import lezione3.newpackage.*;

/**
 *
 * @author tss
 */
public class DemoApp {

    public static void main(String[] args) {

        //creo oggetto giocatore
        Giocatore g = new Giocatore("Rossi", 1);

        //creo oggetti dado, utente e banco
        Dado gDado = new Dado(35);

        Dado bancoDado = new Dado(35);
        
        Contatore contaMani= new Contatore(0,1);

        
        int nMani=0;

        while (g.saldo() > 0) {
            contaMani.conta();
            int lancioGiocatore = gDado.lancio();
            int lancioBanco = bancoDado.lancio();
            if (lancioGiocatore > lancioBanco) {
                g.vince();
            } else {
                g.perde();
            }
            System.out.println(contaMani.valoreCorrente() +" Risultato lancio: Giocatore->" + lancioGiocatore
                    + "---Banco->" + lancioBanco);
            g.stampa();

        }

    }

}
