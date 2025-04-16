public class WordCount {

    public static void main(String[] args) {
        String input = "Hello my name is Rohan Patil";

        int wordCount = countWordUsingRegularExp(input);
        System.out.println("Number of words using Regular Expression: " + wordCount);
    }

    private static int countWordUsingRegularExp(String input) {
        if (input == null || input.trim().isEmpty()) {
            System.out.println("Enter valid input");
            return 0;
        }
        String[] words = input.trim().split("\\s+");
        return words.length;
    }

    /*
     * public static void main(String[] args) {
     * String input = "Hello my name is Rohan Patil";
     * 
     * int wordCount1 = countWordUsingRegularExp(input);
     * System.out.println("Number of words using Regular Expression: " +
     * wordCount1);
     * 
     * // int wordCount2 = countWordUsingSplitMethod(input);
     * // System.out.println("Number of words using Split Method: " + wordCount2);
     * 
     * // int wordCount3 = countWordUsingCustomLogic(input);
     * // System.out.println("Number of words using Custom Logic: " + wordCount3);
     * }
     * 
     * private static int countWordUsingRegularExp(String input) {
     * if (input == null || input.trim().isEmpty()) {
     * System.out.println("Enter valid input");
     * return 0;
     * }
     * String[] words = input.trim().split("\\s+");
     * return words.length;
     * }
     * 
     * // private static int countWordUsingSplitMethod(String input) {
     * // if (input == null || input.trim().isEmpty()) {
     * // System.out.println("Enter valid input");
     * // return 0;
     * // }
     * // String[] words = input.split(" ");
     * // return words.length;
     * // }
     * 
     * // private static int countWordUsingCustomLogic(String input) {
     * // if (input == null || input.trim().isEmpty()) {
     * // System.out.println("Enter valid input");
     * // return 0;
     * // }
     * 
     * int wordCount = 0;
     * boolean isWord = false;
     * //int endOfLine = input.length() - 1;
     * 
     * for (int i = 0; i < input.length(); i++) {
     * // If the char is a letter, word = true.
     * if (Character.isLetter(input.charAt(i)) && i != endOfLine) {
     * isWord = true;
     * } else if (!Character.isLetter(input.charAt(i)) && isWord) {
     * wordCount++;
     * isWord = false;
     * } else if (Character.isLetter(input.charAt(i)) && i == endOfLine) {
     * wordCount++;
     * }
     * }
     * 
     * return wordCount;
     * }
     */

}
