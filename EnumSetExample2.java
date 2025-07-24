import java.util.EnumSet;

enum Colors { RED, GREEN, BLUE, YELLOW }

public class EnumSetExample2{
    public static void main(String[] args) {
        EnumSet<Colors> allColors = EnumSet.allOf(Colors.class);
        System.out.println("All Colors: " + allColors);

        EnumSet<Colors> noColors = EnumSet.noneOf(Colors.class);
        System.out.println("No Colors: " + noColors);
    }
}