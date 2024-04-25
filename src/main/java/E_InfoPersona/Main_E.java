package E_InfoPersona;

import java.util.Scanner;

public class Main_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Introduce la edad:");
        int edad = scanner.nextInt();

        System.out.println("Introduce el sexo (1 para HOMBRE, 2 para MUJER):");
        int sexoInt = scanner.nextInt();
        Persona.Sexo sexo = (sexoInt == 1) ? Persona.Sexo.HOMBRE : Persona.Sexo.MUJER;

        System.out.println("Introduce el peso:");
        double peso = scanner.nextDouble();

        System.out.println("Introduce la altura:");
        double altura = scanner.nextDouble();

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();

        persona3.setNombre(nombre);
        persona3.setEdad(edad);
        persona3.setSexo(sexo);

        Persona[] personas = {persona1, persona2, persona3};

        for (Persona persona : personas) {
            int valoracion = persona.valorarPesoCorporal();
            String valoracionStr = (valoracion == -1) ? "por debajo de su peso ideal" : (valoracion == 0) ? "en su peso ideal" : "con sobrepeso";
            System.out.println(persona.getNombre() + " está " + valoracionStr);

            String mayorDeEdadStr = persona.esMayorDeEdad() ? "es mayor de edad" : "no es mayor de edad";
            System.out.println(persona.getNombre() + " " + mayorDeEdadStr);

            System.out.println(persona);
        }
    }
}