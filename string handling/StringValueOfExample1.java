public class StringValueOfExample1 {
    public static void main(String[] args) {
        int num = 50;
        double price = 99.99;
        boolean flag = true;
        
        // Converting primitives to String
        String numStr = String.valueOf(num);
        String priceStr = String.valueOf(price);
        String boolStr = String.valueOf(flag);
        
        System.out.println("String representation of int: " + numStr);
        System.out.println("String representation of double: " + priceStr);
        System.out.println("String representation of boolean: " + boolStr);
    }
}