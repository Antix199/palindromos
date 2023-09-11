package org.example;
public class PalindromoChecker {

    public static boolean esPalindromo(String cadena) {
        String resultado = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            resultado += cadena.charAt(i);
        }
        return cadena.equals(resultado);
    }
    public static void main(String[] args) {
    }
}
