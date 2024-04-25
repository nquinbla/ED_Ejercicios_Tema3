package D_NumComplejo;

import java.util.Scanner;

public class Main_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la parte real e imaginaria del primer número complejo:");
        double real1 = scanner.nextDouble();
        double imaginario1 = scanner.nextDouble();
        Complejo c1 = new Complejo(real1, imaginario1);

        System.out.println("Introduce la parte real e imaginaria del segundo número complejo:");
        double real2 = scanner.nextDouble();
        double imaginario2 = scanner.nextDouble();
        Complejo c2 = new Complejo(real2, imaginario2);

        while (true) {
            System.out.println("1. Sumar");
            System.out.println("2. Multiplicar");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Complejo suma = c1.sumar(c2);
                    System.out.println("La suma es: " + suma);
                    break;
                case 2:
                    Complejo producto = c1.multiplicar(c2);
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
