public class Spartan extends Soldado {
// el extends soldado es la herencia

    private int escudo;

    public Spartan(String nombre, int salud, String arma, int escudo) {
        super(nombre, salud, arma); // primer ejemplo de herencia
        this.escudo = escudo;
    }

    // el override es para rescribir e usar el polimorfismo
    @Override
    //tambien heredamos recibir dano
    public void recibirDano(int dano) {
        if (escudo > 0) {
            escudo -= dano;
            if (escudo < 0) {
                salud += escudo;
                escudo = 0;
            }
// de nuevo aqui usamos la herencia
            System.out.println(nombre + "Recibio daño: " + escudo + "Salud:  " + salud);
        } else {
            super.recibirDano(dano);
        }
    }

    public void recargarEscudo() {
       this.escudo = 100;
        System.out.println(nombre + "Ha recargado su escudo al maximo: ");


    }
//  igualmente aqui se usa la herencia
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Escudo: " + this.escudo);
    }

}
