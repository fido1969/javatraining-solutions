package math.rounding;

import java.util.Random;

public class RoundingAnomaly {

    Random random = new Random();

    public double[] randomNumbers(int size, double max, int scale) {

        double[] numbers = new double[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.round(random.nextDouble() * max * Math.pow(10, scale)) / Math.pow(10, scale);
        }
        return numbers;
    }

    public double roundAfterSum(double[] numbers) {
        double sum = 0;

        for (double number : numbers) {
            sum += number;
        }
        return Math.round(sum);
    }

    public double sumAfterRound(double[] numbers) {
        double sum = 0;

        for (double number : numbers) {
            sum += Math.round(number);
        }
        return sum;
    }

    public double difference(int size, double max, int scale) {
        double[] arrayNumbers = randomNumbers(size, max, scale);
        return Math.abs(sumAfterRound(arrayNumbers) - roundAfterSum(arrayNumbers));
    }

    public static void main(String[] args) {

        int counter = 100;
        double difference = 0;

        for (int i = 0; i < counter; i++) {
            difference += new RoundingAnomaly().difference(1000, 1_000_001, 5);
            System.out.println(difference);
        }
        System.out.printf("%6.3f", difference / counter);
    }
}
