package org.desafio;

import java.util.Locale;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo_1, numero_1, codigo_2, numero_2;
        float valor_unit_1, valor_unit_2, total;

        codigo_1 = sc.nextInt();
        numero_1 = sc.nextInt();
        valor_unit_1 = sc.nextFloat();

        codigo_2 = sc.nextInt();
        numero_2 = sc.nextInt();
        valor_unit_2 = sc.nextFloat();

        total = (numero_1 * valor_unit_1) + (numero_2 * valor_unit_2);
        System.out.printf("VALOR A PAGAR: R$ %.2f", total);
        sc.close();
    }
}