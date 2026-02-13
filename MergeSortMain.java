public class MergeSortMain {
    public static void main(String[] args) {

        int arr[] = {38, 27, 43, 3, 9, 82, 10};

        MergeSort ms = new MergeSort();
        ms.sort(arr,0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
