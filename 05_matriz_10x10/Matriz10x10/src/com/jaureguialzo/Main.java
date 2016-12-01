package com.jaureguialzo;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[][] matriz = new int[10][10];

        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = r.nextInt(100)-50;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.format("%5d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
