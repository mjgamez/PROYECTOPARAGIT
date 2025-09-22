import java.util.Scanner;

public class MenuApp {
   
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
        boolean salir= false;
        while(!salir){
        System.out.println("===== ALUMNOS =====");
        System.out.println("1. Listar Alumnos");
        System.out.println("2. Agregar Alumnos");
        System.out.println("3. Eliminar Alumnos");
        System.out.println("4. Atrás");
        System.out.print("Seleccione una opción: ");
        int opcion = sc.nextInt();
        sc.nextLine();


        switch (opcion) {
                      
            case 1 -> {
                // listar alumnos
            }
            case 2 -> {
               // Agregar alumnos
            }
            case 3 -> {
                // Eliminar alumnos
            }
            case 4 -> {
                salir= true;
               break;
            }
          
            default -> {}
        }
    }
    }

    private void menuMaterias() {
        boolean salir = false;
        while(!salir){
        System.out.println("===== MATERIAS =====");
        System.out.println("1. Agregar materia");
        System.out.println("2. Listar materia ");
        System.out.println("3. Eliminar materia ");
        System.out.println("4. Volver");
        System.out.print("Seleccione una opción: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1 -> {
                // agregar materia
            }
            case 2 -> {
                // lista materias
            }

            case 3 -> {
                // Eliminar materias
            }
            case 4 -> {
                // salir
            }
            default -> System.out.println("Opción inválida");
        }}

    }

    public static void main(String[] args) {
        new MenuApp().iniciar();
    }
}