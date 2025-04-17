public class SumofPaliArr {

    // static boolean isPali(int n) {
    // int original = n;
    // int reversed = 0;
    // while (n != 0) {
    // int digit = n % 10;
    // reversed = reversed * 10 + digit;
    // n = n / 10;

    // }
    // return original == reversed;
    // }

    // public static void main(String[] args) {
    // int arr[] = { 111, 222, 333 };
    // int i, summ = 0;
    // for (i = 0; i < arr.length; i++) {
    // if (isPali(arr[i])) {
    // summ += arr[i];
    // }
    // }
    // System.out.print(summ);

    // }

    static boolean isPalindrome(int n) {
        String original = Integer.toString(n);
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }

    public static void main(String[] args) {
        int n = 101;

        if (isPalindrome(n)) {
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println(n + " is not a palindrome.");
        }
    }
}