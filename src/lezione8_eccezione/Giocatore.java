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
public class Giocatore {
    
    
    
    private String nome;
    private int soldi;
    
    
    // metodo costruttore...serve per inizzializzare una classe, uso il campo
    //inizializzo nome e credito alla costruzione del progetto

    public Giocatore(String nomeGiocatore, int credito) {
        
        if (credito<10){
            throw new GiocoDadiException("Non è possibile creare un giocatore con credito inferiore a 10");
            
        }
        nome = nomeGiocatore;
       soldi = credito;
    }
   
    
    
    
    
    
    
    public void vince(){
        soldi++;
        
    }
    
    public void perde(){
        soldi--;
    }
    
    public void stampa(){
        System.out.println("Nome: " + nome + ", soldi: " +soldi);
    }

    public int saldo() {
       return soldi;
       
    }
    
    
}
