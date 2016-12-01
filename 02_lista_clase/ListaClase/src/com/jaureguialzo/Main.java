package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int ALUMNOS = 3;

        String[] lista = new String[ALUMNOS];

        for (int i = 0; i < ALUMNOS; i++) {
            System.out.print("Escribe el nombre: ");
            lista[i] = br.readLine();
        }

/*
        String texto;
        do {
            System.out.print("Letra (o FIN para terminar): ");
            texto = br.readLine().toLowerCase();

            if (!texto.equalsIgnoreCase("FIN")) {
                char letra = texto.charAt(0);

                for (int i = 0; i < ALUMNOS; i++) {
                    if( lista[i].toLowerCase().charAt(0) == letra ) {
                        System.out.println(lista[i]);
                    }
                }
            }

        } while (!texto.equalsIgnoreCase("FIN"));
*/

        System.out.print("Letra (o FIN para terminar): ");
        String texto = br.readLine().toLowerCase();

        while (!texto.equalsIgnoreCase("FIN")) {
                char letra = texto.charAt(0);

                for (int i = 0; i < ALUMNOS; i++) {
                    if (lista[i].toLowerCase().charAt(0) == letra) {
                        System.out.println(lista[i]);
                    }
                }

            System.out.print("Letra (o FIN para terminar): ");
            texto = br.readLine().toLowerCase();
        }

        System.out.println("Adios!");
    }
}
