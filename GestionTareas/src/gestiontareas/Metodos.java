package gestiontareas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Metodos {
    private Map<String, Tareas> tarea;

    public Metodos() {
        tarea = new HashMap<>();
    }

    public void agregarTarea(String nombre, int prioridad) {
        if (tarea.containsKey(nombre)) {
            System.out.println("\nLa tarea ya existe.");
            return;
        }
        if (prioridad < 1 || prioridad > 5) {
            System.out.println("\nLa prioridad debe estar entre 1 y 5.");
            return;
        }
        tarea.put(nombre, new Tareas(nombre, prioridad));
        System.out.println("\nTarea agregada.");
    }

    public void mostrarTareas() {
        if (tarea.isEmpty()) {
            System.out.println("\nNo hay tareas para mostrar.");
            return;
        }
        System.out.println("\nLista de tareas ordenadas:");
        tarea.values().stream()
            .sorted(Comparator.comparingInt(Tareas::getPrioridad))
            .forEach(tareas -> System.out.println("[Prioridad " + tareas.getPrioridad() + "] " + tareas.getNombre()));
    }

    public void eliminarTarea(String nombre) {
        if (!tarea.containsKey(nombre)) {
            System.out.println("\nLa tarea no existe.");
            return;
        }
        tarea.remove(nombre);
        System.out.println("\nTarea eliminada.");
    }

    public void completarTarea(String nombre) {
        if (!tarea.containsKey(nombre)) {
            System.out.println("\nLa tarea no existe.");
            return;
        }
        tarea.remove(nombre);
        System.out.println("\nTarea completada y eliminada.");
    }
    }
