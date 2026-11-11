public class j33_MultiplesExcepciones_Propio {

    public static void main(String[] args) {
        System.out.println("---- MÚLTIPLES EXCEPCIONES: INVENTARIO DE JUEGO ----\n");

        // --- EJEMPLO 1: ArithmeticException (Repartir recursos entre cero jugadores) ---
        System.out.println("---- CASO 1: Repartir monedas de oro ----");
        try {
            System.out.println("Intentando dividir el botín de oro entre los miembros del clan conectados...");
            int oroTotal = 500;
            int jugadoresConectados = 0; // Nadie conectado

            int oroPorPersona = oroTotal / jugadoresConectados; // ¡Error de división entre cero!
            System.out.println("Oro por jugador: " + oroPorPersona);

        } catch (ArithmeticException e) {
            System.out.println("¡Ups! No puedes repartir oro si no hay jugadores conectados en la sala.");
            // Agregamos el mensaje técnico del error como lo pide la tarea
            System.out.println("Detalle técnico: " + e.getMessage() + "\n");
        }


        // --- EJEMPLO 2: NullPointerException (Consultar un perfil de usuario que no existe) ---
        System.out.println("---- CASO 2: Consultar perfil de jugador ----");
        try {
            System.out.println("Buscando el nombre de un usuario invitado que no ha iniciado sesión...");
            String nombreUsuario = null; // El objeto no está inicializado

            // Intentar obtener las letras mayúsculas de un texto nulo provoca un error
            String usuarioMayusculas = nombreUsuario.toUpperCase();
            System.out.println("Nombre en mayúsculas: " + usuarioMayusculas);

        } catch (NullPointerException e) {
            System.out.println("¡Cuidado! Intentaste consultar los datos de un usuario que no existe o no ha ingresado.");
            // Agregamos el mensaje técnico del error como lo pide la tarea
            System.out.println("Detalle técnico: " + e.getMessage());
        }


        // --- MENSAJE FINAL ---
        System.out.println("\n=== FIN DEL PROGRAMA J33 ===");
        System.out.println("El juego manejó ambos errores de forma limpia y continuó ejecutándose.");
    }
}