package com.mycompany.srpnotas;

import java.util.ArrayList;
import java.util.Scanner;

public class SRPnotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> listado_estudiantes = new ArrayList<>();
        UsuarioReportes notas = null;

        System.out.print("Cantidad de estudiantes: ");
        int cantidadEstudiantes = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= cantidadEstudiantes; i++) {
            System.out.print("Nombre " + i + ": ");
            String nombre = scanner.nextLine();

            System.out.print("GENERO " + nombre + " (HOMBRE O MUJER): ");
            String genero = scanner.nextLine();
            boolean sexo = genero.equalsIgnoreCase("MUJER");

            System.out.print("NOTA DEL ESTUDIANTE " + i + ": ");
            double nota = scanner.nextDouble();
            scanner.nextLine();

            listado_estudiantes.add(new Usuario(nombre, nota, sexo));
        }

        notas = new UsuarioReportes(listado_estudiantes);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Consultar notas de estudiantes hombres");
            System.out.println("2. Consultar notas de estudiantes mujeres");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                notas.consultarNotasSexoM();
            } else if (opcion == 2) {
                notas.consultarNotasSexoF();
            } else if (opcion == 3) {
                System.out.println("FIN");
                break;
            } else {
                System.out.println("Opción inválida.");
            }
        }
    }
}