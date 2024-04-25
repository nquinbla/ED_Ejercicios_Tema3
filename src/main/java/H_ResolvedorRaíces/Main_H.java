package H_ResolvedorRaíces;

public class Main_H {
    public static void main(String[] args) {
        Polinomio polinomio = new Polinomio(new double[]{1, -3, 2}); // x^2 - 3x + 2

        FunctionInterface function = x -> (float) polinomio.evaluar(x);
        try {
            float raiz = RootResolver.solve(function, 0.0f, 2.0f);
            System.out.println("La raíz del polinomio es: " + raiz);
        } catch (NonValidIntervalException e) {
            System.out.println("Error al resolver la raíz: " + e);
        }
    }
}