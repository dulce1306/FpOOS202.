import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa  una frase: ");
        String frase = sc.nextLine();
        String fraseInvertida = new StringBuilder(frase).reverse().toString();
        System.out.println("La Frase invertida es: " + fraseInvertida);
        sc.close();
    }
}
