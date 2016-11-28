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
public class DemoOggetti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bicycle b1 = new Bicycle(10, 1);
        
        Bicycle b2 = new Bicycle(10, 1);
        
        if (b1 == b2) {
            System.out.println("uguali");
        } else {
            System.out.println("diversi"); //stamopa diversi perche sono due oggetti diversi e hanno riferimenti diversi
        }
        Bicycle b3 = new Bicycle();
        System.out.println("numero istanze create: " + Bicycle.getNumeroIstanze());
        
        System.out.println(MatematicaVarArgs.somma(6, 8));
        
    }
    
}
