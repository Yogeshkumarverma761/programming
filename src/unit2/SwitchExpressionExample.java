package unit2;
import java.util.*;

public class SwitchExpressionExample {
    public static void main(String args[]) {
        int number = 3;

        String result = switch (number) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> {
                System.out.println("Performing extra logic...");
                yield "Three";
            }
            default -> "Unknown";
        };

        System.out.println(result);
    }
}


