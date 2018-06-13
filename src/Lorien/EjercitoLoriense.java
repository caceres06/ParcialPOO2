/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lorien;

import segundoparcialpoo.AbstractEjercito;
import segundoparcialpoo.Ejercito;

/**
 *
 * @author Mabel
 */
public class EjercitoLoriense implements AbstractEjercito{
    @Override
    public Ejercito getEjercito(String type){
        switch (type){
             case "Cepans":
                 return new Cepans();
             case "Garde":
                 return new Garde();
    }
        return null;
}
    public Ejercito getAtacar(String type){
        switch (type){
            case "Cepans":
                 return new Cepans();
             case "Garde":
                 return new Garde();
        }
        return null;
    }
}
