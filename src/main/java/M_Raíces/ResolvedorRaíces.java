package M_Raíces;

public class ResolvedorRaíces {
    private static final float EPSILON = 0.0001f;
    private static final int MAX_ITERATIONS = 1000;

    public static float solve(FunctionInterface function, float x0) {
        float x = x0;
        int iterations = 0;

        while (Math.abs(function.evaluate(x)) > EPSILON && iterations < MAX_ITERATIONS) {
            x = x - function.evaluate(x) / function.derivative(x);
            iterations++;
        }

        if (iterations == MAX_ITERATIONS) {
            throw new RuntimeException("El algoritmo de Newton-Raphson no convergió");
        }

        return x;
    }
}
