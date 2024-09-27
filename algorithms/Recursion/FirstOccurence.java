//WAF to find the first occurance of an element in an array

public class FirstOccurence{
    public static int findFirstOccurance(int [] arr, int i, int key){
        
        if(arr[i] == key){
            return i;
        }
        if(i == arr.length){
            return -1;
        }


        return findFirstOccurance(arr, i + 1, key);


    }
    public static void main(String [] rohan){
        int [] arr = {1, 4, 3, 5, 6};
        int a = findFirstOccurance(arr, 0, 6);
        System.out.println(a);
    }
}
