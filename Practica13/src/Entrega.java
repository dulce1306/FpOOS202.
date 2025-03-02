import javax.swing.JOptionPane;

public class Entrega {
    private String numeroGuia;
    private String estado;

    public Entrega(String numeroGuia, String estado) {
        this.numeroGuia = numeroGuia;
        this.estado = estado;
    }


    public String getNumeroGuia() {
        return numeroGuia;
    }

    public void setNumeroGuia(String numeroGuia) {
        this.numeroGuia = numeroGuia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void actualizarEstado(String nuevoEstado){
        if (nuevoEstado.equals("En transito")|| nuevoEstado.equals("Entregado")){
            this.estado = nuevoEstado;

        }else{
            JOptionPane.showMessageDialog(null,"Estado no valido. (Solo se permite en transito o Entregado)");
        }
    }

}
