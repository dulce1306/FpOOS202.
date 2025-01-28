// Zona de importacion
import java.util.Scanner;

// Clase principal
public class Main {
    // metodo Principal
    public static void main(String[] args) {


        System.out.printf("Hello, Dulce !");



        // 2. Cadenas
        // para concatenar se usa el " dulce + garcia "//
        //     System.out.println(cadena.length()); es para contar lo que contiene la cadena//

        String cadena = "Dulce" + "garcia" + "subias";
       System.out.println(cadena);

        System.out.println(cadena.length());

        // El substring sirve para la extraccion de caracteres en base a parametros
        System.out.println(cadena.substring(2,5));
        System.out.println(cadena.substring( 2));
        System.out.println(cadena.substring(0,5));

        // 3. Variables
        // variable: espacio de memoria que podria estar cambiando//

        String cadenas ="333", cadena2, cadena3;
        int entero= 3, entero2,entero3;
        double decimal= 3.3545454654, decimal2,decimal3;

        //convertir cadena a int (entero)

        entero2= Integer.parseInt(cadenas);
        System.out.println(entero2);

        //convertir double a int (entero)

        entero3= (int)decimal;
        System.out.println(entero3);

        // Convertir double a cadena

        cadena2= String.valueOf(decimal );
        System.out.println(cadena2 );

        //Convertir int a double
        decimal2= Double.valueOf(entero);
        System.out.println(decimal2 );

        // Conversion implicita
        int i=12;
        double numd= i;
        System.out.println(numd );

        //4.  solicitud de datos

     Scanner scn= new Scanner(System.in);

      System.out.println("Escribe una cadena: ");
      String cadenaa= scn.nextLine();


        System.out.println("Escribe un numero entero: ");
        String enteroo= scn.nextLine();

        System.out.println("Escribe un numero decimal: ");
        double decimall= scn.nextDouble();

        System.out.println("numero decimal guardado: "+ decimal);
        System.out.println("numero entero guardado: "+ entero);
        System.out.println("cadena guardada: "+ cadena);

        // 5. Boolean, operadores logicos y de comparacion

        // los operadores de comparacion siempre devuelven booleanos
        System.out.println(10> 9);
        System.out.println(10== 9);
        System.out.println(10 < 9);
        System.out.println(10>= 9);
        System.out.println(10<=9);
        System.out.println(10 != 9);

        // operadores logicos

        int x= 3;
        System.out.println(x< 5 && x>10);
        System.out.println(x< 5 || x>10);
        System.out.println(!(x< 5 && x>10));
        System.out.println(!(x< 5 || x>10));









    }
}