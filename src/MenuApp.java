import java.util.ArrayList;
import java.util.Scanner;

import Materia.Materias;
import alumnos.Alumnos;

public class MenuApp {

    private Scanner sc = new Scanner(System.in);
    private Alumnos alumnosCrud = new Alumnos();
    private Materias materiasCrud = new Materias();

    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            System.out.println("===== MENÚ PRINCIPAL =====");
            System.out.println("1. Gestión de Alumnos");
            System.out.println("2. Gestión de Materias");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> menuAlumnos();
                case 2 -> menuMaterias();
                case 3 -> salir = true;
                default -> System.out.println("Opción inválida");
            }
        }
    }

    private void menuAlumnos() {
        boolean salir = false;
        while (!salir) {
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
                    ArrayList<String> listaAlum = alumnosCrud.getAll();
                    for (int i = 0; i < listaAlum.size(); i++) {
                        System.out.println(i + ":" + listaAlum.get(i));
                    }
                }
                case 2 -> {
                    // Agregar alumnos
                    System.out.println("Ingrese el nombre del alumno: ");
                    String nombreAlum = sc.nextLine();
                    alumnosCrud.add(nombreAlum);
                }
                case 3 -> {
                    // Eliminar alumnos
                    System.out.println("Ingrese el ID del alumno a borrar: ");
                    int idAlum = sc.nextInt();
                    sc.nextLine();

                    alumnosCrud.delete(idAlum);
                }
                case 4 -> salir = true;

                default -> System.out.println("Opción inválida");
            }
        }
    }

    private void menuMaterias() {
        boolean salir = false;
        while (!salir) {
            System.out.println("===== MATERIAS =====");
            System.out.println("1. Listar materia");
            System.out.println("2. Agregar materia ");
            System.out.println("3. Eliminar materia ");
            System.out.println("4. Volver");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
               case 1 -> {
                    // listar materias
                    ArrayList<String> listaMat = materiasCrud.getAll();
                    for (int i = 0; i < listaMat.size(); i++) {
                        System.out.println(i + ":" + listaMat.get(i));
                    }
                }
                case 2 -> {
                    // agrega materias
                    System.out.println("Ingrese el nombre de la materia: ");
                    String nombreMat = sc.nextLine();
                    materiasCrud.add(nombreMat);
                }

                case 3 -> {
                    // Eliminar materias
                    System.out.println("Ingrese el ID de la materia a borrar: ");
                    int numeroMat = sc.nextInt();
                    sc.nextLine();
                    materiasCrud.delete(numeroMat);
                }
                case 4 -> salir = true;
                default -> System.out.println("Opción inválida");
            }
        }

    }

    public static void main(String[] args) {
        new MenuApp().iniciar();
    }
}