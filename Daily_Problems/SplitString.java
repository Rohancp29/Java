import java.util.*;

public class SplitString {
    public static void main(String[] args) {
        String s = "I am very Happy";
        String[] wrd = s.split(" ");

        for (String w : wrd) {
            if (w.length() % 2 == 0) {
                System.out.println(w + " ");
            }
        }
    }
}
