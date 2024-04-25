package A_ObjTresDimensiones;

public class Punto3D {
    private double x;
    private double y;
    private double z;

    // inicializa el punto al origen de coordenadas
    public Punto3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    //especificar las coordenadas del punto
    public Punto3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //método toString()
    @Override
    public String toString() {
        return "Punto3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
