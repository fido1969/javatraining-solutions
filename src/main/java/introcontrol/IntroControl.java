package introcontrol;

public class IntroControl {

    public int subtractTenIfGreaterThanTen(int number) {
        if (number <= 10) {
            return number;
        } else {
            return number -= 10;
        }
    }

    public String describeNumber(int number) {
        if (number == 0) {
            return "The number is zero!";
        } else {
            return "The number is not zero!";
        }
    }

    public String greetingToJoe(String name) {
        if ("Joe".equals(name)) {
            return "Hello " + name;
        } else {
            return "";
        }
    }

    public int calculateBonus(int sale) {

        int bonusRate = 10;

        if (sale >= 1_000_000) {
            return sale * bonusRate / 100;
        } else {
            return 0;
        }
    }

    public void printNumbers(int max) {
        for (int i = 0; i <= max; i++) {
            System.out.print(i + ", ");
        }
    }

    public void printNumbersBetween(int min, int max) {
        for (int i = min + 1; i < max; i++) {
            System.out.print(i + ", ");
        }
    }

    public void printNumbersBetweenAnyDirection(int a, int b) {
        if (a < b) {
            for (int i = a + 1; i < b; i++) {
                System.out.print(i + ", ");
            }
        } else {
            for (int i = a - 1; i > b; i--) {
                System.out.print(i + ", ");
            }
        }
    }

    public void printOddNumbers(int max) {
        for (int i = 0; i <= max; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public int calculateConsumption(int prev, int next) {
        if (next >= prev && next <= 9_999) {
            return next - prev;
        }
        return 9_999 - prev + next;
    }
}
