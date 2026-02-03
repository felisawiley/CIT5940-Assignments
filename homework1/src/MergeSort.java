//package homework1.src;

public class MergeSort {
    
    /** Sorts an array of int using a recursive merge sort.
     * Time complexity: O(N log N)
     * Space complexity: O(N) for temp arrays
     */
    public static int[] mergeSort(int[] input) {
        // base case: when there's an empty or single element
        // array (aka it's already sorted)
        if (input.length <= 1) {
            return input.clone(); // return a copy to keep og unchanged
        }
        
        // split array into two halves by finding the middle and dividing by 2
        int mid = input.length / 2;
        int[] left = new int[mid];
        int[] right = new int[input.length - mid];
        
        // copy data to LHS
        for (int i = 0; i < mid; i++) {
            left[i] = input[i];
        }
        // copy data to RHS
        for (int i = mid; i < input.length; i++) {
            right[i - mid] = input[i];
        }
        
        // sort recursively
        left = mergeSort(left);
        right = mergeSort(right);
        
        // merge sorted LHS and RHS together
        return merge(left, right);
    }
    
    // merges two sorted arrays into one sorted array
    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, n = 0, m = 0;
        
        // compare elements from both arrays, add smaller one to result
        while (i < left.length && n < right.length) {
            if (left[i] <= right[n]) {
                result[m] = left[i];
                i++;
            } else {
                result[m] = right[n];
                n++;
            }
            m++;
        }
        
        // copy remaining elements from the left array
        while (i < left.length) {
            result[m] = left[i];
            i++;
            m++;
        }
        
        // copy remaining elements from the right array
        while (n < right.length) {
            result[m] = right[n];
            n++;
            m++;
        }
        
        return result;
    }
}