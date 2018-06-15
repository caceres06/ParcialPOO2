/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcialpoo;

/**
 *
 * @author Mabel
 */
public class Jugador{
    String Nombre;
    Menu m=new Menu();
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public void Raza(String raza){
        switch(raza){
            case "Loriense":
            Raza loriense;
            loriense = RazaFactory.getRaza(RazaType.Lor);
            loriense.crear();
            
            break;
            case "Mog":
              Raza mog;
              mog = RazaFactory.getRaza(RazaType.Mog);
              mog.crear();
            break;
            case "Kryptoniano":
              Raza kryptoniano;
              kryptoniano = RazaFactory.getRaza(RazaType.Kryp);
              kryptoniano.crear();
            break;
        }
        m.Ejercito();
    }
    
        }
