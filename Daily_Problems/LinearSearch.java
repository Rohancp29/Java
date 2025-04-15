public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int f = 5;
        int r = LinearSearch(arr, f);

        if (r == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element " + arr[r] + " is present at index " + r);
        }
    }

    public static int LinearSearch(int[] arr, int f) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == f) {
                return i;
            }
        }
        return -1;

    }

}
