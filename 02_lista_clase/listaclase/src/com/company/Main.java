package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

/*Pide al usuario los nombres y apellidos de todos tus compañeros de clase y almacénalos en un array.

    Después pídele usuario una letra y muestra aquellos alumnos cuyo nombre empiece por dicha letra.

            Nota: El programa termina cuando se escriba FIN como búsqueda.*/


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] lista;
        lista = new String[5];
        for (int i = 0; i < lista.length; i++) {
            System.out.print("Escribe tu nombre y apellido ");
            String nombre = br.readLine();
            lista[i] = nombre;
        }
        String primera;

        do {
            System.out.print("Escribe la letra del alumno que buscas ");
            primera = br.readLine();
            if

            for (int i = 0; i < lista.length; i++) {
                if (primera.charAt(0) == lista[i].charAt(0)) {
                    System.out.println(lista[i]);
                }
            }

        } while (!primera.equalsIgnoreCase("FIN"));
    }
}

//hacer con fin cuando elige letra