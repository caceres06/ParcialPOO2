/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcialpoo;

import java.util.Scanner;
/**
 *
 * @author Mabel
 */
public class SegundoParcialPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean id=true;
        String Nombre = null;
        int raza=0;
        Scanner sc = new Scanner(System.in);
        Jugador player = new Jugador();
       System.out.println("Bienvenido a MabelCáceres's World");
       while(id){
           System.out.println("Ingrese su nombre: ");
           player.setNombre(Nombre);
           //System.out.println("Ingrese su Raza");
           
           id=false;   
        }
       System.out.println("¡JUGADORES LISTOS!");
    }
}