public class Palindrome {

    public static void main(String[] args) {
        String str = "madam";

        if (isPalindrome(str)) {
            System.out.println("word is palindrome");
        } else {
            System.out.println("world is not palindrome");
        }

    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(right) != s.charAt(left))
                return false;
            left++;
            right--;
        }
        return true;

    }

}

/*
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * +
 */

/*
 * import java.util.Scanner;
 * 
 * public class Palindrome {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter a sentence: ");
 * String input = sc.nextLine();
 * 
 * if (isPalindrome(input)) {
 * System.out.println("Sentence is palindrome");
 * } else {
 * System.out.println("Sentence is not palindrome");
 * }
 * sc.close();
 * 
 * }
 * 
 * public static boolean isPalindrome(String str) {
 * int left = 0;
 * int right = str.length() - 1;
 * 
 * while (left < right) {
 * if (str.charAt(left) != str.charAt(right)) {
 * return false;
 * }
 * left++;
 * right--;
 * }
 * return true;
 * 
 * }
 * }
 * 
 */