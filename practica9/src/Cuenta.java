
import javax.swing.JOptionPane;


public class Cuenta {
    private int noCuenta;
    private String titular;
    private int edad;
    private double saldo;

    public Cuenta(int noCuenta, String titular, int edad, double saldo) {
        this.noCuenta = noCuenta;
        this.titular = titular;
        this.edad = edad;
        this.saldo = saldo;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void ingresarEfectivo(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            JOptionPane.showMessageDialog(null, "Monto inválido.");
        }
    }

    public boolean retirarEfectivo(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Monto inválido o saldo insuficiente.");
            return false;
        }
    }

    public boolean depositar(Cuenta cuentaDestino, double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            cuentaDestino.ingresarEfectivo(monto);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Monto inválido o saldo insuficiente.");
            return false;

        }
    }
}