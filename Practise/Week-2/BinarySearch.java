public class BinarySearch
{
    public static int recursiveBinarySearch(int [] arr, int key, int left, int right)
    {
        if(left>right)
        {
            return -1;
        }
        int mid = left + (right - left) / 2 ;
        if(arr[mid] == key)
        {
            return mid;
        }
        else if(arr[mid] > key)
        {
            return recursiveBinarySearch(arr, key, left, mid -1 );
        }
        else
        {
            return recursiveBinarySearch(arr, key, mid+1 , right);
        }
    }
    public static void main(String[] args) 
    {
        int [] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        int result = recursiveBinarySearch(arr, target, 0, arr.length-1);
        if(result != -1 )
        {
            System.out.println(result);
        }
        else
        {
            System.out.println("NOT FOUND");
        }

    }
}