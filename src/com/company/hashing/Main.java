package com.company.hashing;

import com.company.OOPS.Laptop;
import com.company.linkedlist.LinkedList;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        playAroundWithHM();

        int[] arr = {10, 6, 3, 3};
        System.out.println(findNumberPair(arr, 2));
//        int[] arr={10,4,5,7,8,45,456,25,8413,12 };
//        Arrays.sort(arr);
//        for(int i: arr){
//            System.out.print(i+" ");
//        }


//        String s="Hello World";
//        Laptop laptop=new Laptop (8,256);
//        Laptop laptop1=laptop;
//        Laptop laptop2=new Laptop(8,25);
//        System.out.println(2==2);
//        System.out.println(laptop==laptop1);
//        System.out.println(s.hashCode());
//        System.out.println(laptop.hashCode());
//        System.out.println(laptop1.hashCode());
//        System.out.println(laptop2.hashCode());
    }



    /*
    Given an array A[] and positive integer K, the task is to count
    total number of pairs in the array whose sum is divisible by K.

    Input :
    A[] = {2, 2, 1, 7, 5, 3}, K = 4
    Output : 5
    Explanation :
    There are five pairs possible whose sum
    is divisible by '4' i.e., (2, 2),
    (1, 7), (7, 5), (1, 3) and (5, 3)
     */

    public static int findNumberPair(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i] % k, map.getOrDefault(arr[i] % k, 0) + 1);
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i] % k;
            if (map.get(key) > 0) {
                map.put(key, map.get(key) - 1);
            }
            count += map.getOrDefault((Math.abs(k - (arr[i] % k)) % k), 0);
        }
        return count;
    }

    public static void playAroundWithHM() {
//        GenericHashMap<String, Integer> hm = new GenericHashMap<>();
//        hm.put("India", 3);
//        hm.put("USA", 5);
//        hm.put("China", 10);
//        hm.put("Australia", 1);
//        hm.put("UK", 2);
//        hm.display();
//        hm.put("India", 9);
//        System.out.println("================");
//        hm.display();
//        System.out.println("hm.size() = " + hm.size());
//        System.out.println("hm.containsKey(\"India\") = " + hm.containsKey("India"));
//        System.out.println("hm.get(\"China\") = " + hm.get("China"));
//        System.out.println("hm.remove(\"China\") = " + hm.remove("China"));
//        hm.display();
//        System.out.println("hm.size() = " + hm.size());

        GenericHashMap<Integer, Boolean> hm = new GenericHashMap<>();
        hm.put(1, true);
        hm.put(5, false);
        hm.put(7, false);
        hm.put(9, true);
        hm.put(3, false);
        hm.put(8, true);
        hm.put(9, false);
        hm.put(2, false);
        hm.put(6, true);
        hm.display();
    }
}
