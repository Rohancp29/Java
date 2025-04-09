import java.util.*;

public class ArrayListAllOperations {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("RP");
        names.add("Sam");
        names.add("Nik");
        names.add("Suraj");
        System.out.println("ArrayList after adding names: " + names);

        int size = names.size();
        System.out.println("Size of the ArrayList: " + size);

        String nameAtIndex1 = names.get(1);
        System.out.println("Name at index 1: " + nameAtIndex1);
        System.out.println("ArrayList after updating: " + names);

        names.remove("RP");
        System.out.println("ArrayList after removing 'RP': " + names);

        boolean containsNik = names.contains("Nik");
        System.out.println("Does it contain 'Nik'? " + containsNik);

        int indexOfSam = names.indexOf("Sam");
        System.out.println("Index of 'Sam': " + indexOfSam);

        names.clear();
        System.out.println("ArrayList after clearing: " + names);
    }
}