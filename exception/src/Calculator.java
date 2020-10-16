public class Calculator {

    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String MULTIPLY = "*";
    private static final String DIVIDE = "/";

    double calculate(double x, double y, String operator) {
        double result = 0;

        switch (operator) {
            case PLUS:
                result = x + y;
                break;
            case MINUS:
                result = x - y;
                break;
            case MULTIPLY:
                result = x * y;
                break;
            case DIVIDE:
                if (y == 0)
                    throw new ArithmeticException("Nie dziel przez ZERO");
                result = x / y;
                break;
            default:
                throw new UnknowOperationExeption("Wykorzystujesz niezdefiniowany operator arytmetyczny");
        }
            return result;
    }
}

