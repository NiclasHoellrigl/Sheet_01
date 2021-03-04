import java.util.Arrays;

public class TimesTwo {
    static void timesTwo(int value) {
        value *= 2;
        System.out.println(value);
    }

    static void timesTwo(int[] valueArray) {
        for (int i = 0; i < valueArray.length; i++) {
            valueArray[i] *= 2;
        }
        String output = Arrays.toString(valueArray);
        System.out.println(output);
    }

    public static void main(String[] args) {
        int testValue = 42;
        System.out.println("Before the Method call:");
        System.out.println(testValue);
        int[] testArray = {12, 24, 48, 3};
        System.out.println(Arrays.toString(testArray));
        System.out.println("Method call:");
        timesTwo(testValue);
        timesTwo(testArray);
        System.out.println("After the Method call:");
        System.out.println(testValue);
        System.out.println(Arrays.toString(testArray));
    }
}
