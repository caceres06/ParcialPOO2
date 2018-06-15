/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcialpoo;

import Estructura.EstrucFactory;
import Estructura.Estructura;
import Estructura.Estructype;
/**
 *
 * @author Mabel
 */
public class Menu {

    public Menu() {
    }
    
    public void Ejercito() {
    AbstractEjercito ejercito;
    ejercito=FactoryProducer.getEjercito("Lorien");
            
}
    public void Estructura(String type){
        switch(type){
            case "Recolector 1":
            Estructura Reco1;
            Reco1 = EstrucFactory.getEstructura(Estructype.rec1);
            Reco1.crear();
            break;
            case "Recolector 2":
            Estructura Reco2;
            Reco2 = EstrucFactory.getEstructura(Estructype.rec2);
            Reco2.crear();
            break;
            case "Centro de Entrenamiento":
              Estructura ce;
            ce= EstrucFactory.getEstructura(Estructype.cm);
            ce.crear();
            break;
        }
    }
    }
