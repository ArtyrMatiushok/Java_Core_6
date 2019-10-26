package Les_6;
import Les_6_2.MyCalculator;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x = ");
        double x = in.nextDouble();
        System.out.println("Enter y = ");
        double y = in.nextDouble();
        MyCalculator myCalculator = new MyCalculator();
        System.out.println("x+y= " + myCalculator.Plus(x,y));
        System.out.println("x-y= " + myCalculator.Minus(x,y));
        System.out.println("x*y= " + myCalculator.Multiply(x,y));
        System.out.println("x/y= " + myCalculator.Divide(x,y));
    }

}