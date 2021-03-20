package finalmodifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Week {

    private List<String> daysOfWeek = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");

    public static final List<String> DAY_OF_WEEK = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");

    public static void main(String[] args) {

        Week week = new Week();

        System.out.println();
        System.out.println(week.daysOfWeek);
        System.out.println(week.DAY_OF_WEEK);
        System.out.println("------------------------------------------------------------------");

        //Próbáld meg a keddet lecserélni a List-ben szerdára! Fog sikerülni? --> IGEN
        week.daysOfWeek.set(1, "Wednesday");
        Week.DAY_OF_WEEK.set(1, "Wednesday");

        System.out.println(week.daysOfWeek);
        System.out.println(week.DAY_OF_WEEK);

        System.out.println("------------------------------------------------------------------");

        //Próbálj értékül adni a változónak egy példányosított listát! Fog sikerülni? --> IGEN
        week.daysOfWeek = new ArrayList<>();
        System.out.println(week.daysOfWeek);

        //Próbálj értékül adni a változónak egy példányosított listát! Fog sikerülni? --> NEM
        //week.DAY_OF_WEEK = new ArrayList<>();

        System.out.println("------------------------------------------------------------------");

        //Próbáld meg hozzáadni a List-hez egy elemet! Fog sikerülni? --> IGEN
        week.daysOfWeek.add("ADDED");
        System.out.println(week.daysOfWeek);


        //Próbáld meg hozzáadni a List-hez egy elemet! Fog sikerülni? --> NEM
        //week.DAY_OF_WEEK.add("ADDED");
        //System.out.println(week.daysOfWeek);
    }
}