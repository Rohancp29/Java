import java.util.*;

public class FractionalDecimal {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        if ((numerator < 0) ^ (denominator < 0)) {
            result.append("-");
        }
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);
        result.append(num / den);
        num %= den;
        if (num == 0) {
            return result.toString();
        }

        result.append(".");
        Map<Long, Integer> remainderMap = new HashMap<>();

        while (num != 0 && !remainderMap.containsKey(num)) {
            remainderMap.put(num, result.length());
            num *= 10;
            result.append(num / den);
            num %= den;
        }
        if (remainderMap.containsKey(num)) {
            int repeatingIndex = remainderMap.get(num);
            result.insert(repeatingIndex, "(");
            result.append(")");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        FractionalDecimal sol = new FractionalDecimal();
        System.out.println("Normal Number" + sol.fractionToDecimal(1, 2));
        System.out.println("Point Number" + sol.fractionToDecimal(2, 3));
        System.out.println("Fraction" + sol.fractionToDecimal(4, 333));
        System.out.println("Negative Number" + sol.fractionToDecimal(-1, 2));
        System.out.println("Zero Number" + sol.fractionToDecimal(0, 5));
    }
}