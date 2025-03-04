public class SpartanIII extends Spartan {

    public SpartanIII(String nombre, int salud, String arma, int escudo){
        super(nombre, salud, arma, 80);

    }

    public void camuflajeActivo(){
        System.out.println(nombre + "Activo camuflaje para volverse invisible");
    }
}
