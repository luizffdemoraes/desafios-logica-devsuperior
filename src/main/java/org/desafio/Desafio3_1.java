package org.desafio;

import java.util.Locale;
import java.util.Scanner;

public class Desafio3_1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int senha;

        senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Invalida");
            senha = sc.nextInt();

        }
        System.out.println("Acesso Permitido");
    }
}
