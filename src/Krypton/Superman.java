/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Krypton;

import segundoparcialpoo.Ejercito;

/**
 *
 * @author Mabel
 */
public class Superman implements Ejercito{
    @Override
    public void Entrenar(){
        System.out.println("Superman esta tomando un baño de sol");
    }
    @Override
    public void Atacar(){
        System.out.println("ATACKKKKK!!!");
    }
    int vida;
    int ataque;
}
