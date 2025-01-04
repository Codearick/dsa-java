public class MergeSortString {

    public static void merge(String [] arr, int si, int ei, int mid){
        String [] tempStrings = new String[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= ei){
            if(arr[i].compareTo(arr[j]) < 0){
                tempStrings[k++] = arr[i++];
            } else {
                tempStrings[k++] = arr[j++];
            }
        }

        while(i <= mid){
            tempStrings[k++] = arr[i++];
        }

        while(j <= ei){
            tempStrings[k++] = arr[j++];
        }

        for (k = 0, i = si; k < tempStrings.length; k++, i++) {
            arr[i] = tempStrings[k];
        }
    }
    public static void mergeSort(String [] arr, int si, int ei){
        if(si >= ei) return;

        int mid = si + (ei - si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, ei, mid);
    }
    public static void main(String[] args) {
        String [] arr = { "sun", "earth", "mars", "mercury"};
        mergeSort(arr, 0, arr.length - 1);

        System.out.print("{");
        for (String string : arr) {
            System.out.print(string + ", ");
        }
        System.out.print("}");
    }
}
