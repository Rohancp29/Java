import java.util.*;
import java.io.*;

public class SubString{
    public static void main(String[] args) {
        String S = "HelloWord";
        int start = 3;
        int end = 8;

        String subSTR = S.substring(start,end);
        System.out.println(subSTR);
    }
    
}