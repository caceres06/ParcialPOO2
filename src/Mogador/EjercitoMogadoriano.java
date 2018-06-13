/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mogador;

import segundoparcialpoo.AbstractEjercito;
import segundoparcialpoo.Ejercito;

/**
 *
 * @author Mabel
 */
public class EjercitoMogadoriano implements AbstractEjercito {
    @Override
    public Ejercito getEjercito(String type){
        switch(type){
            case "Exploradores":
                    return new Exploradores();
        }
        return null;
    }
}
