import org.junit.*;

public class selectionSortTest {

    // Normal unsorted array
    @Test
    public void testNormalArray() {
        selectionSort sort = new selectionSort();
        int[] input = {3, 5, 2, 4};
        int[] expected = {2, 3, 4, 5};

        Assert.assertArrayEquals(expected, sort.selectionSortNum(input));
    }

    // Already sorted array
    @Test
    public void testAlreadySortedArray() {
        selectionSort sort = new selectionSort();
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};

        Assert.assertArrayEquals(expected, sort.selectionSortNum(input));
    }

    // Reverse sorted array (worst case)
    @Test
    public void testReverseSortedArray() {
        selectionSort sort = new selectionSort();
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};

        Assert.assertArrayEquals(expected, sort.selectionSortNum(input));
    }

    // Array with duplicate values
    @Test
    public void testDuplicateValues() {
        selectionSort sort = new selectionSort();
        int[] input = {3, 1, 2, 3, 1};
        int[] expected = {1, 1, 2, 3, 3};

        Assert.assertArrayEquals(expected, sort.selectionSortNum(input));
    }

    // Single element array
    @Test
    public void testSingleElement() {
        selectionSort sort = new selectionSort();
        int[] input = {10};
        int[] expected = {10};

        Assert.assertArrayEquals(expected, sort.selectionSortNum(input));
    }

    // Empty array
    @Test
    public void testEmptyArray() {
        selectionSort sort = new selectionSort();
        int[] input = {};
        int[] expected = {};

        Assert.assertArrayEquals(expected, sort.selectionSortNum(input));
    }

    // Array with negative numbers
    @Test
    public void testNegativeNumbers() {
        selectionSort sort = new selectionSort();
        int[] input = {-1, -5, 3, 0, 2};
        int[] expected = {-5, -1, 0, 2, 3};

        Assert.assertArrayEquals(expected, sort.selectionSortNum(input));
    }
}
