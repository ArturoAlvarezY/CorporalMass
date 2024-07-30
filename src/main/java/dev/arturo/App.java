package dev.arturo;

import dev.arturo.models.CorporalMass;
import dev.arturo.models.ImcCalculator;
import dev.arturo.models.ImcStatus;

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
        
    CorporalMass corporalMass = new CorporalMass(88.0, 1.85);
    
    ImcCalculator imcCalculator = new ImcCalculator();

    double savingWeight = imcCalculator.imcCalc(corporalMass);

    ImcStatus imcStatus = new ImcStatus();

    String savingStatus = imcStatus.getCorporalStatus(savingWeight);

    System.out.println("Your weight is: " + savingWeight + "and you have a state of: " + savingStatus);


      
       
    }    
}

