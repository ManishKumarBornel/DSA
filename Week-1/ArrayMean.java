public class ArrayMean {
    public static double findArrayMean(int[] arr) {
        return findArrayMeanRecursive(arr, arr.length);
    }
    
    private static double findArrayMeanRecursive(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        
        double sum = findArrayMeanRecursive(arr, n - 1) * (n - 1);
        sum += arr[n - 1];
        
        return sum / n;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        double mean = findArrayMean(arr);
        System.out.println("Mean: " + mean);
    }
}