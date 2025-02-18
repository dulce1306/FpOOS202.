//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Creamos el primer objeto
        Spartan masterChief = new Spartan();


        //Usar sus atributos
        masterChief.nombre= "John";
        masterChief.salud=100;
        masterChief.escudo=70;
        masterChief.armaPrincipal="Rifle de asalto";

        //invocamos los metodos
        masterChief.mostrarInfo();
        masterChief.atacar("grunt");
        masterChief.racargarArma(75);
        masterChief.correr(true);


        //creamos el segundo objeto
        Spartan ayudante = new Spartan();
        //Usar sus atributos
        ayudante.nombre="Marcus";
       ayudante.salud=0;
       ayudante.escudo=0;
      ayudante.armaPrincipal="cuchillo";

        //invocamos los metodos
        ayudante.mostrarInfo();
        ayudante.atacar("a nadie");
        ayudante.racargarArma(0);
        ayudante.correr(false);




}
}
