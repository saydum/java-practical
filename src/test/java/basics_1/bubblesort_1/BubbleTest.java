package basics_1.bubblesort_1;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BubbleTest {

    @Test
    public void sort() {
        int[] sortNumbers = {2, 9, 1, 0, 10, 4, 3, 6, 8, 5};
        int[] numbers = {2, 9, 1, 0, 10, 4, 3, 6, 8, 5};

        Arrays.sort(sortNumbers);

        assertEquals(Arrays.toString(sortNumbers), Arrays.toString(Bubble.sort(numbers)));
    }

}