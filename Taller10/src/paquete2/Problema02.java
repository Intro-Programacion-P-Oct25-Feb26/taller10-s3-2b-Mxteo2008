/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {

        int[][] edades = {
            {5, 12, 35, 40},
            {8, 15, 33, 38},
            {6, 10, 30, 36}
        };
        int[] adultos = new int[edades.length];
        int menorEdad = 0;
        String mensaje = "";
        for (int i = 0; i < edades.length; i++) {
            int adultosNum = 0;

            for (int j = 0; j < edades[i].length; j++) {
                if (edades[i][j] < 18) {
                    menorEdad = menorEdad + 1;

                } else {
                    adultosNum = adultosNum + 1;

                }
                adultos[i] = adultosNum;
            }
        }

        for (int i = 0; i < adultos.length; i++) {
            mensaje = String.format("%sFamilia numero %s\nAdultos en total: %s\n",
                    mensaje,
                    i + 1,
                    adultos[i]);

        }
        mensaje = String.format("%sMenores de edad en total: %s", mensaje,
                menorEdad);
        System.out.println(mensaje);
    }
}
