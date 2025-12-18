package paquete1;

public class Problema01 {

    public static void main(String[] args) {

        boolean[][] asistencia = {
            {true, true, false, true, true},
            {true, false, false, true, false},
            {true, true, true, true, true},
            {false, true, true, false, true}
        };

        String[] estudiantes = {"Ana", "Luis", "Carlos", "María"};

        int[] totalAsistencias = new int[4];

        String reporte = "";
        String estudiantesCompletos = "";

        for (int i = 0; i < asistencia.length; i++) {
            int sumaAsistencia = 0;

            for (int j = 0; j < asistencia[i].length; j++) {
                if (asistencia[i][j]) {
                    sumaAsistencia = sumaAsistencia + 1;
                }
            }
            totalAsistencias[i] = sumaAsistencia;
        }
        for (int i = 0; i < estudiantes.length; i++) {

            reporte = String.format("%sEstudiante: %s\nAsistencias: %d\n",
                    reporte,
                    estudiantes[i],
                    totalAsistencias[i]);

            if (totalAsistencias[i] == 5) {
                reporte = String.format("%sAsistencia completa\n\n", reporte);
                estudiantesCompletos = String.format("%s%s\n", 
                        estudiantesCompletos, estudiantes[i]);
            } else {
                reporte = String.format("%sNo tiene asistencia completa\n\n", 
                        reporte);
            }
        }
 
        reporte = String.format("%sEstudiantes con asistencia completa:\n%s",
                reporte,
                estudiantesCompletos);

        System.out.println(reporte);
    }
}
