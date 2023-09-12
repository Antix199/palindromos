public class MainTest {

    public static void main(String[] args) {
        // Caso 1: Palabra en minúsculas
        testEsPalindromo("oso");

        // Caso 2: Palabra en mayúsculas
        testEsPalindromo("Oso");

        // Caso 3: Palabra que no es un palíndromo
        testEsPalindromo("Casa");

        // Caso 4: Palabra con espacios
        testEsPalindromo("la al");

        // Caso 5: Palabra con mayúsculas y espacios
        testEsPalindromo("La al");

        // Caso 6: Números
        testEsPalindromo("121");

    }

    public static void testEsPalindromo(String palabra) {
        boolean resultado = Main.esPalindromo(palabra);
        String mensaje = resultado ? "es un palíndromo" : "no es un palíndromo";
        System.out.println("La palabra \"" + palabra + "\" " + mensaje);
    }
}
