import java.util.*;

public class DeleteLastEleFromArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        LinkedList<Integer> ll = new LinkedList<>();

        for (int n : arr) {
            ll.add(n);

        }
        // ll.removeFirst();
        // ll.removeLast();
        ll.remove(2);
        // ll.add(3);

        System.out.println(ll);

        // int[] updatedArr = new int[ll.size()];
        // for (int i = 0; i < ll.size(); i++) {
        // updatedArr[i] = ll.get(i);
        // }
        // System.out.print(Arrays.toString(updatedArr));
    }
}
