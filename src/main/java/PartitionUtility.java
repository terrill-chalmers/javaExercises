public class PartitionUtility {
    public static int getPartitionIndex(int[] arr, int low, int high) {
        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j <= high; j++) {
            if (arr[j] < pivot) {
                i++;
                swapElements(arr, i, j);
            }
        }
        swapElements(arr, i + 1, high);

        return i + 1;
    }

    static void swapElements(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
