package I_ExtensionRootResolver;

import H_ResolvedorRaíces.FunctionInterface;
import H_ResolvedorRaíces.Polinomio;
import H_ResolvedorRaíces.NonValidIntervalException;

public class Main_I {
    public static void main(String[] args) {
        Polinomio polinomio = new Polinomio(new double[]{1, -3, 2}); // x^2 - 3x + 2

        FunctionInterface function = x -> (float) polinomio.evaluar(x);

        try {
            float raiz = ExtensiónResolvRaices.solve(function);
            System.out.println("La raíz del polinomio es: " + raiz);
        } catch (NonValidIntervalException e) {
            System.out.println("Error al resolver la raíz: " + e);
        }
    }
}
