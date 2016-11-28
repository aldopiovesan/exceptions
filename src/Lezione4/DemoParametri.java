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
public class DemoParametri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Bicycle bici= new Bicycle(0, 1);
        
        bici.setSpeed(10);
        
        System.out.println(bici.getSpeed());
        
        
        Box box= new Box();
       
        
        box.setBici(bici);
        
        //se stampo la velocita di bici quanto vale, usa i parametri x valore e non x riferimento
        
        System.out.println("bici : "+bici.getSpeed());
    }
    
}
