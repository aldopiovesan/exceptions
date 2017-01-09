/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione8_eccezione;

import lezione3.newpackage.*;
import java.util.Random;

/**
 *
 * @author tss
 */
public class Dado {

    private int numeroFacce;

    //costruttore
    public Dado(int facce) {
        numeroFacce = facce;
    }

    /**
     * ritorna un numero casuale tra 1 ed il numero di facce
     *
     * @author tss
     */
    public int lancio() {
        Random rnd = new Random();
        return rnd.nextInt(numeroFacce) + 1;

    }
}
