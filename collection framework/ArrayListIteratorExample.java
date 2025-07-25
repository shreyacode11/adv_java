import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorExample {
    public static void main(String[] args) {
        
        ArrayList<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("Houston");

        
        Iterator<String> it = cities.iterator();

        
        System.out.println("Cities in the ArrayList:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}