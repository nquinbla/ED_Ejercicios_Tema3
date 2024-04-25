package C_NumRacional;

public class Racional {
    private int numerador;
    private int denominador;

    public Racional() {
        this.numerador = 0;
        this.denominador = 1;
    }

    public Racional(Racional r) {
        this.numerador = r.numerador;
        this.denominador = r.denominador;
    }

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    public Racional sumar(Racional r) {
        int numerador = this.numerador * r.denominador + this.denominador * r.numerador;
        int denominador = this.denominador * r.denominador;
        return new Racional(numerador, denominador);
    }

    public Racional multiplicar(Racional r) {
        int numerador = this.numerador * r.numerador;
        int denominador = this.denominador * r.denominador;
        return new Racional(numerador, denominador);
    }

    private void simplificar() {
        int gcd = gcd(numerador, denominador);
        numerador /= gcd;
        denominador /= gcd;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}
