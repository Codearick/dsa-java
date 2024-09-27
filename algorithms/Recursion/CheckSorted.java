// Check if the given array is sorted or not. (using Recursion)
// Author: Rohan Gautam
// Date: 21/09/2024

//------------------------------> Java <------------------------------------------------

public class CheckSorted{
    public static boolean isSorted(int [] arr, int i){

        if(i == arr.length - 1) return true;
        
        if(arr[i] > arr[i+1]) return false;
        
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,5,6,7};
        System.out.println(isSorted(arr, 0));
    }
}

// Time complexity: O(n)
// Space complexity: O(n)