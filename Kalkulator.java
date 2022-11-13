package kalkulator_java;

import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        int angka1, angka2, hasil;
        String operator;
        Scanner masukan = new Scanner(System.in);

        System.out.print("masukkan angka pertama :");
        angka1 = masukan.nextInt();
        System.out.print("pilihlah operator (+,-,*,/) : ");
        operator = masukan.next();
        System.out.print("masukkan angka kedua : ");
        angka2 = masukan.nextInt();

        if (operator.equals("+")) {
            hasil = angka1 + angka2;
            System.out.println("hasil dari " + angka1 + " + " + angka2 + " = " + hasil);
        } else if (operator.equals("-")) {
            hasil = angka1 - angka2;
            System.out.println("hasil dari " + angka1 + " - " + angka2 + " = " + hasil);
        } else if (operator.equals("*")) {
            hasil = angka1 * angka2;
            System.out.println("hasil dari " + angka1 + " * " + angka2 + " = " + hasil);
        } else if (operator.equals("/")) {
            hasil = angka1 / angka2;
            System.out.println("hasil dari " + angka1 + " / " + angka2 + " = " + hasil);
        } else {
            System.out.println("masukkan operator dengan benar!");
        }
    }
}
