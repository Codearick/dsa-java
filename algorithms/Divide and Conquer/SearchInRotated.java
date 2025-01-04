
// Search in Rotated Sorted Array: 
// Input: Sorted, rotated Array with distinct numbers ( in ascending order). It is rotated at a pivot point. Find the index of given element. 
// Date: 01/10/2024
// Author: Rohan Gautam

import java.util.Scanner;

public class SearchInRotated {
    public static int search(int[] arr, int target, int si, int ei) {
        int mid = si + (ei - si) / 2;

        if (si >= ei) {
            return -1;
        }

        if (arr[mid] == target) {
            return mid;
        }

        // mid on L1
        if (arr[si] <= arr[mid]) {

            // case a: left
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
            }
            // case b: right
            else {
                return search(arr, target, mid + 1, ei);
            }
        }
        // mid on L2
        else {
            // case c: Right
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            }
            // case d: Left
            else {
                return search(arr, target, si, mid - 1);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };

        System.out.println("Enter your target: ");
        int target = sc.nextInt(); // output -> 4 if target is 0

        int idx = search(arr, target, 0, arr.length - 1);

        if (idx < 0) {
            System.out.println("The element doesn't exist!");
        } else {
            System.out.println("Index of the target element is: " + idx);
        }

        sc.close();
    }
}
