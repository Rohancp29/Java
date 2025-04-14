import java.util.*;

public class DifferenceTwoArray {
    public static void main(String[] args){
        int[] arr ={1,3,6,10,15,20};
        int n=arr.length;
        int sumOfDistance =0;

        for(int i=0;i<n-1;i++){
            sumOfDistance+= Math.abs(arr[i]-arr[i+1]);
        }
        System.out.println(sumOfDistance);
    }    
}
