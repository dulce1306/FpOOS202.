import java.util.Random;

public class generadorPassword {
    private int longitud;
    private boolean incluirMayusculas;
    private boolean incluirEspeciales;


    public generadorPassword(int longitud, boolean incluirMayusculas, boolean incluirEspeciales){
        this.longitud = longitud;
        this.incluirMayusculas = incluirMayusculas;
        this.incluirEspeciales = incluirEspeciales;


    }

    public String generarPassword(){
        String caracteres = "abcdefghijklmnopqrstuvwxyz";
        if (incluirMayusculas){
            caracteres += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }
        if (incluirEspeciales){
            caracteres += "!@#$%^&*()_+-=[]|,./?><";
        }
        Random random = new Random();
        StringBuilder password = new StringBuilder(longitud);
        for (int i = 0; i < longitud; i++){
            password.append(caracteres.charAt(random.nextInt(caracteres.length())));

        }
        return password.toString();
    }
    public String comprobarFortaleza(String password){
        if (password.length()< 8){
            return "Debil";

        } else if (password.matches(".[!@#$%^&()].*")) {
            return "Fuerte";

        }else {
            return "Moderada";
        }
    }

    }

