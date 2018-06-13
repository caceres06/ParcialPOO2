/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcialpoo;

import Lorien.Loriense;
import Mogador.Mogadoriano;
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
        Raza raza = null;
        String Nombre = null;
      
        Scanner sc = new Scanner(System.in);
        Jugador player = new Jugador();
        Jugador player2= new Jugador();
        System.out.println("Bienvenido a MabelCáceres's World");
        while(id){
                System.out.println("Ingrese su nombre");
                player.setNombre(sc.nextLine());
                System.out.println("Ingrese su raza");
                System.out.println("1.Loriense");
                System.out.println("2.Mogadoriano");
                System.out.println("3.Kryptoniano");
                player.Raza(sc.nextLine());
                System.out.println("Ingrese su nombre");
                player2.setNombre(sc.nextLine());
                System.out.println("Ingrese su raza");
                System.out.println("Loriense");
                System.out.println("Mogadoriano");
                System.out.println("Kryptoniano");
                player2.Raza(sc.nextLine());
                id = false;
       System.out.println("¡JUGADORES LISTOS!");
    }
        
}
}