package H_ResolvedorRaíces;

public class RootResolver {
    private static float tolerance = 0.001F;

    public static float getTolerance() {
        return tolerance;
    }

    public static void setTolerance(float aTolerance) {
        tolerance = aTolerance;
    }

    public static float solve(FunctionInterface function, float start, float end)
            throws NonValidIntervalException {
        validateInterval(end, start, function);

        // Use whitespace to separate logical blocks of code
        while (differentSign(function, start, end) && (end - start) > getTolerance()) {
            float middle = (start + end) / 2;

            if (differentSign(function, start, middle)) {
                end = middle;
            } else if (differentSign(function, end, middle)) {
                start = middle;
            } else {
                return middle;
            }
        }

        return (start + end) / 2;
    }

    private static void validateInterval(float end, float start, FunctionInterface function)
            throws NonValidIntervalException {
        if ((end - start) <= 0) {
            throw new NonValidIntervalException(function, start, end,
                    NonValidIntervalException.ErrorType.NOT_AN_INTERVAL);
        }

        if (!differentSign(function, start, end)) {
            throw new NonValidIntervalException(function, start, end,
                    NonValidIntervalException.ErrorType.INTERVAL_NOT_VALID);
        }
    }

    private static boolean differentSign(FunctionInterface function, float i, float f) {
        return function.evaluate(i) * function.evaluate(f) < 0;
    }
}