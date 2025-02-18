public class Spartan {


   public String nombre;
   int escudo, salud;
   String armaPrincipal;

   public void mostrarInfo(){
       System.out.println("-------------- Informacion  del Spartan--------------");
       System.out.println("Nombre:"+ nombre);
       System.out.println("% de Salud:"+ salud);
       System.out.println("% de Escudo:"+ escudo);
       System.out.println("Arma disponible :"+ armaPrincipal);
       System.out.println("-------------------------------------------------------");

   }//lave mostar info

    public void atacar(String enemigo){
       System.out.println(nombre+ "ataca a"+enemigo+"con"+ armaPrincipal);
    }

    public void racargarArma(int municiones){
       int restantes= 10;
       int total = restantes + municiones;
        System.out.println(armaPrincipal + "ahora tienes disponible"+ total+ "balas");

    }

    public void correr(boolean status){
       if(status){
           System.out.println(nombre+ "esta corriendo.....");
       }else{
           System.out.println(nombre+"se detuvo");
       }
    }


}//llave de la clase
