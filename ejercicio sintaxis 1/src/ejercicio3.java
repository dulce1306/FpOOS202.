import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero X: ");
        int x = sc.nextInt();
        int suma = (x * (x + 1)) / 2;
        System.out.println("La suma de los enteros desde 1 hasta " + x + " es: " + suma);
        sc.close();
    }
}

