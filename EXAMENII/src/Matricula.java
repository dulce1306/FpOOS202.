import java.util.Random;

public class Matricula {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int anoNacimiento;
    private String carrera;

    public Matricula(String nombre, String apellidoPaterno, String apellidoMaterno, int anoNacimiento, String carrera) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.anoNacimiento = anoNacimiento;
        this.carrera = carrera;
    }

    public String GenerarMatricula() {
        Random random = new Random();
        int anoActual = java.time.Year.now().getValue();
        String Matricula = "";
        Matricula += nombre.charAt(0);
        Matricula += apellidoPaterno.substring(0, 2).toUpperCase();
        Matricula += apellidoMaterno.substring(0, 2).toUpperCase();
        Matricula += String.valueOf(anoNacimiento).substring(2);
        Matricula += String.valueOf(anoActual).substring(2);
        Matricula += carrera.substring(0, 3).toUpperCase();
        Matricula += String.format("%02d", random.nextInt(100));
        return Matricula;
    }
}
