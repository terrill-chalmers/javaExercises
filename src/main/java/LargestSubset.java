import java.util.Arrays;

public class LargestSubset {
    public static void getLargestSubset(int[] arr, int k) {
        Arrays.sort(arr);
        int[] subArr = Arrays.copyOfRange(arr, arr.length - k, arr.length);

        System.out.println(Arrays.toString(subArr));
    }
}
