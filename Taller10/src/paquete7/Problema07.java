/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete7;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Problema07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[][] X = new double[3][3];
        double[][] A = new double[3][3];
        double[][] B = new double[3][3];

        System.out.println("Ingrese los valores de la matriz A (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("X[%d][%d]: ", i, j);
                X[i][j] = entrada.nextDouble();
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                double x = X[i][j];

                A[i][j] = (x + 1) * (x + 1);
                B[i][j] = x * x + 2 * x + 1;
            }
        }

        boolean identidadCumple = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (A[i][j] != B[i][j]) {
                    identidadCumple = false;
                }
            }
        }

        if (identidadCumple) {
            System.out.println("\nLa identidad algebraica se cumple.");
        } else {
            System.out.println("\nLa identidad algebraica NO se cumple.");
        }
    }
}
