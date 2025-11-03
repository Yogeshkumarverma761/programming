
import java.util.*;
// FunctionalInterfaceExample.java

@FunctionalInterface
interface Operation {
    int calculate(int n);
}

public class YogeshKumarVerma {

    // Static method for Method Reference
    public static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        int num = 5;

        // (a) Using Anonymous Inner Class
        Operation op1 = new Operation() {
            @Override
            public int calculate(int n) {
                return n * n;
            }
        };
        System.out.println("Square using Anonymous Inner Class: " + op1.calculate(num));

        // (b) Using Lambda Expression
        Operation op2 = (n) -> n * n;
        System.out.println("Square using Lambda Expression: " + op2.calculate(num));

        // (c) Using Method Reference (to static method)
        Operation op3 = YogeshKumarVerma::square;
        System.out.println("Square using Method Reference: " + op3.calculate(num));
    }
}

