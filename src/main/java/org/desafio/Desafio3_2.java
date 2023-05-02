package org.desafio;

import java.util.Locale;
import java.util.Scanner;

public class Desafio3_2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int N, in, out;

        N = leitor.nextInt();
        in = 0;
        out = 0;

        for (int i = 0; i < N; i++) {
            int x = leitor.nextInt();
            if (x >= 10 && x <= 20)
                in++;
            else out++;
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
