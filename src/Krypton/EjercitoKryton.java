/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Krypton;

import segundoparcialpoo.AbstractEjercito;
import segundoparcialpoo.Ejercito;

/**
 *
 * @author Mabel
 */
public class EjercitoKryton implements AbstractEjercito {
    @Override
    public Ejercito getEjercito(String type){
        switch (type){
             case "Superman":
                 return new Superman();
    }
        return null;
}
    public Ejercito getAtacar(String type){
        switch (type){
            case "Superman":
                 return new Superman();
        }
        return null;
    }
}
