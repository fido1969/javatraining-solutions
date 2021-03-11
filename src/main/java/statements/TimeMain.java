package statements;

import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the hour: ");
        int hour = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Give the minute: ");
        int minute = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Give the second: ");
        int second = scanner.nextInt();
        scanner.nextLine();

        System.out.println();

        Time time = new Time(hour, minute, second);

        System.out.print("Give the hour: ");
        hour = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Give the minute: ");
        minute = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Give the second: ");
        second = scanner.nextInt();
        scanner.nextLine();

        System.out.println();

        Time anothherTime = new Time(hour, minute, second);

        System.out.println("The first time " + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond() + " = " + time.getInMinutes() + " minutes");
        System.out.println("The second time " + anothherTime.getHour() + ":" + anothherTime.getMinute() + ":" + anothherTime.getSecond() + " = " + anothherTime.getInSeconds() + " seconds");
        System.out.println("The first time is earlier than the second time: " + time.earlierThan(anothherTime));


    }
}
