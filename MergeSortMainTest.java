import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortMainTest {
    MergeSort ms=new MergeSort();

    //Normal Testing
    @Test
    void testMergeSortNormalArray() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};

        ms.sort(arr,0,arr.length-1);

        assertArrayEquals(expected, arr);
    }

    //Already Sorted Array
    @Test
    void testMergeSortAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};

        ms.sort(arr,0,arr.length-1);

        assertArrayEquals(expected, arr);
    }

    //reverse Array
    @Test
    void testMergeSortReverseOrder() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};

         ms.sort(arr,0,arr.length-1);

        assertArrayEquals(expected, arr);
    }

    //single Element Array
    @Test
    void testMergeSortSingleElement() {
        int[] arr = {10};
        int[] expected = {10};

         ms.sort(arr,0,arr.length-1);

        assertArrayEquals(expected, arr);
    }

    //Empty Array
    @Test
    void testMegreSortEmptyArray() {
        int[] arr = {};
        int[] expected = {};

         ms.sort(arr,0,arr.length-1);

        assertArrayEquals(expected, arr);
    }
}
