package C_NumRacional;

import java.util.Scanner;

public class Main_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Racional r1 = new Racional(1, 2);
        Racional r2 = new Racional(2, 3);

        while (true) {
            System.out.println("1. Sumar");
            System.out.println("2. Multiplicar");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Racional suma = r1.sumar(r2);
                    System.out.println("La suma es: " + suma);
                    break;
                case 2:
                    Racional producto = r1.multiplicar(r2);
                    System.out.println("El producto es: " + producto);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}