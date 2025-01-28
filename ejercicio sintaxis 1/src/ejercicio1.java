

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el numero de horas trabajadas: ");
        int horas = sc.nextInt();
        System.out.print("Introduce el coste por hora: ");
        double costePorHora = sc.nextDouble();
        double paga = horas * costePorHora;
        System.out.println("La paga correspondiente es: " + paga);

    }
}




