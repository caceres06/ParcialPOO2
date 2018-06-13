/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mogador;

import segundoparcialpoo.Ejercito;

/**
 *
 * @author Mabel
 */
public class Piken implements Ejercito {
    @Override
    public void Entrenar(){
        System.out.println("El Piken esta siendo creado");
    }
    @Override
    public void Atacar(){
        System.out.println("ATACKKKKK!!!");
    }
    int vida;
    int ataque;
}
