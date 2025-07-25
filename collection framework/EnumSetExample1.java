import java.util.EnumSet;

enum Days { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }

public class EnumSetExample1{
    public static void main(String[] args) {
        EnumSet<Days> weekend = EnumSet.of(Days.SATURDAY, Days.SUNDAY);

        System.out.println("Weekend Days: " + weekend);
    }
}