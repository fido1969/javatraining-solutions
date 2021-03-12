package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {

    public static void main(String[] args) {

        Performance performance = new Performance("Queen",
                LocalDate.of(1989, 6, 2),
                LocalTime.of(18, 00),
                LocalTime.of(20, 00));

        System.out.println("The artist: " + performance.getArtist());
        System.out.println("The date: " + performance.getDate());
        System.out.println("The starting time: " + performance.getStartTime());
        System.out.println("The ending time: " + performance.getEndTime());

        System.out.println();

        System.out.println(performance.getInfo());
    }
}
