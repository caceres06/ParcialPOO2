/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lorien;

import segundoparcialpoo.Raza;

/**
 *
 * @author Mabel
 */
public class Loriense extends Raza {

    public Loriense(String name) {
        super.setName(name);
    }
    
    @Override
    public String typeRaza() {
        return "El jugador es un Loriense de nombre"+" "+super.getName();
    }
}
