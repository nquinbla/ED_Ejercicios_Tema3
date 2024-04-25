package J_Empresa;

public class Viajante extends Empleado {
    private int viajes;

    public Viajante(int viajes) {
        this.viajes = viajes;
    }

    @Override
    public float calcularSalario() {
        return SUELDO_BASE + 300 * viajes;
    }
}