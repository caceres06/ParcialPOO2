/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mogador;

import segundoparcialpoo.Raza;

/**
 *
 * @author Mabel
 */
public class Mogadoriano extends Raza {
     public Mogadoriano(String name) {
        super.setName(name);
    }
    @Override
    public String typeRaza() {
        return "El jugador es un Mogadoriano de nombre"+" "+super.getName();
    }
}
