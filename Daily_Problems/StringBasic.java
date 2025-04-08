import java.util.*;
import java.io.*;

public class StringBasic{
    public static void main(String[] args){
        String A = "hello";
        String B = "word";

        int sumLenght = A.length() + B.length();
        System.out.println(sumLenght);

        if (A.compareTo(B)>0){
            System.out.println("Yes");

        }else{
            System.out.println("No");

        }

        String capA = A.substring(0,1).toUpperCase()+A.substring(1);
        String capB = B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(capA+" "+capB);
    }
}