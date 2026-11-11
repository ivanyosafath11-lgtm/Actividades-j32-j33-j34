public class j34_ExcepcionGestionLocal_Propio {

    public static void main(String[] args) {
        System.out.println("---- GESTIÓN LOCAL DE EXCEPCIONES: CONTROL DE NIVEL ----\n");

        try {
            System.out.println("Calculando el promedio de puntos por nivel completado...");

            // Simulamos intentar repartir puntos totales entre niveles jugados,
            // pero por un error de lógica el nivel actual vale 0
            int puntosTotales = 1200;
            int nivelesCompletados = 0;

            int promedioPuntos = puntosTotales / nivelesCompletados; // ¡Esto lanza ArithmeticException!
            System.out.println("Promedio obtenido: " + promedioPuntos);

        } catch (ArithmeticException e) {
            // Gestionamos el error de forma local
            System.out.println("¡Atención! No se puede calcular el promedio porque no se ha completado ningún nivel.");

            // Agregamos el mensaje técnico del error como lo pide la tarea
            System.out.println("Detalle técnico: " + e.getMessage());
        }

        System.out.println("\n=== FIN DEL PROGRAMA J34 ===");
        System.out.println("El programa continúa su ejecución normal gracias a la gestión local de la excepción.");
    }
}