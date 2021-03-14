package array;

public class ArrayMain {

    public static void main(String[] args) {

        String[] daysOfWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println();

        System.out.println("The 2.item (first index) of the array: " + daysOfWeek[1]);
        System.out.println("The length of the array: " + daysOfWeek.length);
        System.out.println();


        int[] powerFunctionOfTwo = new int[5];
        for (int i = 0; i < powerFunctionOfTwo.length; i++) {
            powerFunctionOfTwo[i] = (int) Math.pow(2, i);
        }

        for (int item : powerFunctionOfTwo) {
            System.out.print(item + " ");
        }
        System.out.println();


        boolean[] arrayBoolen = new boolean[6];
        for (int i = 0; i < arrayBoolen.length; i++) {
            if (i % 2 == 0) {
                arrayBoolen[i] = false;
            } else {
                arrayBoolen[i] = true;
            }
        }
        System.out.println();
        for (boolean item : arrayBoolen) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
