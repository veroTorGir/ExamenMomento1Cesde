package org.example;


public class Calculadora {
    public static void procesarTicket(int personas, int opcion) {
        String localidad = "";
        int precio = 0;

        switch (opcion) {
            case 1:
                localidad = "General";
                precio = 20000;
                break;
            case 2:
                localidad = "Palco";
                precio = 50000;
                break;
            case 3:
                localidad = "VIP";
                precio = 80000;
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        new Ticket(personas, localidad, precio).mostrar();
    }
}
