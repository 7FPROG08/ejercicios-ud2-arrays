package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

    /*Realizar un programa que cuente el número de veces que aparece cada una de las letras del alfabeto en un texto introducido por el usuario.

El recuento se hará mediante la función contarLetras() y se almacenará el total de cada letra en la posición correspondiente de un array.

Después se mostrará el resultado en pantalla mediante la función visualizarRecuento().

    Nota: Recordad que para acceder a los caracteres individuales de un String disponemos del método .charAt().
*/


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe un texto y contaremos las letras que contiene ");
        String texto = br.readLine();

    }
    public static int contarLetras(int letras) {
        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] contar = new int [27];

        for (int i = 0; i < alfabeto.length; i++) {
        if (texto.charAt(0))


        }

    }


}
}
