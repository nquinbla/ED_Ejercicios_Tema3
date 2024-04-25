package H_ResolvedorRaíces;

public class NonValidIntervalException extends Exception {
    public enum ErrorType {
        NOT_AN_INTERVAL, INTERVAL_NOT_VALID
    };

    private FunctionInterface function;
    private float start, end;
    private ErrorType error;

    public NonValidIntervalException(FunctionInterface function, float start,
                                     float end, ErrorType error) {
        this.function = function;
        this.start = start;
        this.end = end;
        this.error = error;
    }

    public String toString() {
        switch (getError()) {
            case NOT_AN_INTERVAL:
                return "No es un intervalo valido; el inicio es posterior al final";
            case INTERVAL_NOT_VALID:
                return "No es un intervalo valido; la funcion al principio " +
                        getFunction().evaluate(getStart()) + " y al final " +
                        getFunction().evaluate(getEnd());
            default:
                return "Se produjo algún error";
        }
    }

    // Group getter methods together
    public FunctionInterface getFunction() {
        return function;
    }

    public float getStart() {
        return start;
    }

    public float getEnd() {
        return end;
    }

    public ErrorType getError() {
        return error;
    }
}