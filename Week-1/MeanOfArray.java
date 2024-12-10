public class MeanOfArray {
    public static double findArrayMean(int[] arr) {
        return findArraySum(arr) / arr.length;
    }

    private                                                                                                                                 static double findArraySum(int[] arr) {
        return findArraySumHelper(arr, arr.length - 1);
    }

    private static double findArraySumHelper(int[] arr, int index) {
        if (index == 0) {
            return arr[0];
        }
        return arr[index] + findArraySumHelper(arr, index - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        double mean = findArrayMean(arr);
        System.out.println("Mean: " + mean);
    }
}
