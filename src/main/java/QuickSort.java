import java.util.Arrays;


public class QuickSort {
    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int start, int end) {
        if (start < end) {
            int partitionIndex = PartitionUtility.getPartitionIndex(arr, start, end);
            sort(arr, start, partitionIndex - 1);
            sort(arr, partitionIndex + 1, end);
        }
    }
}
