package math.tip;

import java.util.Random;

public class MathTips {

    public static void main(String[] args) {

        Random random = new Random();

        System.out.println(random.nextInt(31) - 10);

        System.out.printf("%6.5f", ((random.nextDouble() * 6) - 3));

    }
}
