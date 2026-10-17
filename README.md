
# Sistema de Gestión de Estudiantes

## Descripción
Aplicación desarrollada en Java que permite gestionar
información básica de estudiantes mediante los
principios de la Programación Orientada a Objetos (POO).

## Objetivo
Demostrar el uso de clases, atributos, objetos,
constructores y métodos mediante una aplicación
funcional desarrollada en Java.

## Tecnologías utilizadas
- Java 21
- Visual Studio Code
- Git
- GitHub

## Estructura del proyecto

src/
- App.java
- Estudiante.java

## Clases principales

### Estudiante.java
Representa a un estudiante mediante los atributos:
- Matrícula
- Nombre
- Carrera
- Promedio

Contiene los siguientes métodos:

- mostrarInformacion(): muestra los datos del estudiante.
- actualizarPromedio(): modifica el promedio académico.
- estaAprobado(): determina si el estudiante aprobó.

También incluye un constructor para inicializar
los atributos al crear un objeto.

### App.java
Es la clase principal de la aplicación.

Contiene el método main(), encargado de:
1. Crear dos objetos de tipo Estudiante.
2. Mostrar sus datos académicos.
3. Verificar si aprobaron.
4. Actualizar el promedio de un estudiante.
5. Mostrar los resultados en consola.

## Conceptos de POO aplicados
- Clases y atributos
- Encapsulamiento
- Constructores
- Instanciación de objetos
- Métodos con parámetros
- Métodos con valores de retorno

## Ejecución
1. Abrir el proyecto en Visual Studio Code.
2. Tener instalado Java JDK 21.
3. Abrir el archivo src/App.java.
4. Ejecutar el método main() mediante Run.
5. Consultar los resultados en la terminal.

## Pruebas realizadas
Se verificó:
- La creación correcta de objetos.
- La visualización de información.
- La actualización del promedio.
- La identificación de estudiantes aprobados y reprobados.
- La depuración mediante breakpoints en Visual Studio Code.

## Autor
Dante Castro

## Propósito
Proyecto académico para la asignatura
Programación Orientada a Objetos.