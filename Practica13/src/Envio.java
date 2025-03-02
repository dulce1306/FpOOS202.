import javax.swing.JOptionPane;

public class Envio {

    private String codigoEnvio;
    private String destino;
    private double peso;

    // Constructor
    public Envio(String codigoEnvio, String destino, double peso) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = peso;
    }
// Zona gets & sets

    public String getCodigoEnvio() {
        return codigoEnvio;
    }

    public void setCodigoEnvio(String codigoEnvio) {
        this.codigoEnvio = codigoEnvio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public static Envio crearEnvio() {
        String codigo = JOptionPane.showInputDialog("Ingrese su codigo de envio");
        String destino = JOptionPane.showInputDialog("Igrese destino del envio");
        String pesoStr = JOptionPane.showInputDialog("Ingrese el peso del envio (en caso de no saberlo ponga 0)");


        double peso = pesoStr.isEmpty()?0.0: Double.parseDouble(pesoStr);
        return new Envio(codigo,destino,peso);

    }

}
