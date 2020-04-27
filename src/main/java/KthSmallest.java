public class KthSmallest {
    public static void getKthSmallestUsingQuickSelect(int[] arr, int k) {
        System.out.println(getKthSmallest(arr, 0, arr.length - 1, k - 1));
    }

    private static int getKthSmallest(int[] arr, int low, int high, int k) {
        int partitionIndex = getPartitionIndex(arr, low, high);

        if (partitionIndex > k) {
            return getKthSmallest(arr, low, partitionIndex - 1, k);
        } else if (partitionIndex < k) {
            return getKthSmallest(arr, partitionIndex + 1, high, k);
        } else {
            return arr[partitionIndex];
        }
    }

    private static int getPartitionIndex(int[] arr, int low, int high) {
        int pivot = arr[high];
        int partitionIndex = low;

        for (int j = low; j <= high; j++) {
            if (arr[j] < pivot) {
                PartitionUtility.swapElements(arr, partitionIndex, j);
                partitionIndex++;
            }
        }

        PartitionUtility.swapElements(arr, partitionIndex, high);

        return partitionIndex;
    }
}
