import java.util.Scanner;

public class ejercicio4 {


    public static boolean validPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }


            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese una cadena: ");
                String cadena = scanner.nextLine();
                scanner.close();

                if (esPalindromo(cadena)) {
                    System.out.println("La cadena es un palíndromo.");
                } else {
                    System.out.println("La cadena no es un palíndromo.");
                }
            }

            public static boolean esPalindromo(String cadena) {
                cadena = cadena.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
                int izquierda = 0, derecha = cadena.length() - 1;

                while (izquierda < derecha) {
                    if (cadena.charAt(izquierda) != cadena.charAt(derecha)) {
                        return false;
                    }
                    izquierda++;
                    derecha--;
                }
                return true;
            }
        }




