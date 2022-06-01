package com.company.Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int[] res=nextGreaterElement(arr);

        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }


    public static void playingAroundWithStack() {
        CustomStack<Integer> stack = new CustomStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }


    //https://leetcode.com/problems/valid-parentheses/

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == '(' || curr == '[' || curr == '{') {
                stack.push(curr);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.peek();
                if ((top == '(' && curr == ')') ||
                        (top == '[' && curr == ']') ||
                        (top == '{' && curr == '}')) {
                    stack.pop();
                } else return false;
            }
        }
        return stack.isEmpty();
    }


    public static int[] nextGreaterElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int ci = 1;
        int[] res = new int[arr.length];
        while (ci < arr.length) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[ci]) {
                res[stack.pop()] = arr[ci];
            }
            stack.push(ci);
            ci++;
        }
        while (!stack.isEmpty()) {
            res[stack.pop()] = -1;
        }
        return res;
    }
}
