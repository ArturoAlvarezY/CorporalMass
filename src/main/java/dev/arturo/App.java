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
   CorporalMass corporalMass = new CorporalMass(88.8, 1.85 );

        System.out.println(corporalMass.imcCalc());
        
      
       
    }    
}

