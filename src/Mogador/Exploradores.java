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
public class Exploradores implements Ejercito{
    int Vida;
    int Ataque;
    @Override
    public void Entrenar(){
        System.out.println("Se esta creando un grupo de exploradores");
    }
    @Override
    public void Atacar(){
        System.out.println("ATACKKKKK!!!");
    }
    int vida;
    int ataque;

    @Override
    public void Defender() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
