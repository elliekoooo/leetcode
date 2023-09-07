import java.util.Arrays;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        StringBuilder str = new StringBuilder().append(x);
        StringBuilder reverse = new StringBuilder().append(x).reverse();

        return str.compareTo(reverse) == 0;
    }

    public static void main(String args[]) {
        isPalindrome(12521);
    };
};



