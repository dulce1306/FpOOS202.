//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SpartanII jefemaestro= new SpartanII("John", 90, "Rifle de asalto",0);
        jefemaestro.mostrarInfo();
        jefemaestro.usarManejoAvanzado();
        jefemaestro.atacar("Convenant");
        jefemaestro.recibirDano(50);
        jefemaestro.recargarEscudo();


        SpartanIII maestro = new SpartanIII("Marco",80,"Cuchillo",0);
        maestro.mostrarInfo();
        maestro.camuflajeActivo();
        maestro.atacar("Grunt");
       maestro.recibirDano(50);
        maestro.recargarEscudo();

        SpartanIV Guerrerodragon = new SpartanIV("POo",100,"bola de fuego",0);
        Guerrerodragon.mostrarInfo();
        Guerrerodragon.usarPropulsores();
        Guerrerodragon.atacar("Maestro serpiente");
        Guerrerodragon.recargarEscudo();



    }
}