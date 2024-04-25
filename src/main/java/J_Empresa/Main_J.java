package J_Empresa;

import java.util.Random;

    public class Main_J {
        public static void main(String[] args) {
            Random random = new Random();
            Empleado[] empleados = new Empleado[22];

            for (int i = 0; i < 2; i++) {
                empleados[i] = new Jefe(random.nextInt(11));
            }

            for (int i = 2; i < 7; i++) {
                empleados[i] = new Viajante(random.nextInt(11));
            }

            for (int i = 7; i < 22; i++) {
                empleados[i] = new Empleado();
            }

            for (int i = 0; i < 22; i++) {
                System.out.println("Salario del empleado " + (i + 1) + ": " + empleados[i].calcularSalario());
            }
        }
    }

