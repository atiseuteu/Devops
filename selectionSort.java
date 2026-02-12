public class selectionSort {

    public int[] selectionSortNum(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            // Assume current index is minimum
            int minIndex = i;

            // Find the smallest element in remaining unsorted array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        return arr;
    }
}
