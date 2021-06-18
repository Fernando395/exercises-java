public class HighestValue {

    public static double calc(double value1, double value2, double value3, double value4) {
        double bigger = Math.max(value1, value2);
        if (bigger < value3) {
            bigger = value3;
        } else if (bigger < value4) {
            bigger = value4;
        }


        return bigger;
    }
}
