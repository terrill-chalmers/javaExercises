public class KthLargest {
    public static void getKthLargestUsingQuickSelect(int[] arr, int k) {
        System.out.println(getKthLargest(arr, 0, arr.length - 1, arr.length - k));
    }

    private static int getKthLargest(int[] arr, int low, int high, int k) {
        int partitionIndex = getPartitionIndex(arr, low, high);

        if (partitionIndex - low > k) {
            return getKthLargest(arr, low, partitionIndex - 1, k);
        } else if (partitionIndex - low < k) {
            return getKthLargest(arr, partitionIndex + 1, high, k - partitionIndex + low - 1);
        } else {
            return arr[partitionIndex];
        }
    }

    private static int getPartitionIndex(int[] arr, int low, int high) {
        int pivot = arr[high];
        int partitionIndex = low;

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] <= pivot) {
                PartitionUtility.swapElements(arr, partitionIndex, j);
                partitionIndex++;
            }
        }

        PartitionUtility.swapElements(arr, partitionIndex, high);

        return partitionIndex;
    }
}
