/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione3.newpackage;

/**
 *
 * @author tss
 */
public class DemoApp {

    public static void main(String[] args) {

        //creo oggetto giocatore
        Giocatore g = new Giocatore("Rossi", 100);

        //creo oggetti dado, utente e banco
        Dado gDado = new Dado(6);

        Dado bancoDado = new Dado(6);
        
        int nMani=0;

        while (g.saldo() > 0) {
            nMani++;
            int lancioGiocatore = gDado.lancio();
            int lancioBanco = bancoDado.lancio();
            if (lancioGiocatore > lancioBanco) {
                g.vince();
            } else {
                g.perde();
            }
            System.out.println(nMani +"Risultato lancio: Giocatore->" + lancioGiocatore
                    + "---Banco->" + lancioBanco);
            g.stampa();

        }

    }

}
