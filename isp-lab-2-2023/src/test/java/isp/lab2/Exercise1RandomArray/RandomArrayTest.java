package isp.lab2.Exercise1RandomArray;

import org.junit.Assert;
import org.junit.Test;

public class RandomArrayTest {

    @Test
    public void findMaxAndMinTest() {
        int[] array = {10, 2, 1, 4, 1, 6, 7, 8, 9, 9};
        int[] expected = {1, 10};
        int[] actual = Exercise1RandomArray.findMaxAndMin(array);
        Assert.assertArrayEquals(expected, actual);
    }
}
