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
public class Loriense implements Raza{
    @Override
    public void crear() {
        System.out.println(ventajas);
    }
    String ventajas = "Costo de creación medio,fortaleza media";
}
