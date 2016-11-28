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
public class Box {
    
    
    //vengono inseriti dei valori all'interno di un parametro, a seconda che si tratti di un oggetto o no

    private Bicycle bici;

    public Bicycle getBici() {
        return bici;
    }

    public void setBici(Bicycle param) {

        param.setSpeed(0);

        this.bici = param;
    }

}
