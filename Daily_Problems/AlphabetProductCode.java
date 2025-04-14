import java.io.*;
import java.util.*;

public class AlphabetProductCode {

   public static void main(String[] args) {

      int num = 112;

      String numberStr = String.valueOf(num);

      StringBuilder result = new StringBuilder();

      for (int i = 0; i < numberStr.length(); i++) {
         char digitChar = numberStr.charAt(i);
         int digit = digitChar - '0';
         char letter;
         if (digit >= 1 && digit <= 9) {
            letter = (char) (digit - 1 + 'a');
            result.append(letter);
         } else {
            System.out.println("Provide accurate input");
            return;
         }

      }
      System.out.println("The output is: " + result.toString());



      // single code convert alphabet to word

      // String str = "example";
      // for (int i = 0; i < str.length(); i++) {
      // System.out.println((int)str.charAt(i) - 97);
      // }
      //


      
      // taking int and output is one number

      // int num =5;
      // if (num < 0){
      // System.out.println("Provide accurate number");
      // }else{
      // char l =(char) (num-1+'a');
      // System.out.println("number of alphabet is: "+l);
      // }

      // taking multiple numbers so we use string builder for store ther numbers

   }
}
