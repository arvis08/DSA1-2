package com.company.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int[] a=new int[5];
//        for (int i = 0; i < a.length; i++) {
//            a[i]=i*17;
//            System.out.println(a[i]);
//           }
//            for (int i = 0; i < a.length; i++) {
//                System.out.println(a[i]);
//             }
//        System.out.println(a);
//            System.out.println(a[2]);
//            a[2]=3;
//            System.out.println(a[2]);

//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the size of the array: ");
//        int size = s.nextInt();
//        int[] arr = new int[size];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("Enter the " + i + "th element: ");
//            arr[i] = s.nextInt();
//        }
//        System.out.print("How many times you want to rotate an array ");
//        int k=s.nextInt();
//        k=k%arr.length;

//        for (int i = 0; i < k; i++) {
//            rotateArray(arr);
//            rotateAnti(arr);

//        }


//        reverseAnArray(arr);


        int[] arr = {1, 0, -1, -8, 2, -4, 5, 7};
        System.out.println(Arrays.toString(arr));
        sortPN(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + " , ");
            }
        }


//        System.out.println(max(arr));

//        System.out.print("enter the value to find: ");
//        int k=s.nextInt();

//        System.out.println(findElement(arr,k));


//        checkPrime(k);


//        for (int i = 0; i < arr.length; i++) {
//            if (i == arr.length - 1) {
//                System.out.println(arr[i]);
//
//            } else {
//                System.out.print(arr[i] + ",");
//            }
//        }
//        System.out.println(Arrays.toString(arr));


//

//        int[] arr = {0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + ",");
//        }
//        System.out.println("");
//
//        sort01(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + ",");
//        }
//        int[] arr = {12, 59, 35, 14, 95, 315, 75, 0, 8};

//        System.out.println(isPrimeOptimized(25367));
//        System.out.println(divisors(49));
//        System.out.println(divisor(100));
//        System.out.println(reverseANumber(1234));
//        System.out.println(repeat(arr,1));
//        System.out.println(minElement(arr));


        //addition of two arrays
//        Scanner scn=new Scanner((System.in));
//        System.out.println("enter size of 1st array: ");
//        int n1= scn.nextInt();
//        System.out.print("enter array elements: ");
//        int[] a1=new int[n1];
//        for (int i = 0; i < a1.length; i++) {
//            a1[i]=scn.nextInt();
//        }
//        System.out.println("enter size of 1st array: ");
//        int n2= scn.nextInt();
//        System.out.print("enter array elements: ");
//        int[] a2=new int[n2];
//        for (int i = 0; i < a2.length; i++) {
//            a2[i]=scn.nextInt();
//        }
//        int[] sum =new int [n1>n2? n1:n2];
//        int c=0;
//
//        int i=a1.length-1;
//        int j=a2.length-1;
//        int k=sum.length-1;
//
//        while(k>=0){
//            int d=c;
//
//            if(i>=0){
//                d+=a1[i];
//            }
//            if(j>=0){
//                d+=a2[j];
//            }
//            c=d/10;
//            d=d%10;
//
//            sum[k]=d;
//
//            i--;
//            j--;
//            k--;
//        }
//        System.out.println("sum is: ");
//        if(c!=0){
//            System.out.print(c);
//        }
//        for(int val:sum){
//            System.out.print(val);
//        }
    }


    public static int max(int[] a) {
//        int maxRes=Integer.MIN_VALUE;
        int maxRes = a[0];
        for (int i = 0; i < a.length; i++) {
            if (maxRes < a[i]) {
                maxRes = a[i];
            }
        }
        return maxRes;
    }
//


    public static int findElement(int[] a, int el) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == el) {
                return i;
            }
        }
        return -1;
    }
//


    public static void checkPrime(int n) {
        if (n == 0 || n == 1) {
            System.out.println(n + " is not a prime number.");
            return;
        }
        int loopTill = ((n / 2) - 1);
        for (int i = 2; i < loopTill; i++) {
            if (n % i == 0) {
                System.out.println(n + " is a not a prime number.");
                return;
            }
        }
        System.out.println(n + " is a prime number.");
    }
//


    public static void sort01(int[] arr) {
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if (arr[i] == 0) {
                if(i!=j) swap(arr, i, j);
                i++;
                j++;

            } else {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static boolean isPrimeOptimized(int n) {
        int sqrt = (int) Math.sqrt(n);
        if (n == 0 || n == 1) {

            return false;
        }
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static int divisors(int n) {
        int count = 2;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                count++;
                if (n / i != i) {
                    count++;
                }
            }
        }

        return count;
    }


    public static int reverseANumber(int n) {
        int res = 0;
        while (n > 0) {
            int last = n % 10;
            res = res * 10 + last;
            n = n / 10;
        }
        return res;
    }

//    public static int divisor(int n) {
//        int sqrt = (int) Math.sqrt(n);
//        int count = 0;
//        for (int i = 1; i <= sqrt; i++) {
//            if (n % i == 0) {
//                count++;
//                if (n / i != i) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }

    public static int occurence(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) count++;
        }
        return count;
    }

    public static int minElement(int[] arr) {
        int minRes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[minRes] > arr[i]) {
                minRes = i;
            }
        }
        return arr[minRes];
    }

    public static void rotateArray(int[] arr) {
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
    }

    public static void rotateAnti(int[] arr) {
        int last = arr[arr.length - 1];
        int i = arr.length - 1;
        while (i != 0) {
            arr[i] = arr[i - 1];
            i--;
        }
        arr[0] = last;
    }


    public static void sortPN(int[] arr) {
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if (arr[i] >= 0) {
                if (i != j) swap(arr, i, j);
                i++;
                j++;
            } else {
                i++;
            }
        }
    }

    public static void reverseAnArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}