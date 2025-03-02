import javax.swing.JOptionPane;

public class Vehiculo {

    private String placa;
    private String modelo;
    private double capacidadCarga;
    private Conductor conductor;

    // Constructor
    public Vehiculo(String placa, String modelo, double capacidadCarga, Conductor conductor) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadCarga = capacidadCarga;
        this.conductor = conductor;
    }

    public void asignarConductor (Conductor conductor){
        if (this.conductor == null){
            this.conductor = conductor;
        }else {
            JOptionPane.showMessageDialog(null, "El conductor ya ha sido asignado y no puede ser modificado");
        }
    }

    // Zona de gets & sets
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

}
