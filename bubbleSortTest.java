import org.junit.Test;

public class bubbleSortTest{
    @Test
    public void testBubbleSortNormal(){

        int[] arr = {64,57,11,0,35,87,99};
        int[] expected = {0,11,35,57,64,87,99};

        bubbleSort.bubbleSortMethod(arr);
        assert java.util.Arrays.equals(arr, expected);
    }

    @Test
    public void testBubbleSortEmpty(){
        int[] arr = {};
        int[] expected = {};

        bubbleSort.bubbleSortMethod(arr);
        assert java.util.Arrays.equals(arr, expected);
    }

    @Test
    public void testBubbleSortNegative(){
        int[] arr = {-3,-1,-7,-5};
        int[] expected = {-7,-5,-3,-1};

        bubbleSort.bubbleSortMethod(arr);
        assert java.util.Arrays.equals(arr, expected);
    }

    @Test
    public void testBubbleSortDuplicates(){
        int[] arr = {5,2,9,1,5,6};
        int[] expected = {1,2,5,5,6,9};

        bubbleSort.bubbleSortMethod(arr);
        assert java.util.Arrays.equals(arr, expected);
    }

    @Test
    public void testBubbleSortAlreadySorted(){
        int[] arr = {1,2,3,4,5};
        int[] expected = {1,2,3,4,5};

        bubbleSort.bubbleSortMethod(arr);
        assert java.util.Arrays.equals(arr, expected);
    }

    @Test
    public void bubbleSortIntegers(){
        int[] arr = {3,-1,1,-34,4,1,5,9,-23,0,0};
        int[] expected = {-34,-23,-1,0,0,1,1,3,4,5,9};

        bubbleSort.bubbleSortMethod(arr);
        assert java.util.Arrays.equals(arr, expected);
    }
}