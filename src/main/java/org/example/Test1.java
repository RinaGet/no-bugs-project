package org.example;

import static java.util.Arrays.binarySearch;

/*     [5, 7, 9, 11] TODO find 9
       int a [5, 7]; int b [9, 11]
       int c [9] int d [11]
       int c [9]
       сложность обычного поиска = N - кол-во элементов
       N/2/2/2/2/2/2 = m
       2^m = N
       2^m = N
       эти 2 формулы идентичны
    */

public class Test1 {
    public static void main(String[] args) {
        int[] arr = new int[] {5, 7, 9, 11}; //0,1,2,3
        int target = 9;

        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found");
        }
    }

      public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1; //??

        while (left <= right) {
            int mid = left + (right - left)/2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

/*    public static void binSearch(int target) {
        int [] z = new int[] {5, 7, 9, 11};
        int halfA = z.length/2;
        boolean q = false;
        if (target[])


    }*/






}
