package week02;

import java.util.Scanner;

public class Phone {

    private String type;

    private int mem;

    public Phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMem() {
        return mem;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the type of your mobilephone: ");
        String phoneType = scanner.nextLine();
        System.out.print("Give the memory of your mobilephone: ");
        int phoneMemory = scanner.nextInt();
        scanner.nextLine();
        Phone phoneOne = new Phone(phoneType, phoneMemory);

        System.out.println();

        System.out.print("Give the type of your mobilephone: ");
        phoneType = scanner.nextLine();
        System.out.print("Give the memory of your mobilephone: ");
        phoneMemory = scanner.nextInt();
        scanner.nextLine();
        Phone phoneTwo = new Phone(phoneType, phoneMemory);

        System.out.println();

        System.out.println("The type of your mobilephone is " + phoneOne.getType() + ", " + "the memory size of your mobilephone is " + phoneOne.getMem() + ".");
        System.out.println("The type of your mobilephone is " + phoneTwo.getType() + ", " + "the memory size of your mobilephone is " + phoneTwo.getMem() + ".");
    }
}
