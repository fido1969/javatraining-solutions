package arrayofarrays;

import java.util.Scanner;

public class ArrayOfArraysMain {

    public int[][] multiplicationTable(int size) {

        int[][] multiplicationArray = new int[size][size];

        for (int i = 0; i < multiplicationArray.length; i++) {
            for (int j = 0; j < multiplicationArray[i].length; j++) {
                multiplicationArray[i][j] = (i + 1) * (j + 1);
                System.out.printf("%2d ", multiplicationArray[i][j]);
            }
            System.out.println();
        }
        return multiplicationArray;
    }


    public void printArrayOfArrays(int[][] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%6d ", a[i][i]);
            }
            System.out.println();
        }
    }


    public int[][] triangularMatrix(int size) {

        int[][] triangularArray = new int[size][size];

        for (int i = 0; i < triangularArray.length; i++) {
            for (int j = 0; j < triangularArray[i].length; j++) {
                if (j <= i) {
                    triangularArray[i][j] = i;
                    System.out.printf("%2d ", triangularArray[i][j]);
                }
            }
            System.out.println();
        }
        return triangularArray;
    }


    public int[][] getValues() {

        int[][] monthInYear = new int[12][];
        int[] numberOfDaysInMonth = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < monthInYear.length; i++) {
            monthInYear[i] = new int[numberOfDaysInMonth[i]];
        }
        return monthInYear;
    }


    int[][] spaceArrayBonus(int size) {

        int[][] spaceArrayInt = new int[size][size];
        for (int i = 0; i < spaceArrayInt.length; i++) {
            for (int j = 0; j < spaceArrayInt[i].length; j++) {
                spaceArrayInt[i][j] = (j + 1) * (int) (Math.pow(10, i));
            }
        }
        return spaceArrayInt;
    }


    public static void main(String[] args) {

        ArrayOfArraysMain arrayOfArraysMain = new ArrayOfArraysMain();

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        arrayOfArraysMain.printArrayOfArrays(arrayOfArraysMain.getValues());
        System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.print("Give the size of the array: ");
        arrayOfArraysMain.multiplicationTable(scanner.nextInt());
        scanner.nextLine();
        System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.print("Give the size of the array: ");
        arrayOfArraysMain.triangularMatrix(scanner.nextInt());
        scanner.nextLine();
        System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.print("Give the size of the array: ");
        arrayOfArraysMain.printArrayOfArrays(arrayOfArraysMain.spaceArrayBonus(scanner.nextInt()));
        scanner.nextLine();
        System.out.println();
        System.out.println("---------------------------------------------------------");




    }
}
