import java.util.Random;

public class generadorPassword {
    private int longitud;
    private boolean incluirMayusculas;
    private boolean incluirEspeciales;

    // Constructor
    public generadorPassword(int longitud, boolean incluirMayusculas, boolean incluirEspeciales) {
        setLongitud(longitud); //  setter para validar la longitud
        this.incluirMayusculas = incluirMayusculas;
        this.incluirEspeciales = incluirEspeciales;
    }

    // Metodo para generar contraseña
    public String generarPassword() {
        StringBuilder caracteres = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
        if (incluirMayusculas) {
            caracteres.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        }
        if (incluirEspeciales) {
            caracteres.append("!@#$%^&*()_+-=[]|,./?><");
        }

        Random random = new Random();
        StringBuilder password = new StringBuilder(longitud);
        for (int i = 0; i < longitud; i++) {
            password.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }
        return password.toString();
    }

    // metodo para comprobar fortaleza
    public String comprobarFortaleza(String password) {
        if (password.length() < 8) {
            return "Débil";
        } else if (password.matches(".*[!@#$%^&*()_+\\-=\\[\\]|,./?><].*")) {
            return "Fuerte";
        } else {
            return "Moderada";
        }
    }

    // Getters y Setters con validaciones
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        if (longitud < 4) {
            throw new IllegalArgumentException("La longitud mínima debe ser 4 caracteres.");
        }
        this.longitud = longitud;
    }

    public boolean isIncluirMayusculas() {
        return incluirMayusculas;
    }

    public void setIncluirMayusculas(boolean incluirMayusculas) {
        this.incluirMayusculas = incluirMayusculas;
    }

    public boolean isIncluirEspeciales() {
        return incluirEspeciales;
    }

    public void setIncluirEspeciales(boolean incluirEspeciales) {
        this.incluirEspeciales = incluirEspeciales;
    }


    //metodo toString para mostrar configuracion de la clase
    public String toString() {
        return "GeneradorPassword{" +
                "longitud=" + longitud +
                ", incluirMayusculas=" + incluirMayusculas +
                ", incluirEspeciales=" + incluirEspeciales +
                '}';
    }
}
