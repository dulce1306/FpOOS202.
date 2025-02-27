
import javax.swing.JOptionPane;


public class Cuenta {
    private int noCuenta;
    private String titular;
    private int edad;
    private double saldo;

    // constructor
    public Cuenta(int noCuenta, String titular, int edad, double saldo) {
        this.noCuenta = noCuenta;
        this.titular = titular;
        this.edad = edad;
        this.saldo = saldo;
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
    // zona de gets y sets
    public int getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}