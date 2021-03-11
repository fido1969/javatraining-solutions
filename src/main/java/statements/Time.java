package statements;

public class Time {

    public static final int MULTIPLIER = 60;

    private int hour;

    private int minute;

    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public int getInMinutes() {
        return hour * MULTIPLIER + minute;
    }

    public int getInSeconds() {
        return getInMinutes() * MULTIPLIER + second;
    }

    public boolean earlierThan(Time otherTime) {
        return this.getInSeconds() > otherTime.getInSeconds() ? true : false;
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}
