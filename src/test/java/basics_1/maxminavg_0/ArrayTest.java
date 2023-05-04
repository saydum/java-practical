package basics_1.maxminavg_0;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class ArrayTest {

     public static int[] numbers = new int[1000];


    @BeforeClass
    public static void beforeClass() throws Exception {
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 1 + random.nextInt(300);
        }
        Arrays.sort(numbers);
    }

    @Test
    public void max() {
        int max = numbers[numbers.length -1];
        assertEquals(max, Array.max(numbers));
    }
    @Test
    public void avg() {
        int avg = Arrays.stream(numbers).sum() / numbers.length;
        assertEquals(avg, Array.avg(numbers));
    }

    @Test
    public void min() {
        int min = numbers[0];
        assertEquals(min, Array.min(numbers));
    }

    @Test
    public void sum() {
        int sum = Arrays.stream(numbers).sum();
        assertEquals(sum, Array.sum(numbers));
    }
}