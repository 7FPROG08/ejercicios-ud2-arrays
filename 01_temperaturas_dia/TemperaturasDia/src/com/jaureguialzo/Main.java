package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int HORAS = 24; // Constante

        // Declarar el array
        double[] temperaturas = new double[HORAS];

        // Leer los valores en el array
        for (int i = 0; i < HORAS; i++) {
            System.out.print("Escribe la temperatura: ");
            temperaturas[i] = Double.parseDouble(br.readLine());
        }

        // Calcular la media, max y miníma
        double total = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for (int i = 0; i < HORAS; i++) {
            total += temperaturas[i];

            if (temperaturas[i] > max) {
                max = temperaturas[i];
            }

            if (temperaturas[i] < min) {
                min = temperaturas[i];
            }
        }

        double media = total / HORAS;

        // Hacer el dibujo
        for (int i = 0; i < HORAS; i++) {
            // Hora
            System.out.print(i);

            // Espaciador
            System.out.print("  ");

            // Asteriscos
            for (int j = 0; j < temperaturas[i]; j++) {
                System.out.print("*");
            }

            // Espaciador
            System.out.print("  ");

            // Valor numérico
            System.out.print(temperaturas[i]);

            // MAX
            if (temperaturas[i] == max) {
                System.out.print(" --> MAX ");
            }

            // MIN
            if (temperaturas[i] == min) {
                System.out.print(" --> MIN ");
            }

            // Salto de línea
            System.out.println();
        }

        // Media
        System.out.println("Media: " + media);
    }
}
