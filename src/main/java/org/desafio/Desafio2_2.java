package org.desafio;

import java.util.Locale;
import java.util.Scanner;

public class Desafio2_2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float a, b, c;

        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        float delta, sqrtdelta, x1, x2;

        delta = (b * b) - (4 * a * c);

        // (o valor de "a" não pode ser zero, e o valor de "delta" não pode ser
        // negativo), mostrar uma mensagem "Impossivel calcular"
        if (a != 0 || delta > 0) {

            sqrtdelta = (float) Math.sqrt(delta);


            x1 = ((-1) * b + sqrtdelta) / (2 * a);
            x2 = ((-1) * b - sqrtdelta) / (2 * a);
            System.out.printf("x1 = %.5f \n", x1);
            System.out.printf("x2 = %.5f", x2);
            sc.close();
        } else {
            System.out.println("Impossivel calcular");
        }
    }
}