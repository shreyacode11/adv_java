public class CapacityExample{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");

        System.out.println("Initial Length: " + sb.length());    
        System.out.println("Initial Capacity: " + sb.capacity()); 

        sb.append(" is powerful!");
        
        System.out.println("Updated Length: " + sb.length());    
        System.out.println("Updated Capacity: " + sb.capacity()); 
    }
}