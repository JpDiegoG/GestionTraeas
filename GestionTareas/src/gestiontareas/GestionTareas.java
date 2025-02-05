package gestiontareas;

import java.util.Scanner;

public class GestionTareas {

    public static void main(String[] args) {
        Metodos sistema = new Metodos();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Sistema de Gestión de Tareas ---");
            System.out.println("1. Agregar una nueva tarea");
            System.out.println("2. Mostrar todas las tareas");
            System.out.println("3. Eliminar una tarea");
            System.out.println("4. Marcar una tarea como completada");
            System.out.println("5. Salir");

            System.out.print("Elige una opción: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Ingresa el nombre de la tarea: ");
                    String nombre = scanner.nextLine().trim();
                    System.out.print("Ingresa la prioridad (1-5): ");
                    try {
                        int prioridad = Integer.parseInt(scanner.nextLine().trim());
                        sistema.agregarTarea(nombre, prioridad);
                    } catch (NumberFormatException e) {
                        System.out.println("\nLa prioridad debe ser un número entre 1 y 5.");
                    }
                    break;
                case "2":
                    sistema.mostrarTareas();
                    break;
                case "3":
                    System.out.print("Ingresa el nombre de la tarea a eliminar: ");
                    sistema.eliminarTarea(scanner.nextLine().trim());
                    break;
                case "4":
                    System.out.print("Ingresa el nombre de la tarea completada: ");
                    sistema.completarTarea(scanner.nextLine().trim());
                    break;
                case "5":
                    System.out.println("\nSaliendo del programa.");
                    scanner.close();
                    return;
                default:
                    System.out.println("\nOpción no válida. Intenta de nuevo.");
            }
        }
    }
}
