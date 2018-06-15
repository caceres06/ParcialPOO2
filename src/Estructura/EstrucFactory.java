/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;

/**
 *
 * @author Mabel
 */
public class EstrucFactory {
    static Estructura getEstructura(Estructype op){
        switch (op){
            case rec1:
                return new Reco1();
            case rec2:
                return new Reco2();
            case cm:
                return new CE();
        }
        return null;
    }
}
