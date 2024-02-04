package Tugas;

import java.util.Scanner;

public class Screen extends Kalkulator {
    public void screen(){
    Kalkulator calculator = new Kalkulator();

    Scanner input = new Scanner(System.in);
        System.out.print("Input Nilai Pertama: ");
    String input1 = input.nextLine();
        try{
        nilai1 = Double.parseDouble(input1);
    } catch(NumberFormatException numberFormatException){
        System.out.println("Salah input format nomor, tidak bisa menggunakan: "+input1);
        return;
    }

        System.out.print("Input Nilai Kedua: ");
    String input2 = input.nextLine();
        try{
        nilai2 = Double.parseDouble(input2);
    } catch(NumberFormatException numberFormatException){
        System.out.println("Salah input format nomor, tidak bisa menggunakan: "+input2);
        return;
    }

        System.out.print("Masukkan Operator Bang: ");
    String inputOperator = input.nextLine();

        switch (inputOperator) {

        case "+":
            calculator.setAddition(nilai1, nilai2);
            System.out.println("Hasilnya adalah: "+calculator.getAddition());
            break;
        case "-":
            calculator.setSubtraction(nilai1, nilai2);
            System.out.println("Hasilnya adalah: " + calculator.getSubtraction());
            break;
        case "*":
            calculator.setMultiplication(nilai1, nilai2);
            System.out.println("Hasilnya adalah: " + calculator.getMultiplication());
            break;
        case "/":
            calculator.setDivided(nilai1, nilai2);
            System.out.println("Hasilnya adalah: " + calculator.getDivided());
            break;
        default:
            System.out.println("Operator tidak benar! \nSilahkan gunakan '-,+,*,/' ");

    }

}

}


