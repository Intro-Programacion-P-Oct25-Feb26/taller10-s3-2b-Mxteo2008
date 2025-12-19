/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {

        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}};

        String mensaje = "";

        for (int i = 0; i < estudiantes.length; i++) {

            for (int j = 0; j < estudiantes[i].length; j++) {

                String nombre = estudiantes[i][j];

                char letra = Character.toLowerCase(nombre.charAt(0));

                switch (letra) {
                    case 's':
                    case 'p':
                    case 't':
                        mensaje = String.format("%s%s\n", mensaje, nombre);
                        break;
                }
            }
        }

        System.out.printf("Estudiantes con inicial S, P o T: \n%s\n", mensaje);
    }
}
