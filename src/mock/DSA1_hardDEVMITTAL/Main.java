package mock.DSA1_hardDEVMITTAL;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//	int arr[] = {1,5,9,9,9,9,78,258,6548,9548};
//    int n=arr.length;
//    int k = 9;
//       int count= elementSmallerThanK(arr,0,n-1,k);
//        System.out.println(count);

        int arr[] = {7, 5, 6, 2, 3, 1};
        maxElementInRight(arr);
//      ans: {6, 6, 3, 3, 1, -1}


    }


    public static int elementSmallerThanK(int[] arr,int l,int r,int k) {
        int count = 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] < k) {
                count = mid + 1;
                l = mid + 1;
            } else r = mid - 1;
        }
        return count;
    }

    public static void maxElementInRight(int[] arr) {

        int n = arr.length - 1;
        int[] res = new int[arr.length];
        int max = -1;
        res[res.length - 1] = -1;
        while (n > 0) {
            max = Math.max(max, arr[n]);
            res[n - 1] = max;
            n--;
        }

        System.out.println(Arrays.toString(res));
    }
}
