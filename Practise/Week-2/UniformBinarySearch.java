public class UniformBinarySearch {
    public static int recursiveUniformBinarySearch(int[] arr, int key, int[] lookupTable, int left, int right) {
        if (left > right) {
            return -1; // key not found
        }
        
        int midIndex = (left + right) / 2;
        int mid = lookupTable[midIndex];
        
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] < key) {
            return recursiveUniformBinarySearch(arr, key, lookupTable, mid + 1, right);
        } else {
            return recursiveUniformBinarySearch(arr, key, lookupTable, left, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 7, 8, 9};
        int[] lookupTable = {0, 1, 2, 3, 4, 5, 6}; // Precomputed mid points for the array
        int key = 3;
        
        int position = recursiveUniformBinarySearch(array, key, lookupTable, 0, array.length - 1);
        System.out.println("Position of " + key + " in array = " + position);
        
        key = 7;
        position = recursiveUniformBinarySearch(array, key, lookupTable, 0, array.length - 1);
        System.out.println("Position of " + key + " in array = " + position);
    }
}
