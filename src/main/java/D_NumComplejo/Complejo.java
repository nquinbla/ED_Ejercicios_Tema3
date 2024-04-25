package D_NumComplejo;

public class Complejo {
    private double real;
    private double imaginario;

    public Complejo() {
        this.real = 0;
        this.imaginario = 0;
    }

    public Complejo(Complejo c) {
        this.real = c.real;
        this.imaginario = c.imaginario;
    }

    public Complejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public Complejo sumar(Complejo c) {
        double real = this.real + c.real;
        double imaginario = this.imaginario + c.imaginario;
        return new Complejo(real, imaginario);
    }

    public Complejo multiplicar(Complejo c) {
        double real = this.real * c.real - this.imaginario * c.imaginario;
        double imaginario = this.real * c.imaginario + this.imaginario * c.real;
        return new Complejo(real, imaginario);
    }

    @Override
    public String toString() {
        return real + " + " + imaginario + "i";
    }
}
