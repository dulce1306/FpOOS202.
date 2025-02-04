import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de payasos vendidos: ");
        int numPayasos = sc.nextInt();
        System.out.print("Introduce el número de muñecas vendidas: ");
        int numMuñecas = sc.nextInt();
        int pesoTotal = (numPayasos * 112) + (numMuñecas * 75);
        System.out.println("El peso total del paquete es: " + pesoTotal + " gramos.");
        sc.close();
    }

}

