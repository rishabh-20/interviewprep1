# interviewprep1
//kth smallest element

import java.util.Arrays;

public class KthSmallestLargest {
    public static void main(String[] args) {
        int[] arr = {7, 2, 1, 6, 8, 5};
        int k = 5;

        int result = findKthSmallestSorting(arr, k);
        System.out.println("The " + k + "th smallest element is: " + result);
    }

    public static int findKthSmallestSorting(int[] arr, int k) {
        Arrays.sort(arr);  // Sort the array in non-decreasing order
        return arr[k - 1]; // Return the K'th element (index k-1)
    }
}
