public class FibonacciSearch {
public static int fibonacciSearch(int[] arr, int key) {
    int n = arr.length;
    int fibMm2 = 0; // (m-2)'th Fibonacci number
    int fibMm1 = 1; // (m-1)'th Fibonacci number
    int fibM = fibMm2 + fibMm1; // m'th Fibonacci number

    // fibM is going to store the smallest Fibonacci number greater than or equal to n
    while (fibM < n) {
        fibMm2 = fibMm1;
        fibMm1 = fibM;
        fibM = fibMm2 + fibMm1;
    }

    // Marks the eliminated range from front
    int offset = -1;

    // while there are elements to be inspected. Note that we compare arr[fibMm2] with key.
    // When fibM becomes 1, fibMm2 becomes 0
    while (fibM > 1) {
        // Check if fibMm2 is a valid location
        int i = Math.min(offset + fibMm2, n - 1);

        // If key is greater than the value at index fibMm2, cut the subarray array from offset to i
        if (arr[i] < key) {
            fibM = fibMm1;
            fibMm1 = fibMm2;
            fibMm2 = fibM - fibMm1;
            offset = i;
        }

        // If key is less than the value at index fibMm2, cut the subarray after i+1
        else if (arr[i] > key) {
            fibM = fibMm2;
            fibMm1 = fibMm1 - fibMm2;
            fibMm2 = fibM - fibMm1;
        }

        // element found. return index
        else {
            return i;
        }
    }

    // comparing the last element with key
    if (fibMm1 == 1 && arr[offset + 1] == key) {
        return offset + 1;
    }

    // element not found. return -1
    return -1;
}

public static void main(String[] args) {
    int[] arr = {2, 3, 4, 10, 40};
    int x = 10;
    int index = fibonacciSearch(arr, x);
    System.out.println("Element " + x + " is at index: " + index);

    x = 11;
    index = fibonacciSearch(arr, x);
    System.out.println("Element " + x + " is at index: " + index);
}
}