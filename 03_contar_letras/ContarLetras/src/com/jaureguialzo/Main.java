package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int[] contarLetras(char[] texto, char[] alfabeto) {

        // Declaración
        int[] recuento = new int[alfabeto.length];

        // Inicialización
        for (int i = 0; i < alfabeto.length; i++) {
            recuento[i] = 0;
        }

/*
        for (int i = 0; i < texto.length; i++) {
            for (int j = 0; j < alfabeto.length; j++) {
                if (texto[i] == alfabeto[j]) {
                    recuento[j] += 1;
                }
            }
        }
*/

        // Recorrido
        for (int i = 0; i < texto.length; i++) {

            int j = 0;

            // Búsqueda lineal en un array
            while (j < alfabeto.length && texto[i] != alfabeto[j]) {
                j++;
            }

            if (j < alfabeto.length) {
                recuento[j] += 1;
            }
        }

        return recuento;
    }

    public static void visualizarRecuento(int[] recuento, char[] alfabetoUsuario) {
        for (int i = 0; i < recuento.length; i++) {
            System.out.print(alfabetoUsuario[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < recuento.length; i++) {
            System.out.print(recuento[i] + " ");
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe el texto: ");
        String texto = br.readLine();

        // Array con el texto escrito
        char[] textoUsuario = texto.toUpperCase().toCharArray();

        // Array con el alfabeto
        String alfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ@";
        char[] alfabetoUsuario = alfabeto.toCharArray();

        // Hacer el recuento
        int[] recuento = contarLetras(textoUsuario, alfabetoUsuario);

        // Visualizar
        visualizarRecuento(recuento, alfabetoUsuario);
    }
}
