public class LinearSearch
{
    public static int recursiveLinearSearch(int[] arr, int key, int index)
    {
        if(index >= arr.length)
        {
            return -1;
        }
        if(arr[index] == key)
        {
            return index;
        }
        return recursiveLinearSearch(arr, key, index+1);
    }
    public static void main(String[] args) 
    {
        int [] arr = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        int key = 80;
        int result = recursiveLinearSearch(arr, key, 0);
        if(result != -1)
        {
            System.out.println(result);
        }
        else
        {
            System.out.println("Not Found");
        }
    }
}