package Tugas;

public class Kalkulator {
   double nilai1, nilai2, plus, minus, multiple, divided;
   double additionTotal, subtractionTotal, multiplicationTotal, divisionTotal;
    public void setAddition(double nilai1, double nilai2){ // Penambahan //
        additionTotal = nilai1 + nilai2;
        this.plus = additionTotal;
    }
    public double getAddition() {
        return this.plus;
    }

    public void setSubtraction(double nilai1, double nilai2){ // Pengurangan //
        subtractionTotal = nilai1 - nilai2;
        this.minus = subtractionTotal;
    }
    public double getSubtraction(){
        return this.minus;
    }

    public void setMultiplication(double nilai1, double nilai2){ // Perkalian //
        multiplicationTotal = nilai1 * nilai2;
        this.multiple = multiplicationTotal;
    }
    public double getMultiplication(){
        return this.multiple;
    }

    public void setDivided(double nilai1, double nilai2){ // Pembagian //
        divisionTotal = nilai1 / nilai2;
        this.divided = divisionTotal;
    }
    public double getDivided(){
        return this.divided;
    }
}
