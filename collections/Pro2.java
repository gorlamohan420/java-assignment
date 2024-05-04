import java.util.HashSet;

public class Pro2 {
    public static void main(String[] args) {
      
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Element 1");
        hashSet.add("Element 2");
        hashSet.add("Element 3");
        hashSet.add("Element 4");
        hashSet.add("Element 5");
        hashSet.add("Element 6");
        hashSet.add("Element 7");
        hashSet.add("Element 8");
        hashSet.add("Element 9");
        hashSet.add("Element 10");

        System.out.println("HashSet: " + hashSet);

        hashSet.remove("Element 3");

        System.out.println("Is 'Element 2' present? " + hashSet.contains("Element 2"));

        System.out.println("Size of HashSet: " + hashSet.size());

        hashSet.clear();
    }
}
