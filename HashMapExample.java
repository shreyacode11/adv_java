import java.util.HashMap;
import java.util.Map;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, Student> studentMap = new HashMap<>();
        
        studentMap.put(101, new Student("Alice", 21));
        studentMap.put(102, new Student("Bob", 22));
        studentMap.put(103, new Student("Charlie", 20));

        // Accessing an element by key
        System.out.println("Student with ID 102: " + studentMap.get(102));

        // Iterating over a HashMap
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}