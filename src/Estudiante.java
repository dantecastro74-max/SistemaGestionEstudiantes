
/**
 * Clase Estudiante.
 * Representa a un estudiante con sus datos académicos.
 */
public class Estudiante {

    // Atributos del estudiante
    private String matricula;
    private String nombre;
    private String carrera;
    private double promedio;

    /**
     * Constructor que inicializa los datos del estudiante.
     */
    public Estudiante(String matricula, String nombre,
                      String carrera, double promedio) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    /**
     * Muestra los datos del estudiante en pantalla.
     */
    public void mostrarInformacion() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio: " + promedio);
    }

    /**
     * Actualiza el promedio del estudiante.
     */
    public void actualizarPromedio(double nuevoPromedio) {
        if (nuevoPromedio >= 0 && nuevoPromedio <= 100) {
            this.promedio = nuevoPromedio;
        } else {
            System.out.println("Promedio no válido.");
        }
    }

    /**
     * Verifica si el estudiante aprobó.
     * Se considera aprobado con promedio mayor o igual a 70.
     */
    public boolean estaAprobado() {
        return promedio >= 70;
    }
}
