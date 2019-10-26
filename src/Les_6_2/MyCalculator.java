package Les_6_2;
import Les_6_1.Numerable;
public class MyCalculator implements Numerable {
    @Override
    public double Divide(double x, double y) {
        return x/y;
    }

    @Override
    public double Minus(double x, double y) {
        return x-y;
    }

    @Override
    public double Multiply(double x, double y) {
        return x*y;
    }

    @Override
    public double Plus(double x, double y) {
        return x+y;
    }
}