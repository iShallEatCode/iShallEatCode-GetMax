public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr){
        
        // Check if the array is valid
        if (arr == null || arr.length == 0) {
            return -1;
        }
        
        int largestValue = arr[0];
        
        // The loop to search through the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largestValue) {
                largestValue = arr[i];
            }
        }
        return largestValue;
    }
}
