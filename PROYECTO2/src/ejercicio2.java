import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un numero entero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println("El numero  es par.");
        }else {
            System.out.println("El numero es impar ");
        }
        scanner.close();
    }
}

