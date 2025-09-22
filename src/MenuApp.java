import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



// Menú principal
public class MenuApp {
    private Crud<String> alumnos = new Alumnos();
    private Crud<String> materias = new Materias();
    private Scanner sc = new Scanner(System.in);


    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            System.out.println("===== MENÚ PRINCIPAL =====");
            System.out.println("1. Gestión de Alumnos");
            System.out.println("2. Gestión de Materias");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> menuAlumnos();
                case 2 -> menuMaterias();
                case 3 -> salir = true;
                default -> System.out.println("Opción inválida");
            }
        }
    }

    private void menuAlumnos() {
        System.out.println("===== ALUMNOS =====");
        System.out.println("1. Agregar alumno");
        System.out.println("2. Listar alumno por posición");
        System.out.println("3. Cantidad de alumnos");
        System.out.println("4. Eliminar alumno por posición");
        System.out.print("Seleccione una opción: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1 -> {
                System.out.print("Nombre del alumno: ");
                String nombre = sc.nextLine();
                alumnosCrud.add(nombre);
            }
            case 2 -> {
                System.out.print("Posición: ");
                int pos = sc.nextInt();
                sc.nextLine();
                System.out.println("Alumno: " + alumnosCrud.get(pos));
            }
            case 3 -> System.out.println("Cantidad de alumnos: " + alumnosCrud.size());
            case 4 -> {
                System.out.print("Posición a eliminar: ");
                int pos = sc.nextInt();
                sc.nextLine();
                alumnosCrud.delete(pos);
            }
            default -> System.out.println("Opción inválida");
        }
    }

    private void menuMaterias() {
        System.out.println("===== MATERIAS =====");
        System.out.println("1. Agregar materia");
        System.out.println("2. Listar materia por posición");
        System.out.println("3. Cantidad de materias");
        System.out.println("4. Eliminar materia por posición");
        System.out.print("Seleccione una opción: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1 -> {
                System.out.print("Nombre de la materia: ");
                String nombre = sc.nextLine();
                materiasCrud.add(nombre);
            }
            case 2 -> {
                System.out.print("Posición: ");
                int pos = sc.nextInt();
                sc.nextLine();
                System.out.println("Materia: " + materiasCrud.get(pos));
            }
            case 3 -> System.out.println("Cantidad de materias: " + materiasCrud.size());
            case 4 -> {
                System.out.print("Posición a eliminar: ");
                int pos = sc.nextInt();
                sc.nextLine();
                materiasCrud.delete(pos);
            }
            default -> System.out.println("Opción inválida");
        }
    }

    public static void main(String[] args) {
        new MenuApp().iniciar();
    }
}