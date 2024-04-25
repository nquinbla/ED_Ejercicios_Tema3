package J_Empresa;

public class Jefe extends Empleado {
    private int años;

    public Jefe(int años) {
        this.años = años;
    }

    @Override
    public float calcularSalario() {
        return SUELDO_BASE + 500 * años;
    }
}