package arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysMain {

    public String numberOfDaysAsString() {
        int[] numberOfDaysInMomth = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDaysInMomth);
    }


    public List<String> daysOfWeek() {
        String[] daysOfWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return Arrays.asList(daysOfWeek);
    }


    public String multiplicationTableAsStringR0(int size) {
        int[] multiplicationArray = new int[size];
        for (int i = 0; i < multiplicationArray.length; i++) {
            multiplicationArray[i] = (i + 1) * size;
        }
        return Arrays.toString(multiplicationArray);
    }

    public String multiplicationTableAsStringR1(int size) {
        int[][] multiplicationArray = new int[size][size];
        for (int i = 0; i < multiplicationArray.length; i++) {
            for (int j = 0; j < multiplicationArray[i].length; j++) {
                multiplicationArray[i][j] = (i + 1) * (j + 1);
            }
        }
        return Arrays.deepToString(multiplicationArray);
    }


    public boolean sameTempValues(double[] day, double[] anotherDay) {
        return Arrays.equals(day, anotherDay);
    }


    public boolean sameTempValuesDaylight(double[] day, double[] anotherDay) {
        int indexLimit = min(day.length, anotherDay.length);
        Arrays.copyOfRange(day,0,indexLimit);
        Arrays.copyOfRange(anotherDay, 0, indexLimit);
        return Arrays.equals(day, anotherDay);
    }

    private int min(int daySize, int anotherDaySize) {
        return (int)Integer.min(daySize, anotherDaySize);
    }


    public boolean wonLotteryWithoutSort(int[] givenNumbers, int[] pickedNumbers) {
        int counter = 0;
        for (int i = 0; i < givenNumbers.length; i++) {
            for (int j = 0; j < pickedNumbers.length; j++) {
                if (givenNumbers[i] == pickedNumbers[j]) {
                    counter++;
                }
            }
        }
        if (counter == 5) {
            return true;
        }
        return false;
    }

    public boolean wonLotteryWithSort(int[] givenNumbers, int[] pickedNumbers) {
        System.out.println(Arrays.toString(givenNumbers));
        System.out.println(Arrays.toString(pickedNumbers));
        System.out.println("-----------------");
        Arrays.sort(givenNumbers);
        Arrays.sort(pickedNumbers);
        System.out.println(Arrays.toString(givenNumbers));
        System.out.println(Arrays.toString(pickedNumbers));
        return Arrays.equals(givenNumbers, pickedNumbers);
    }

    private void printArrayOfArrays(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }


    public static void main(String[] args) {
        ArraysMain arraysMain = new ArraysMain();
        System.out.println();
        System.out.println("numberOfDaysOfMonthAsString()---------------------------------------------------------------");
        System.out.println(arraysMain.numberOfDaysAsString());
        System.out.println();
        System.out.println("daysOfWeek()--------------------------------------------------------------------------------");
        System.out.println(arraysMain.daysOfWeek());
        System.out.println();
        System.out.println("multiplicationTableAsStringR0---------------------------------------------------------------");
        System.out.println(arraysMain.multiplicationTableAsStringR0(6));
        System.out.println();
        System.out.println("multiplicationTableAsStringR1---------------------------------------------------------------");
        System.out.println(arraysMain.multiplicationTableAsStringR1(6));
        System.out.println();
        System.out.println("sameTempValues------------------------------------------------------------------------------");
               double[] day = new double[]{9, 5, 8, 9, 4, 5, 6, 9, 8, 7, 4, 5, 4, 5, 4, 1, 2, 5, 4, 7, 8, 5, 2, 1};
        double[] anotherDay = new double[]{9, 5, 8, 9, 4, 5, 6, 9, 8, 7, 4, 5, 4, 5, 4, 1, 2, 5, 4, 7, 8, 5, 2, 1};
        System.out.println(arraysMain.sameTempValues(day, anotherDay));
        System.out.println();
        System.out.println("notSameTempValues---------------------------------------------------------------------------");
            day = new double[]{9999, 5, 8, 9, 4, 5, 6, 9, 8, 7, 4, 5, 4, 5, 4, 1, 2, 5, 4, 7, 8, 5, 2, 1};
        anotherDay = new double[]{7, 5, 8, 9, 4, 5, 6, 9, 8, 7, 4, 5, 4, 5, 4, 1, 2, 5, 4, 7, 8, 5, 2, 1};
        System.out.println(arraysMain.sameTempValues(day, anotherDay));
        System.out.println();
        System.out.println("wonLotteryWithoutSort-----------------------------------------------------------------------");
        int[] givenNumbers = new int[]{10, 13, 5, 17, 9};
        int[] pickedNumbers = new int[]{10, 3, 5, 17, 9};
        System.out.println(arraysMain.wonLotteryWithoutSort(givenNumbers, pickedNumbers));
        arraysMain.printArrayOfArrays(givenNumbers);
        System.out.println();
        arraysMain.printArrayOfArrays(pickedNumbers);
        System.out.println();
        System.out.println("wonLotteryWithSort--------------------------------------------------------------------------");
        System.out.println(arraysMain.wonLotteryWithSort(new int[]{17, 3, 5, 10, 9}, new int[]{10, 3, 5, 17, 9}));
        System.out.println();
        System.out.println("sameTempValuesDaylight----------------------------------------------------------------------");
               day = new double[]{7, 5, 8, 9, 4, 5, 6, 9, 8, 7, 4, 5, 4, 5, 4, 1, 2, 5, 4, 7, 8, 5, 2};
        anotherDay = new double[]{7, 5, 8, 9, 4, 5, 6, 9, 8, 7, 4, 5, 4, 5, 4, 1, 2, 5, 4, 7, 8, 5, 2};
        System.out.println(arraysMain.sameTempValuesDaylight(day, anotherDay));
    }
}
