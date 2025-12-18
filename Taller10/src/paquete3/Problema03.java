package paquete3;

public class Problema03 {

    public static void main(String[] args) {

        boolean[][] sensores = {
            {true, true, true, true, true, true},
            {true, false, true, false, true, false},
            {false, false, false, false, false, false},
            {true, true, false, true, true, false}
        };

        int zonasF = 0;
        String reporte = "";

        for (int i = 0; i < sensores.length; i++) {
            boolean sinFallos = true;

            for (int j = 0; j < sensores[i].length; j++) {
                if (!sensores[i][j]) {
                    sinFallos = false;
                }
            }
            if (sinFallos) {
                zonasF++;
                reporte = String.format("%sZona %d: Funciona sin fallos\n",
                        reporte, (i + 1));
            } else {
                reporte = String.format("%sZona %d: Presenta al "
                        + "menos un fallo\n",
                        reporte, (i + 1));
            }
        }

        reporte = String.format("%s\nTotal de zonas sin fallos: %d",
                reporte, zonasF);

        System.out.println(reporte);

    }
}
