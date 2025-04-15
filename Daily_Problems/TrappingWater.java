public class TrappingWater {
    public static void main(String[] args) {
        int[] height = { 1, 2, 1, 2, 3, 4, 3, 2, 1, 1, 0, 2, 0, 2 };
        System.out.println("trapped water is " + trap(height));
    }

    public static int trap(int[] height) {

        if (height == null || height.length == 0)
            return 0;

        int left = 0;
        int right = height.length - 1;
        int Maxleft = 0;
        int Maxright = 0;
        int trapwater = 0;

        while (left < right) {
            Maxleft = Math.max(Maxleft, height[left]);
            Maxright = Math.max(Maxright, height[right]);

            if (Maxleft < Maxright) {
                trapwater += Maxleft - height[left];
                left++;
            } else {
                trapwater += Maxright - height[right];
                right--;
            }
        }
        return trapwater;

    }

}
