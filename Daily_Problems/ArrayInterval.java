import java.util.Arrays;

class ArrayInterval {
    public int[][] insertWithArray(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int[][] mergedIntervals = new int[n + 1][2];
        int insertPos = 0;

        int i = 0;
        while (i < n && intervals[i][1] < newInterval[0]) {
            mergedIntervals[insertPos++] = intervals[i++];
        }
        int[] currentInterval = newInterval;
        while (i < n && intervals[i][0] <= currentInterval[1]) {
            currentInterval[0] = Math.min(currentInterval[0], intervals[i][0]);
            currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
            i++;
        }
        mergedIntervals[insertPos++] = currentInterval;
        while (i < n) {
            mergedIntervals[insertPos++] = intervals[i++];
        }
        int[][] result = new int[insertPos][2];
        for (int j = 0; j < insertPos; j++) {
            result[j] = mergedIntervals[j];
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayInterval solution = new ArrayInterval();

        int[][] intervals1 = { { 1, 3 }, { 6, 9 } };
        int[] newInterval1 = { 2, 5 };
        int[][] result1 = solution.insertWithArray(intervals1, newInterval1);
        System.out.print("Result : ");
        printArray(result1);

    }

    public static void printArray(int[][] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(Arrays.toString(arr[i]));
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}