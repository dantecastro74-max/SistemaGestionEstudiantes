
/**
 * Clase principal del Sistema de Gestión de Estudiantes.
 * Demuestra la creación de objetos y el uso de métodos.
 */
public class App {

    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE GESTIÓN DE ESTUDIANTES ===");

        // Crear objetos utilizando el constructor
        Estudiante estudiante1 = new Estudiante(
            "2026001", "Dante Castro",
            "Ingeniería en Software", 92.5
        );

        Estudiante estudiante2 = new Estudiante(
            "2026002", "Aime Castro",
            "Administración", 65.0
        );

        // Mostrar información del primer estudiante
        System.out.println("\n--- ESTUDIANTE 1 ---");
        estudiante1.mostrarInformacion();

        // Verificar si aprobó
        System.out.println("Estado: " +
            (estudiante1.estaAprobado() ? "Aprobado" : "Reprobado"));

        // Actualizar el promedio
        estudiante1.actualizarPromedio(95.0);

        System.out.println("\nDespués de actualizar el promedio:");
        estudiante1.mostrarInformacion();

        // Mostrar información del segundo estudiante
        System.out.println("\n--- ESTUDIANTE 2 ---");
        estudiante2.mostrarInformacion();

        System.out.println("Estado: " +
            (estudiante2.estaAprobado() ? "Aprobado" : "Reprobado"));
    }
}
