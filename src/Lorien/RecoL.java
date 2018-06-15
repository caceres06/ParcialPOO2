/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lorien;


/**
 *
 * @author Mabel
 */
public class RecoL{
     int puntosvida=100;
     int costo;
     int R1;
     int min;

    public int getPuntosvida() {
        return puntosvida;
    }
    public int recurso(){
         for(min=1;min<10;min++){
        R1=R1+R1;
    }
         return R1;
}

    public int getR1() {
        return R1;
    }
}
