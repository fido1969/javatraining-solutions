package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Song song = new Song();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give your favourite singer: ");
        song.band = scanner.nextLine();
        System.out.print("Give the title of your favourite song: ");
        song.title = scanner.nextLine();
        System.out.print("Give the lenght of the song:");
        song.lenght = scanner.nextInt();
        System.out.println();
        System.out.println(song.band + " - " + song.title + " (" + song.lenght + " minutes)");
    }
}
