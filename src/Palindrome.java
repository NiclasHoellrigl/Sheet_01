import static java.lang.Character.toLowerCase;
import static java.util.Arrays.copyOfRange;

public class Palindrome {
    static boolean isPalindrome(char[] charArray) {
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            if (!(toLowerCase(charArray[i]) == toLowerCase(charArray[(length - 1) - i]))) {
                return false;
            }
        }
        return true;
    }

    static String findLargestPalindrome(char[] charArray) {
        String result = String.valueOf(charArray[0]); //The first single letter is always a palindrome.
        int max = 1;
        int len = charArray.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                char[] slice = copyOfRange(charArray, i, j);
                if (isPalindrome(slice) && slice.length > max) {
                    result = String.copyValueOf(slice);
                    max = slice.length;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("You have entered: " + args[0]);
        char[] inputCharArray = args[0].toCharArray();
        System.out.println("The longest palindrome is: " + findLargestPalindrome(inputCharArray));
    }
}
