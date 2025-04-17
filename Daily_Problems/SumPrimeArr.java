public class SumPrimeArr {

    static boolean isPrime(int n) {
        int i, f = 0;
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                f++;
            }

        }
        return f == 2;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int i, sum = 0;

        for (i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                sum = sum + arr[i];
            }

        }
        System.out.print(sum);
    }

}
