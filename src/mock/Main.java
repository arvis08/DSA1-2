package mock;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
//      int[] a={0,1,1,0};
//      int i=0;
//        int count=0;
//      int j=a.length-1;
//      while(i<=j){
//          int k=2;
//          if(k==(a[i]+a[j])){
//              count++;
//
//          }
//          i++;
//          j--;
//      }
//        System.out.println(count);
        int[] arr = {12, 34, -20, 44, -10, 56, -2, 86, 12};
        System.out.println(Arrays.toString(arr));
//        sortPositive(arr);
        sortPositive(arr);
        System.out.println(Arrays.toString(arr));
    }


//    public static void sortPositive(int[] arr) {
//
//        for (int i = arr.length - 1; i >= 1; i--) {
//            for (int j = 0; j < i; j++) {
//                int temp = arr[j];
//                if (temp >= 0) {
//                    if (arr[j] > arr[j + 1] && arr[j + 1] >= 0) {
//                        arr[j] = arr[j + 1];
//                        arr[j + 1] = temp;
//                    }
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }



    /* Medium Mock
    Program to sort only positive numbers of the array
    * Input:
          [ 2, -6, -3, -8, 4, 1]
          [ 9, -2, 3, -1, 1, 5]
    *   Output:
          [1, -6, -3, -8, 2, 4]
          [1, -2, 3, -1, 5, 9]
     */
    public static void sortPositive(int[] arr) {
        for (int i=arr.length-1; i>=1; i--) {
            for (int j = 0; j<i; j++) {
                int check = arr[j];
                if (check>= 0) {
                    int k = j+1;
                    while(arr[k] < 0)
                        k++;
                    if (arr[j] > arr[k] && arr[k]>=0) {
                        int temp = arr[j];
                        arr[j] = arr[k];
                        arr[k] = temp;
                    }

                }
            }
        }
    }
}
