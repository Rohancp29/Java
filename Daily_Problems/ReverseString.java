
// Recursive Mathod -- take last character and append

public class ReverseString {

    // Recursive Mathod

    public static String reverse(String str) {
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String sc = "Hello Word";
        String reversed = reverse(sc);
        System.out.println("Original String: " + sc);
        System.out.println("Converted String: " + reversed);
        //
        // String Builder

        StringBuilder sb = new StringBuilder();
        sb.append(sc);
        sb.reverse();

        String rev = sb.toString();
        System.out.println("Rev: " + rev);

        //
    }

}

// seperate word reverse
// using string builder

// public class ReverseString {

// public static String reverseWord(String sentence) {
// String[] words = sentence.split("\\s+");

// StringBuilder reversedSentence = new StringBuilder();

// for (String word : words) {
// reversedSentence.append(reverse(word)).append(" ");
// }
// return reversedSentence.toString().trim();
// }

// public static String reverse(String str) {
// if (str.isEmpty() || str.length() == 1) {
// return str;
// }
// return reverse(str.substring(1)) + str.charAt(0);
// }

// public static void main(String[] args) {
// String sc = "Hello Word";
// String reversed = reverseWord(sc);
// System.out.println("Original String: " + sc);
// System.out.println("Converted String: " + reversed);

// }

// }