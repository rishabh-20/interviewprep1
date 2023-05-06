import java.util.ArrayList;
import java.util.List;

public class gfg {
    public static List<Integer> findSubarrayWithSum(int[] arr, int targetSum) {
        List<Integer> subarray = new ArrayList<>();
        int currentSum = arr[0];
        int start = 0;

        // Start with the second element of the array
        for (int end = 1; end < arr.length; end++) {
            // If the current sum exceeds the target sum, remove elements from the start
            while (currentSum > targetSum && start < end - 1) {
                currentSum -= arr[start];
                start++;
            }

            // If the current sum matches the target sum, return the subarray
            if (currentSum == targetSum) {
                for (int i = start; i < end; i++) {
                    subarray.add(arr[i]);
                }
                return subarray;
            }

            // Add the next element to the current sum
            currentSum += arr[end];
        }

        // If no subarray is found, return an empty list
        return subarray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int targetSum = 33;
        List<Integer> result = findSubarrayWithSum(arr, targetSum);
        System.out.println(result);  // Output: [20, 3, 10]
    }
}
