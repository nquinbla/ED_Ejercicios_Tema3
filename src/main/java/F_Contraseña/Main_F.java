package F_Contraseña;
import java.util.Scanner;

public class Main_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el tamaño del array:");
        int size = scanner.nextInt();

        Password[] passwords = new Password[size];
        boolean[] isStrong = new boolean[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Introduce la longitud de la contraseña " + (i + 1) + ":");
            int longitud = scanner.nextInt();
            passwords[i] = new Password(longitud);
            isStrong[i] = passwords[i].esFuerte();
        }

        for (int i = 0; i < size; i++) {
            System.out.println("Contraseña " + (i + 1) + ": " + passwords[i].getContraseña() + ", es fuerte: " + isStrong[i]);
        }
    }
}
