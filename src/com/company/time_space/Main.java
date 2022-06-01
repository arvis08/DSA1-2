package com.company.time_space;

public class Main {
    public static void main(String[] args) {
//        int ans=gcdRec(18,27);
//        System.out.println("saving and calling it: "+ans);
//        System.out.println("directly calling it: "+gcd(27,18));
//        System.out.println(powO(2, 10));
        int[] arr = {1, 2, 8, 9, 12, 45, 78, 96, 99, 110, 115};
//        System.out.println(binarySearch(arr, 0));
//        System.out.println(binarySearchRec(arr, 12, 0, arr.length - 1));
//        System.out.println(linearSearch(arr,1));
//        testRec(0);

//        System.out.println(ternarySearch(arr, 3));
        System.out.println(ternarySearchRec(arr,99,0,arr.length-1));
    }


    public static int gcd(int a, int b) {
        while (a % b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return b;
    }

    public static int gcdRec(int a, int b) {

        int r = a % b;
        if (r == 0) return b;
        return gcdRec(b, r);
    }

    public static int pow(int n, int x) {
        if (x == 1) return n;
        return n * pow(n, x - 1);
    }

    public static int powO(int n, int x) {
        if (x == 1) return n;
        int res = powO(n, x / 2);
        res = res * res;
        if (x % 2 == 1) {
            res = res * n;
        }
        return res;
    }

    public static int linearSearch(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) return i;
        }
        return -1;
    }

    public static void testRec(int n) {
//        if(n==12000) return;
//        System.out.println(n);
//        testRec(n+1);
        for (int i = 0; i < 1000000; i++) {
            System.out.println(i);

        }
    }

    public static int binarySearch(int[] arr, int k) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == k) return mid;
            else if (arr[mid] < k) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }

    public static int binarySearchRec(int[] arr, int k, int l, int r) {
        if (l > r) return -1;
        int mid = (l + r) / 2;
        if (arr[mid] == k) return mid;
        else if (arr[mid] < k) return binarySearchRec(arr, k, mid + 1, r);
        else return binarySearchRec(arr, k, l, mid - 1);
    }

    public static int ternarySearch(int[] arr, int k) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int partition = (r - l) / 3;
            int m1 = l + partition;
            int m2 = r - partition;
            if (arr[m1] == k) {
                return m1;
            } else if (arr[m2] == k) {
                return m2;
            } else if (k < arr[m1]) {
                r = m1 - 1;
            } else if (k > arr[m2]) {
                l = m2 + 1;
            } else {
                l = m1 + 1;
                r = m2 - 1;
            }
        }
        return -1;
    }

    public static int ternarySearchRec(int[] arr,int k,int l,int r){
        if(l>r) return -1;
        int partition=(r-l)/3;
        int m1=l+partition;
        int m2=r-partition;
        if(arr[m1]==k) return m1;
        else if(arr[m2]==k) return m2;
        else if(k<arr[m1]) return ternarySearchRec(arr, k, l, m1-1);
        else if(k>arr[m2]) return ternarySearchRec(arr, k, m2+1, r);
        else return ternarySearchRec(arr,k,m1+1,m2-1);
    }
}
