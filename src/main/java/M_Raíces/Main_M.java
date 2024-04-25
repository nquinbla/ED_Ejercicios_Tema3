package M_Raíces;

public class Main_M {
    public static void main(String[] args) {
        FunctionInterface function = new FunctionInterface() {
            @Override
            public float evaluate(float x) {
                return x * x - 3 * x + 2;
            }

            @Override
            public float derivative(float x) {
                return 2 * x - 3;
            }
        };

        float x0 = 1.0f;  // Estimación inicial
        float raiz = ResolvedorRaíces.solve(function, x0);
        System.out.println("La raíz de la función es: " + raiz);
    }
}