package org.desafio;

import java.util.Locale;
import java.util.Scanner;

public class Desafio2_1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;

        codigo = sc.nextInt();
        quantidade = sc.nextInt();


        switch(codigo) {

            case 1:
                System.out.printf("Total: R$ %.2f", quantidade * 4.00);
                break;
            case 2:
                System.out.printf("Total: R$ %.2f", quantidade * 4.50);
                break;
            case 3:
                System.out.printf("Total: R$ %.2f", quantidade * 5.00);
                break;
            case 4:
                System.out.printf("Total: R$ %.2f", quantidade * 2.00);
                break;
            case 5:
                System.out.printf("Total: R$ %.2f", quantidade * 1.50);
                break;
        }
        sc.close();
    }
}