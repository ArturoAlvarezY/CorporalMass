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

    public double imcCalc(){

        Double calcImc= kilograms/ Math.pow(height, height);
        BigDecimal bigDecimal = new BigDecimal(calcImc);

        BigDecimal roundUp = bigDecimal.setScale(2, RoundingMode.HALF_UP);

        return roundUp.doubleValue();
    }

    public static void main(String[] args) {
    BigDecimal bigDecimal = new BigDecimal(4.846500);
    BigDecimal rounUp = bigDecimal.setScale(2, RoundingMode.HALF_UP);

    System.out.println(rounUp);
    }
}