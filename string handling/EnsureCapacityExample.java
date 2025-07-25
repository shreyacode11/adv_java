public class EnsureCapacityExample {
    public static void main(String[] args) {
        // Create a StringBuffer with default capacity (16)
        StringBuffer sb = new StringBuffer();
        System.out.println("Initial Capacity: " + sb.capacity()); 
        
        // Ensuring a minimum capacity of 30
        sb.ensureCapacity(30);
        System.out.println("Capacity after ensureCapacity(30): " + sb.capacity()); 

        // Ensuring a minimum capacity of 100 (which exceeds the auto-expansion limit)
        sb.ensureCapacity(100);
        System.out.println("Capacity after ensureCapacity(100): " + sb.capacity()); 
    }
}