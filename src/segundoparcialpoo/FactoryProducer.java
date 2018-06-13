/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcialpoo;

import Krypton.EjercitoKryton;
import Lorien.EjercitoLoriense;
import Mogador.EjercitoMogadoriano;

/**
 *
 * @author Mabel
 */
public class FactoryProducer {
    public static AbstractEjercito getEjercito(String type){
        switch (type){
            case "Lorien":
                return new EjercitoLoriense();
            case "Mogadoriano":
                return new EjercitoMogadoriano();
            case "Krypton":
                return new EjercitoKryton();
        }
        return null;
    }

    public static AbstractEjercito getAtacar(String type) {
       switch (type){
           case "Lorien":
               return new EjercitoLoriense();
           case "Mogadoriano":
               return new EjercitoMogadoriano();
           case "Kryton":
               return new EjercitoKryton();
        }
       return null;
    }
}

