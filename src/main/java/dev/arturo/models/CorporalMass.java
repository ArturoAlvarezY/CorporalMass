package dev.arturo.models;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CorporalMass {
    private Double kilograms;
    private Double height;

    public CorporalMass(Double kilograms, Double height) {
        this.kilograms = kilograms;
        this.height = height;
    }

    public Double getKilograms() {
        return kilograms;
    }

    public void setKilograms(Double kilograms) {
        this.kilograms = kilograms;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getCorporalStatus(){
        Double corporalStatus = imcCalc();
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