import java.util.EnumSet;

enum Size { SMALL, MEDIUM, LARGE, XL, XXL }

public class EnumSetExample3{
    public static void main(String[] args) {
        EnumSet<Size> mediumToXL = EnumSet.range(Size.MEDIUM, Size.XL);

        System.out.println("Sizes in range: " + mediumToXL);
    }
}