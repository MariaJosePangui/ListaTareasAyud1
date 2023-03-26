package com.mycompany.listatareaayud1;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaTareaAyud1 {
    private ArrayList<String> tareas;

    public ListaTareaAyud1() {
        tareas = new ArrayList<String>();
    }

    public void agregarTarea(String tarea) {
        tareas.add(tarea);
    }

    public void eliminarTarea(int indice) {
        tareas.remove(indice);
    }

    public void mostrarTareas() {
        System.out.println("\n Tareas:");
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println(i + 1 + ". " + tareas.get(i));
        }
    }

    public static void main(String[] args) {
        ListaTareaAyud1 lista = new ListaTareaAyud1 ();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar tarea de limpieza");
            System.out.println("2. Eliminar tarea de limpieza");
            System.out.println("3. Mostrar tareas de limpieza");
            System.out.println("4. Salir");
            System.out.print("Ingrese un número: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese una tarea de limpieza: ");
                    String tarea = scanner.nextLine();
                    lista.agregarTarea(tarea);
                    break;
                case 2:
                    lista.mostrarTareas();
                    System.out.print("Ingrese el número de la tarea que desea eliminar: ");
                    int indice = scanner.nextInt();
                    lista.eliminarTarea(indice - 1);
                    break;
                case 3:
                    lista.mostrarTareas();
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Te equivocaste al colocar un número, intentalo nuevamente");
            }
        }
        scanner.close();
    }
}


