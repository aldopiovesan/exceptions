/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione4;

/**
 *
 * @author tss
 */
public class DemoClassiAnnidate {

    public static void main(String[] args) {

        Persona.Indirizzo ind = new Persona.Indirizzo("via roma", 10, 10015, "ivrea");
        Persona p = new Persona("mario", "rossi", ind);
        System.out.println(p.getCognome() + "," + p.getNome());

    }

}

class Persona {

    private String nome, cognome;
    private Indirizzo indirizzo;

    public Persona(String nome, String cognome, Indirizzo indirizzo) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public class Indirizzo {

        private String indirizzo;
        private int numero, cap;
        private String citta;

        public Indirizzo(String indirizzo, int numero, int cap, String citta) {
            this.indirizzo = indirizzo;
            this.numero = numero;
            this.cap = cap;
            this.citta = citta;
        }

        public String getIndirizzo() {
            return indirizzo;
        }

        public void setIndirizzo(String indirizzi) {
            this.indirizzo = indirizzi;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public int getCap() {
            return cap;
        }

        public void setCap(int cap) {
            this.cap = cap;
        }

        public String getCitta() {
            return citta;
        }

        public void setCitta(String citta) {
            this.citta = citta;
        }

    }

}
