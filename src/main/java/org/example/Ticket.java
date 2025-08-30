package org.example;

public class Ticket {
    int personas;
    String localidad;
    int precioUnitario;
    int total;

    public Ticket(int personas, String localidad, int precioUnitario) {
        this.personas = personas;
        this.localidad = localidad;
        this.precioUnitario = precioUnitario;
        this.total = personas * precioUnitario;
    }

    public void mostrar() {
        System.out.println("Localidad: " + localidad);
        System.out.println("Personas: " + personas);
        System.out.println("Precio por persona: $" + precioUnitario);
        System.out.println("Total a pagar: $" + total);
    }
}
