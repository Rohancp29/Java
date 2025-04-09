import java.util.*;
/* 
public class StoreWater {
    public static int tankstoreWater(ArrayList<Integer> h){
        int maxW = 0;
        for (int i =0;i<h.size();i++){
            for (int j=i+1;j<h.size();j++){
                int ht = Math.min(h.get(i),h.get(j));
                int width = j-i;
                int currWater = ht*width;
                maxW = Math.max(maxW,currWater); 
            }
        }
        return maxW;
    }
    public static void main(String[] args) {
        ArrayList<Integer> h = new ArrayList<>();
        h.add(1);
        h.add(8);
        h.add(2);
        h.add(3);
        h.add(5);
        h.add(7);
        h.add(9);
        h.add(4);
        h.add(7);
        h.add(4);
        h.add(1);
        h.add(5);
        h.add(7);
        h.add(6);

        System.out.println("Total Water Store is: "+tankstoreWater(h));
    }
    
}
*/

// Two Pointer 
public class StoreWater {
    public static int tankstoreWater(ArrayList<Integer> h) {
        int maxWater = 0;
        int lp = 0;
        int rp = h.size() - 1;
        while (lp < rp) {
            int ht = Math.min(h.get(lp), h.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            if (h.get(lp) < h.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> h = new ArrayList<>();
        h.add(1);
        h.add(8);
        h.add(2);
        h.add(3);
        h.add(5);
        h.add(7);
        h.add(9);
        h.add(4);
        h.add(7);
        h.add(4);
        h.add(1);
        h.add(5);
        h.add(7);
        h.add(6);

        System.out.println("Total Water Store is: " + tankstoreWater(h));
    }

}