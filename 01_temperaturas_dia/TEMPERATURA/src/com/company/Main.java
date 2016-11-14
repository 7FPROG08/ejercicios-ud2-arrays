package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {



    public static void main(String[] args) throws IOException {

        /*

Pide al usuario las temperaturas de un día (un valor cada hora durante 24 horas) y almacénalas en un array.

Usando los datos contenidos en el array, calcula la temperatura media, la máxima y la mínima.

Visualiza la información en forma de gráfico de barras. Por ejemplo:
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        double[] temperaturas = new double[24];

        for (int i = 0; i < 24; i++) {
            System.out.println("Escribe la temperatura: ");
            temperaturas[i] = Double.parseDouble(br.readLine());
        }

        double total = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for (int i = 0; i < 24; i++) {
            total += temperaturas[i];

            if(temperaturas[i] > max){
                max = temperaturas[i];
            }

            if (temperaturas[i] < min){
                min = temperaturas[i];
            }


        }


        double media = total/24;


        for (int i = 0; i < 5; i++) {
            System.out.print(i);
            System.out.print(" ");

            for (int j = 0; j < temperaturas[i]; j++) {
                System.out.print("*");

            }
            System.out.print(" ");

            System.out.print(temperaturas[i]);

        if (temperaturas[i] == max){
            System.out.print(" MAX");
        }

        if (temperaturas[i] == min){
            System.out.print(" MIN");
        }

            System.out.println();


        }


        System.out.println("la media: "+media);





}









}
