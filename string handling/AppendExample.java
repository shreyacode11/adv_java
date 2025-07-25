public class AppendExample {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");
        
        // Append different data types
        sb.append(" World");
        sb.append(2024);
        sb.append('!');
        
        // Print the modified StringBuffer
        System.out.println(sb); 
    }
}
