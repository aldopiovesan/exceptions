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
public class MatematicaVarArgs {
    
    
    public static final double PI_COSTANTE = 3.14;
    
  //cosi non do la possibilitia di creare oggetti al di fuori della classe, in quanto ho utlizzato metodi static e basta 
  private MatematicaVarArgs(){
      
  }
    
    //metodo con vararrgs, numero diverso di variabili
    public static long somma(int... numeri){
        
        
        long risultato =0;
        for (int i = 0; i < numeri.length; i++) {
            risultato+=numeri[i];
        }
        return risultato;
    }
    //equivalente
    public static long sommaDiversa(int[] numeri){
     return 0;   
    }

    
}
