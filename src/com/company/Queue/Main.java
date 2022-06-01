package com.company.Queue;

import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
//        playAroundQueue();

        Deque<Integer> deque=new LinkedList<>();

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
        if (dq.isEmpty()) return;
        else dq.removeLast();
    }


    static int front_dq(Deque<Integer> dq) {
        // Your code here
        if (dq.isEmpty()) return -1;
        return dq.peek();
    }


    public static void playAroundQueue(){
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(50);
        queue.enqueue(140);
        queue.enqueue(106);
        queue.enqueue(17);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.size());
    }
}
