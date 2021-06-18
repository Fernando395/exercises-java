public class CheckerTriangle {
    public static boolean checker(double value1, double value2, double value3) {
        boolean result = true;
        if (value1 == 0 || value1 >= value2 + value3) {
            result = false;
        } else if (value2 == 0 || value2 >= value1 + value3) {
            result = false;
        } else if (value3 == 0 || value3 >= value1 + value2) {
            result = false;

        }
        return result;
    }
}
