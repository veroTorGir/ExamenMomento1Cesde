
import org.example.Calculadora;

import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Número de personas: ");
    int personas = sc.nextInt();

    System.out.print("Seleccione localidad (1=General, 2=Palco, 3=VIP): ");
    int opcion = sc.nextInt();

    Calculadora.procesarTicket(personas, opcion);
}

