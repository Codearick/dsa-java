public class MergeAnalysis {
    public static void main(String[] args) {
        int [] arr = {6, 3, 9, 5, 2,8};
        mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            // System.out.print(arr[i] + " ");
        }
    }
    public static void mergeSort(int [] arr, int si, int ei){
        if(si >= ei) return;

        if(si <= ei) {
            int mid = si + (ei - si) / 2; 
            mergeSort(arr, si, mid);  
            mergeSort(arr, mid + 1, ei);
            merge(arr, si, mid, ei);
        }

    }

    public static void merge(int [] arr, int si, int mid, int ei){
        int [] temp = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while(i <= mid){
            temp[k++] = arr[i++];
        }

        while(j <= ei){
            temp[k++] = arr[j++];
        }

        for (int k2 = 0; k2 < temp.length; k2++) {
            System.out.print(temp[k2] + " ");
        }
    }
}
