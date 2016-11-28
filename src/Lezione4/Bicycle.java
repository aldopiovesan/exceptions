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
public class Bicycle {

    private int speed;
    private int gear;
    private static int numeroDiIstanze;
    
    
    //serve per inizializzare variabili statiche
    static {
        numeroDiIstanze=0;
    }
    

    public Bicycle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
        numeroDiIstanze++;

    }

    public Bicycle() {
        this(1, 1);
    }
    
    public Bicycle(int speed){
        this(speed, 1);
    }
    
    
    //mi stampa speed
    public int getSpeed() {

        return speed;
    }
    //scrivo il valore sul metodo main
    public void setSpeed(int valore) {

        speed = valore;

    }
    
    public static int getNumeroIstanze(){ //mettiamo static nel metodo per poterlo richiamare anche soltanto con la classe e nn con un oggetto
        
        return numeroDiIstanze;
    }
}
