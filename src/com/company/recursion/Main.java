package com.company.recursion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println(add(4, 3));
//        printNumberSequence(5);
//        Scanner s= new Scanner(System.in);
//        System.out.print("find the factorial of: ");
//        int a=s.nextInt();
//        System.out.println(factorial(a));
//        System.out.println(fibonacci(3));
        towerOfHanoi(3, 'A', 'B', 'C');
        System.out.println(ans);
    }
    public static int ans=0;


//    public static int add(int a, int b) {
//        if (b == 1) {
//            return a;
//        }
//        int x = add(a, b - 1);
//        return a + x;
//    }
//
//    public static void printNumberSequence(int n) {
//        if (n == 1) {
////            System.out.println("1");
//            return;
//        }
//        System.out.println(n);
//        printNumberSequence(n - 1);
//        System.out.println(n);
//    }
//
//    public static int factorial(int n) {
//        if (n == 1) {
////            System.out.println("factorial(" + n + ") = 1");
//            return 1;
//        } else {
////            System.out.println("factorial("+n+") = " +n+"* factorial("+(n-1)+")");
//            return n * factorial(n - 1);
//        }
//    }
//
//    public static int fibonacci(int n) {
//        int a = 0;
//        int b = 1;
//        if (n == 0) return 0;
//        if (n == 1) return 1;
//        for (int i = 2; i <= n; i++) {
//            int c = a + b;
//            a = b;
//            b = c;
//        }
//        return b;
//    }

    public static void towerOfHanoi(int n, char s, char h, char d) {
        if(n==0)return;
        towerOfHanoi(n - 1, s, d, h);
        System.out.println(n + "-[" + s + "->" + d + "]");
        ans++;
        towerOfHanoi(n - 1, h, s, d);
    }
}
