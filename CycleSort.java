public class CycleSort {
    public static void cycleSort(int[] arr) {
        int n = arr.length;

        for (int cycleStart = 0; cycleStart < n - 1; cycleStart++) {
            int item = arr[cycleStart];
            int pos = cycleStart;

            for (int i = cycleStart + 1; i < n; i++) {
                if (arr[i] < item) {
                    pos++;
                }
            }

            if (pos == cycleStart) {
                continue;
            }

            while (item == arr[pos]) {
                pos++;
            }

            while (pos != cycleStart) {
                int temp = item;
                item = arr[pos];
                arr[pos] = temp;
                pos = cycleStart;

                for (int i = cycleStart + 1; i < n; i++) {
                    if (arr[i] < item) {
                        pos++;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        cycleSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
}
