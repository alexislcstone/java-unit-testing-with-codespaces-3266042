public class Calculator {

    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public double divide(double x, double y) {
        if (y == 0) {
            throw new IllegalArgumentException("Ints cannot be divided by zero");
        }
        return x / y;
    }

    public boolean isEven(int x) {
        return x % 2 == 0;
    }

    public int[] incrementArray(int[] values) {
        // make sure the new array is the same length as the old array
        int[] newValues = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            newValues[i] = values[i] + 1;
        }
        return newValues;
    }

}