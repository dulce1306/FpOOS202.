import java.util.Scanner;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu nombre completo: ");
        String nombreCompleto = sc.nextLine();
        System.out.println("En minúsculas: " + nombreCompleto.toLowerCase());
        System.out.println("En mayúsculas: " + nombreCompleto.toUpperCase());
        System.out.println("Capitalizado: " + capitalizar(nombreCompleto));
        sc.close();
    }

    private static String capitalizar(String texto) {
        String[] palabras = texto.toLowerCase().split("\\s+");
        StringBuilder resultado = new StringBuilder();
        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                resultado.append(Character.toUpperCase(palabra.charAt(0)))
                        .append(palabra.substring(1)).append(" ");
            }
        }
        return resultado.toString().trim();
    }

}
