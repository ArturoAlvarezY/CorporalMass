package dev.arturo.models;

public class ImcStatus {
    
    public String getCorporalStatus(double corporalStatus){
        if (corporalStatus < 16) {
            return "delgadez severa";
        } 
        else if (corporalStatus >= 16 && corporalStatus < 17) {
            return "delgadez moderada";
        }
         else if (corporalStatus >= 17 && corporalStatus < 18.5) {
            return "delgadez leve";
        }
         else if (corporalStatus >= 18.5 && corporalStatus < 25) {
            return "peso normal";
        }
         else if (corporalStatus >= 25 && corporalStatus < 30) {
            return "sobrepeso";
        }
         else if (corporalStatus >= 30 && corporalStatus < 35) {
            return "obesidad leve";
        }
         else if (corporalStatus >= 35 && corporalStatus < 40) {
            return "obesidad moderada";
        }
         else {
            return "obesidad severa";
        }
    }   
}
