package com.company.time_space;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {

//        int[] arr={14,525,86,1,0,2,5,48,4545,475};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

//        int[] arr={1,2,3,4,5};
//        System.out.println(isSorted(arr));

//        System.out.println(Arrays.toString(arr));
//        Scanner s= new Scanner(System.in);
//
//        System.out.print("enter the number: ");
//        int x=s.nextInt();
        int[] arr={0,1,1,1,2,2,2,3,3,4,5,5,5,5};
        System.out.println(Arrays.toString(arr));
        System.out.println(numberOfOccurrenceLinear(arr,0));
//
//        System.out.print("occurence of "+x+" is "+numberOfOccurrence(arr,x));
//        System.out.println(numberOfOccurrence(arr,x));
//        int[] res=mergeSort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(res));
//        System.out.println(partitionIndex(arr));
//        System.out.println(Arrays.toString(mergeSort(arr,0,arr.length-1)));


////        int[] n1 = {0,2,4,6,8};
//        int[] n2 = {1, 8, 6, 2, 5, 4, 8, 3, 7};

//        System.out.println(maxarea(n2));
//        mergeTwoSortedArray(n1,n2);

//        System.out.println(Arrays.toString(mergeTwoSortedArray(n1,n2)));
//        int[] ans=mergeTwoSortedArray(n1,n2);
//        System.out.println(Arrays.toString(ans));

//        System.out.println(Arrays.toString(arr));
//        StringBuilder s=new StringBuilder("hello");
//        s.append("hii");
//        System.out.println(s);


//        int[] arr={4,5,0,1,2,3,4};
//        System.out.println(Arrays.toString(arr));
//        System.out.println(countRotationBinary(arr,0,arr.length-1));
//        System.out.println(countRotationLinear(arr));

    }

    ///////////////////////////////////////////////////////////////
    private static void swap(int[] arr, int i, int minIdx) {
        int temp = arr[i];
        arr[i] = arr[minIdx];
        arr[minIdx] = temp;
    }
    //////////////////////////////////////////////
    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = i; j >= 1; j--) {
                if (arr[j] < arr[j - 1]) swap(arr, j, j - 1);
                else break;
            }
        }
    }
    ////////////////////////////////////////////////////////////////////
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIdx] > arr[j]) minIdx = j;
            }
            if (i != minIdx) swap(arr, minIdx, i);
//            System.out.println(Arrays.toString(arr));
        }
    }
    //////////////////////////////////////////////////////////
    public static void bubbleSort(int[] arr) {

        for (int i = arr.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
            }
        }
    }
    //////////////////////////////////////////////////
    public static void sortColours(int[] nums) {
        int i = 0;
        int j = 0;
        int k = nums.length - 1;
        while (i <= k) {
            if (nums[i] == 0) {
                swap(nums, i, j);
                i++;
                j++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                swap(nums, i, k);
                k--;
            }
        }
    }

    ////////////////////////////////////////////////////////////////////
    public static int maxarea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;
        while (l < r) {
            max = Math.max(helper(height, l, r), max);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }

    private static int helper(int[] height, int l, int r) {
        return (r - l) * Math.min(height[l], height[r]);
    }

    ///////////////////////////////////////////////////////////////

    public static int[] mergeTwoSortedArray(int[] n1, int[] n2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[n1.length + n2.length];
        while (i < n1.length && j < n2.length) {
            if (n1[i] < n2[j]) {
                ans[k] = n1[i];
                i++;
                k++;
            } else {
                ans[k] = n2[j];
                j++;
                k++;
            }
        }
        while (i < n1.length) {
            ans[k] = n1[i];
            i++;
            k++;
        }
        while (j < n2.length) {
            ans[k] = n2[j];
            j++;
            k++;
        }
        return ans;
    }


    public static int[] mergeSort(int[] arr, int l, int r) {
        if(l==r){
            int[] res=new int[1];
            res[0]=arr[l];
            return res;
        }
        int mid = (l + r) / 2;
        int[] lArr = mergeSort(arr, l, mid);
        int[] rArr = mergeSort(arr, mid + 1, r);
        return mergeTwoSortedArray(lArr,rArr);
    }

    ///////////////////////////////////////////////////////////////////

    public static int partitionIndex(int[] arr){
        int pivot=arr[arr.length-1];
        int i=0;
        int j=0;
        while(i<arr.length){
            if(arr[i]<=pivot){
                if(i!=j) swap(arr,i,j);
                j++;
            }
            i++;
        }
        return j-1;
    }

    ///////////////////////////////////////////////////////////////////////

    public static int numberOfOccurrenceLinear(int[] arr,int x){
        int n=arr.length-1;
        int count=0;
        for (int i = 0; i <= n; i++) {
            if(arr[i]==x) count++;

        }
        return count;
    }


    public static int numberOfOccurrenceBinary(int[] arr,int x){
        int ind= binarySearch( arr,0,arr.length-1,x);

        if(ind==-1) return 0;

        int count=1;
        int left=ind-1;
        while(left>=0 && arr[left]==x){
            count++;
            left--;
        }

        int right=ind+1;
        while(right<arr.length && arr[right]==x){
            count++;
            right++;
        }
        return count;
    }


    public static int binarySearch(int[] arr,int l,int r,int x){
        if(r<l) return -1;
        int mid=(l+r)/2;
        if(arr[mid]==x) return mid;
        if(arr[mid]>x) return binarySearch(arr,l,mid-1,x);
        return binarySearch(arr,mid+1,r,x);
    }

    ///////////////////////////////////////////////////////////////////////

    public static boolean isSorted(int[] arr){
        int n=arr.length;
        if(n==0 || n==1) return true;
        for (int i = 1; i <n ; i++) {
            if(arr[i-1]>arr[i])
                return false;
        }
        return  true;
    }

    ///////////////////////////////////////////////////////////////////////

    public static int countRotationLinear(int[] arr){
        int n=arr.length-1;
        for (int i = 1; i < n; i++) {
            if(arr[i-1]>arr[i]) return i;
        }
        return -1;
    }

    public static int countRotationBinary(int[] arr,int l,int r){
        if(l==0 && r==0) return 0;
        if(l==r) return 0;
        int mid=(l+r)/2;
        if(mid<r && arr[mid+1]<arr[mid]) return mid+1;
        if(mid>l && arr[mid]<arr[mid-1]) return mid;
        if(arr[r]> arr[mid]) return countRotationBinary(arr,l,mid-1);
        return countRotationBinary(arr,mid+1,r);
    }
}