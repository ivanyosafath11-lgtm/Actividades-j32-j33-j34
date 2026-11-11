public class j32_Excepcion_Propia {

    public static void main(String[] args) {
        System.out.println("-- INICIO DEL PROGRAMA J32 --");

        // Ejemplo propio: Intentar parsear un texto vacío o con caracteres inválidos
        String codigoPostalInvalido = "MX-Oaxaca";

        try {
            System.out.println("Intentando convertir el código postal a un valor numérico...");

            // Esto fallará porque tiene letras y guion
            int cp = Integer.parseInt(codigoPostalInvalido);

            System.out.println("El código postal es: " + cp);

        } catch (NumberFormatException e) {
            System.out.println("Ocurrió un error: El código postal ingresado no tiene un formato numérico válido.");

            // Agregamos el mensaje técnico del error como lo pide la tarea
            System.out.println("Detalle técnico: " + e.getMessage());
        }

        System.out.println("=== FIN DEL PROGRAMA J32 ===");
        System.out.println("El sistema continuó operando sin detenerse.");
    }
}