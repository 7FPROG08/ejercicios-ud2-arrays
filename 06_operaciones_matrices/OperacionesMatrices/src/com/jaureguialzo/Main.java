package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static int[][] suma(int[][] m1, int[][] m2) {

        int[][] r = new int[4][4];

        return r;
    }

    public static int[][] productoEscalar( int[][] m, int e) {

        int[][] r = new int[4][4];

        return r;
    }

    public static int[][] producto(int[][] m1, int[][] m2) {

        int[][] r = new int[4][4];

        return r;
    }

    public static int[][] traspuesta( int[][] m ) {

        int[][] r = new int[4][4];

        return r;
    }

    public static void visualizar( int[][] m ) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.format("%3d",m[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Declarar las variables
        int[][] m1 = new int[4][4];
        int[][] m2 = new int[4][4];

        // Generador de números aleatorios
        Random r = new Random();

        // Inicializamos las matrices
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                m1[f][c] = r.nextInt(10);
                m2[f][c] = r.nextInt(10);
            }
        }

        // Visualizarlas
        System.out.println("m1");
        visualizar(m1);
        System.out.println("m2");
        visualizar(m2);

        // Sumar las matrices
        System.out.println("Suma de m1 + m2");
        visualizar(suma(m1,m2));

        // Producto por un escalar
        System.out.print("Escribe un número: ");
        int n = Integer.parseInt(br.readLine());

        System.out.println("Producto de m1 x n");
        visualizar(productoEscalar(m1,n));

        // Producto
        System.out.println("Producto de m1 x m2");
        visualizar(producto(m1,m2));

        // Traspuesta
        System.out.println("Traspuesta de m2");
        visualizar(traspuesta(m2));

    }
}
