package dev.arturo;

import dev.arturo.models.CorporalMass;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
   CorporalMass corporalMass = new CorporalMass(88.2, 1.84);

        if (corporalMass.imcCalc() < 16) {
        System.out.println("delgadez severa");
        }
        else if(corporalMass.imcCalc() == 16 || corporalMass.imcCalc() == 17){
        System.out.println("delgadez moderada");
        }
        else if(corporalMass.imcCalc() == 18.5){
        System.out.println("delgadez leve");

        }
        else if(corporalMass.imcCalc() > 18.5 && corporalMass.imcCalc() <= 25){
        System.out.println("Peso normal");
        } else if (corporalMass.imcCalc() > 25 && corporalMass.imcCalc()<= 30) {
         System.out.println("sobrepeso");

        }
         else if (corporalMass.imcCalc() > 30 && corporalMass.imcCalc()<= 35) {
        System.out.println("obesidad leve");

        }
         else if (corporalMass.imcCalc() > 35 && corporalMass.imcCalc()<= 40) {
        System.out.println("obesidad moderada ");

        } else{
        System.out.println("obesidad severa");
        }
       
    }    
}

