//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Creamos el primer objeto
        Spartan masterChief = new Spartan("john",100,70,"Rifle de asalto");


        //Usar sus atributos


        //invocamos los metodos
        masterChief.mostrarInfo();
        masterChief.atacar("grunt");
        masterChief.racargarArma(75);
        masterChief.correr(true);

        //intento de uso de un metodo privado
        // masterChief.consultaCortana();



        //usamos get y set para cambiar atributo nombre
        masterChief.setNombre("Dulce Garcia");
        masterChief.mostrarInfo();
        System.out.println(masterChief.getNombre());

        //creamos el segundo objeto
        Spartan ayudante = new Spartan("Marcus",0,0,"Cuchillo");
        //Usar sus atributos


        //invocamos los metodos
        ayudante.mostrarInfo();
        ayudante.atacar("a nadie");
        ayudante.racargarArma(0);
        ayudante.correr(false);




}
}
