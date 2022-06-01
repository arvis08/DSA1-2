package com.company.Queue;

import java.util.Deque;
import java.util.LinkedList;

public class assignment {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
    }


    static void push_back_pb(Deque<Integer> dq, int x) {
        //Your code
        dq.addLast(x);
    }


    static void push_front_pf(Deque<Integer> dq, int x) {
        // Your code here
        dq.addFirst(x);
    }


    static void pop_back_ppb(Deque<Integer> dq) {
        // Your code here
        if (dq.isEmpty()) System.out.println(-1);
        else dq.removeLast();
    }


    static int front_dq(Deque<Integer> dq) {
        // Your code here
        if (dq.isEmpty()) return -1;
        return dq.removeFirst();
    }
}