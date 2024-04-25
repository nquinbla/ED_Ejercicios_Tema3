package G_GuerraMarcianos;

public class Marciano {
    private int salud = 100;

    public void atacar(Terricola nave) {
        nave.recibirDaño(10);
    }

    public void recibirDaño(int daño) {
        salud -= daño;
    }

    public boolean estaVivo() {
        return salud > 0;
    }
}
