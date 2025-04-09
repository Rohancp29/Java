import java.util.*;

public class HashSetSubstring {
    static class Solution {

        public Set<String> uniqueSubstrings(String s) {
            int n = s.length();
            Set<String> uniqueSubstring = new HashSet<>(); // first i am using arraylist but it show multiple substring
                                                          
            for (int i = 0; i < n; i++) {
                Set<Character> seen = new HashSet<>();
                StringBuilder currSubSTR = new StringBuilder();
                for (int j = i; j < n; j++) {
                    char currChar = s.charAt(j);
                    if (!seen.contains(currChar)) {
                        seen.add(currChar);
                        currSubSTR.append(currChar);
                        uniqueSubstring.add(currSubSTR.toString());

                    } else {
                        break;
                    }
                }
            }
            return uniqueSubstring;

        }

        public int lengthofsubstring(String s) {
            int n = s.length();
            int maxL = 0;
            int l = 0;

            Set<Character> charSet = new HashSet<>();

            for (int r = 0; r < n; r++) {
                char currChar = s.charAt(r);
                while (charSet.contains(currChar)) {
                    charSet.remove(s.charAt(l));
                    l++;
                }
                charSet.add(currChar);
                maxL = Math.max(maxL, r - l + 1);
            }
            return maxL;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "abcsbdhbacbsjsaabcsabcsjroakdf";
        int length = sol.lengthofsubstring(s);
        System.out.println("Longest substring is: " + length);

        Set<String> allUnique = sol.uniqueSubstrings(s);
        System.out.println("Without repeating characters: ");
        for (String sub : allUnique) {
            System.out.println(sub);

        }
        System.out.println("Total Number of substrings: " + allUnique.size());
    }
}





/*
 * public class HashSetSubstring {
 * static class Solution {
 * public int lengthofsubstring(String s) {
 * int n = s.length();
 * int maxL = 0;
 * int l = 0;
 * 
 * Set<Character> charSet = new HashSet<>();
 * 
 * for (int r = 0; r < n; r++) {
 * char currChar = s.charAt(r);
 * while (charSet.contains(currChar)) {
 * charSet.remove(s.charAt(l));
 * l++;
 * }
 * charSet.add(currChar);
 * maxL = Math.max(maxL, r - l + 1);
 * }
 * return maxL;
 * }
 * }
 * 
 * public static void main(String[] args) {
 * Solution sol = new Solution();
 * String s = "abcsbdhbacbsjsaabcsabcsjroakdf";
 * int length = sol.lengthofsubstring(s);
 * System.out.print("Longest substring is: " + length);
 * }
 * }
 */