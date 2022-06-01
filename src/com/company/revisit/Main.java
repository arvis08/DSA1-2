package com.company.revisit;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList();
        System.out.println(primeRange(1, 10));
    }

    public static void ArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(5);
        }
        list.set(5, 20);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }

    public static ArrayList<Integer> primeRange(int M, int N) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = M; i <= N; i++) {
            boolean isP = isPrime(i);
            if (isP == true) {
                res.add(i);
            }
        }
        return res;
    }

    public static boolean isPrime(int n) {
        int x = (int) Math.sqrt(n);
        if (n == 1 || n == 0) return false;
        for (int i = 2; i <= x; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
