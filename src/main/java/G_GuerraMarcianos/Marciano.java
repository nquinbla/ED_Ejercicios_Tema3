package G_GuerraMarcianos;

public class Marciano {
    private int salud = 200;

    public void atacar(Terrícola nave) {
        nave.recibirDaño(10);
    }

    public void recibirDaño(int daño) {
        salud -= daño;
    }

    public boolean estaVivo() {
        return salud > 0;
    }
}
