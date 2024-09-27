public class LastOccurence {
    public static void main(String[] args) {
        int [] arr = {12,4,5,12,9};
        System.out.println(lastOccurence(arr, 9, arr.length - 1));
    }

    public static int lastOccurence(int [] arr, int key, int index){
        // if(arr[index] == key){
        //     return index;
        // }

        // if(index < 0){
        //     return -1;
        // }
        // return lastOccurence(arr, key, index -1);

        if(index == arr.length){
            return -1;
        }

        int isFound = lastOccurence(arr, key, index + 1);
        if(isFound == -1 && arr[index] == key){
            return index;
        }

        return isFound;
    }
}

