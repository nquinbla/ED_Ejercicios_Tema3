package E_InfoPersona;

public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private Sexo sexo;
    private double peso;
    private double altura;

    public enum Sexo {
        HOMBRE, MUJER
    }

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.DNI = generaDNI();
        this.sexo = Sexo.MUJER;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, Sexo sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, Sexo sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public int valorarPesoCorporal() {
        double imc = calcularIMC();
        if (imc < 18) {
            return -1;
        } else if (imc > 25) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", DNI: " + DNI + ", Sexo: " + sexo + ", Peso: " + peso + ", Altura: " + altura;
    }

    private String generaDNI() {return String.format("%08d", (int) (Math.random() * 100000000));}

    // Métodos set para cada parámetro, excepto DNI
    public void setNombre(String nombre) {this.nombre = nombre;}

    public void setEdad(int edad) {this.edad = edad;}

    public void setSexo(Sexo sexo) {this.sexo = sexo;}

    public void setPeso(double peso) {this.peso = peso;}

    public void setAltura(double altura) {this.altura = altura;}
}
