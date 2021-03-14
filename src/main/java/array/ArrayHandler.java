package array;

import java.util.Random;
import java.util.Scanner;

public class ArrayHandler {

    public boolean contains(int[] source, int itemToFind) {

        for (int sourceItem : source) {
            if (sourceItem == itemToFind) {
                return true;
            }
        }
        return false;
    }

    public int find(int[] source, int itemToFind) {

        for (int i = 0; i < source.length; i++) {
            if (source[i] == itemToFind) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        ArrayHandler arrayHandler = new ArrayHandler();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(2);
        System.out.println();

        System.out.print("Give the size of the array: ");

        int[] arraySource = new int[scanner.nextInt()];
        scanner.nextLine();
        System.out.println();

        for (int i = 0; i < arraySource.length; i++) {
            arraySource[i] = random.nextInt(20);
        }

        for (int item : arraySource) {
            System.out.print(item+" ");
        }

        System.out.println();

        System.out.println("Does array contain it?");
        System.out.println(arrayHandler.contains(arraySource, 10));
        System.out.println(arrayHandler.contains(arraySource, 1));

        System.out.println();

        System.out.println("Is it found in the array?");
        System.out.println(arrayHandler.find(arraySource, 8));
        System.out.println(arrayHandler.find(arraySource, 30));

    }
}
