import java.util.ArrayList;
import java.util.Iterator;

public class Pro1 {
    public static void main(String[] args) {
      
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add("Element " + i);
        }

      
        arrayList.add("New Element");

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        arrayList.add(5, "Inserted Element");

        arrayList.remove("Element 2");
        arrayList.remove(7);

       
        arrayList.set(3, "Updated Element");

       
        System.out.println("Element at index 4: " + arrayList.get(4));

      
        System.out.println("Size of ArrayList: " + arrayList.size());

        
        System.out.println("Is 'New Element' present? " + arrayList.contains("New Element"));

        arrayList.clear();
    }
}
