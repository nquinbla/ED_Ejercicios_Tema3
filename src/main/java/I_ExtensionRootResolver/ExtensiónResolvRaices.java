package I_ExtensionRootResolver;

import H_ResolvedorRaíces.FunctionInterface;
import H_ResolvedorRaíces.NonValidIntervalException;

public class ExtensiónResolvRaices {
    private static final float STEP_SIZE = 1.0f;

    public static float solve(FunctionInterface function) throws NonValidIntervalException {
        float start = 0.0f;
        float end = 0.0f;

        while (!hasDifferentSigns(function, start, end)) {
            start -= STEP_SIZE;
            end += STEP_SIZE;
        }

        return solve(function, start, end);
    }

    public static float solve(FunctionInterface function, float start, float end) throws NonValidIntervalException {
        float a = start;
        float b = end;
        float c;

        if (function.evaluate(a) * function.evaluate(b) > 0) {
            throw new NonValidIntervalException(function, a, b, NonValidIntervalException.ErrorType.INTERVAL_NOT_VALID);
        }

        float tolerance = 0.0001f;
        int maxIterations = 1000;
        for (int i = 0; i < maxIterations; i++) {
            c = (a + b) / 2;
            if (Math.abs(function.evaluate(c)) < tolerance) {
                return c;
            } else if (function.evaluate(a) * function.evaluate(c) < 0) {
                b = c;
            } else {
                a = c;
            }
        }

        throw new NonValidIntervalException(function, a, b, NonValidIntervalException.ErrorType.INTERVAL_NOT_VALID);
    }

    private static boolean hasDifferentSigns(FunctionInterface function, float start, float end) {
        return Math.signum(function.evaluate(start)) != Math.signum(function.evaluate(end));
    }
}