package G_GuerraMarcianos;

public class Terrícola {
    private int salud = 100;

    public void atacar(Marciano nave) {
        nave.recibirDaño(10);
    }

    public void recibirDaño(int daño) {
        salud -= daño;
    }

    public boolean estaVivo() {
        return salud > 0;
    }
}
