/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcialpoo;

import Lorien.Loriense;
import Mogador.Mogadoriano;

/**
 *
 * @author Mabel
 */
public class RazaFactory {

    static Raza getRaza(RazaType type) {
        switch (type){
            case Lor:
                return new Loriense();
            case Mog:
                return new Mogadoriano();
        }
        return null;
            }
}
