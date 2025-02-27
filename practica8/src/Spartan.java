public class Spartan {


   private String nombre;
   private   int escudo, salud;
   private String armaPrincipal;

   //constructor


    public Spartan(String nombre, int escudo, int salud, String armaPrincipal) {
        this.nombre = nombre;
        this.escudo = escudo;
        this.salud = salud;
        this.armaPrincipal = armaPrincipal;
    }

    public void mostrarInfo(){
       System.out.println("--------------  Informacion  del Spartan  --------------");
       System.out.println("Nombre:"+ nombre);
       System.out.println("% de Salud:"+ salud);
       System.out.println("% de Escudo:"+ escudo);
       System.out.println("Arma disponible :"+ armaPrincipal);
       System.out.println("-------------------------------------------------------");

   }//llave mostar info

    public void atacar(String enemigo){
       System.out.println(nombre+ "ataca a"+enemigo+"con"+ armaPrincipal);
    }

    public void racargarArma(int municiones){
       int restantes= 10;
       int total = restantes + municiones;
        System.out.println(armaPrincipal + "ahora tienes disponible" + total+ "balas");

    }

    public void correr(boolean status){
       if(status){
           System.out.println(nombre+ "esta corriendo.....");
       }else{
           System.out.println(nombre+"se detuvo");
       }


    }
// consulta cortana
    private void consultaCortana() {
        System.out.println("Conversacion Privada......");
    }


//ZONA DE GETS Y SETS
public String getNombre() {
    return nombre;
}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public String getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

}//llave de la clase
