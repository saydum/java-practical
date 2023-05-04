package basics_1.bubblesort_1;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] numbers = {2, 9, 1, 0, 10, 4, 3, 6, 8, 5};
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] sort(int[] numbers) {
        boolean isSorted = false;
        int buffer;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    isSorted = false;

                    buffer = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = buffer;
                }
            }
        }
        return numbers;
    }
}
