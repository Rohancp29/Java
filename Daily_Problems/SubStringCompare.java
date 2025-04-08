public class SubStringCompare {

    public static String getSmallestLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        smallest = s.substring(0, k);
        largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String current = s.substring(i, i + k);
            if (current.compareTo(smallest) < 0) {
                smallest = current;
            }
            if (current.compareTo(largest) > 0) {
                largest = current;
            }
        }
        return smallest + "\n" + largest;

    }

    public static void main(String[] args) {

        String s = "rohanpatil";
        int k = 3;

        System.out.println(getSmallestLargest(s, k));
    }
}