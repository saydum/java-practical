package basics_1.maxminavg_0;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 1 + random.nextInt(300);
        }

        System.out.printf("""
                Max: %d
                Avg: %d
                Min: %d
                """,max(numbers), min(numbers), avg(numbers));
    }

    public static int max(int[] numbers) {
        int max = 0;

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
    public static int avg(int[] numbers) {
        int avg = 0;

        if (numbers.length > 0) {
            avg = sum(numbers) / numbers.length;
        }
        return avg;
    }
    public static int min(int[] numbers) {
        int min = numbers.length;

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

}
