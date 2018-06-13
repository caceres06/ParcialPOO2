/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lorien;

import segundoparcialpoo.Ejercito;

/**
 *
 * @author Mabel
 */
public class Cepans implements Ejercito {
    @Override
    public void Entrenar(){
        System.out.println("El escuadron Cepan se esta entrenando");
    }
    @Override 
    public void Atacar(){
        System.out.println("ATACKKKKK!!!");
    }
    int vida;
    int ataque;

    @Override
    public void Defender() {
        System.out.println("ATACKKKKK!!!");
    }
    }
