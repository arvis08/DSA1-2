package com.company.linkedlist;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        playingAroundWithLL();



    }

    public static void playingAroundWithDLL(){
        DoublyLL doublyLL=new DoublyLL();
        doublyLL.insertFirst(50);
        doublyLL.display();
        doublyLL.insertFirst(40);
        doublyLL.display();
        doublyLL.insertFirst(30);
        doublyLL.display();
        doublyLL.insertFirst(20);
        doublyLL.display();
        doublyLL.insertFirst(10);
        doublyLL.display();
    }
    public static void playingAroundWithLL() {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.display();
        ll.add(20);
        ll.display();
        ll.add(30);
        ll.display();
        ll.add(40);
        ll.display();
        ll.add(50);
        ll.display();
        System.out.println("ll.getSize() = " + ll.getSize());
//        ll.pointerReversal();
        ll.deleteKthFromEnd(2);
        ll.display();

//        ll.getAt(3);

//        ll.updateData(3,100);
//        ll.display();
//        ll.addFirst(78);
//        ll.display();

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int aSize = getSize(headA);
        int bSize = getSize(headB);
        int initialSteps = Math.abs(aSize - bSize);
        ListNode ai = headA;
        ListNode bi = headB;
        while (initialSteps > 0) {
            if (aSize > bSize) ai = ai.next;
            else bi = bi.next;
            initialSteps--;
        }
        while (ai != bi) {
            ai = ai.next;
            bi = bi.next;
        }
        return ai;
    }

    public int getSize(ListNode node) {
        int s = 0;
        while (node != null) {
            node = node.next;
            s++;
        }
        return s;
    }

    public boolean hasCycle(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
            if (s == f) return true;
        }
        return false;
    }

    public ListNode detectCycle(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
            if (s == f) break;
        }
        if (f == null || f.next == null) return null;
        s = head;
        while (s != f) {
            s = s.next;
            f = f.next;
        }
        return s;
    }

    public ListNode copyLinkedList(ListNode head) {
        if(head==null) return null;
        ListNode old = head;
        while (old != null) {
            ListNode newNode = new ListNode(old.val);
            ListNode next = old.next;
            old.next = newNode;
            newNode.next = next;
            old = old.next.next;  // old=next;
        }
        old = head;
        while (old != null) {
            if (old.random != null) {
                old.next.random = old.random.next;
            }
            old = old.next.next;
        }
        ListNode res = head.next;
        old=head;
        while(old!=null){
            ListNode n=old.next;
            old.next=old.next.next;
            if(n.next!=null){
                n.next = n.next.next;
            }
            old=old.next;
        }
        return res;
    }

//    public static LinkedList.Node MakeCircular(LinkedList.Node head) {
//
//    }



    public static ListNode sortList(ListNode head) {

        if(head == null && head.next == null){
            return head;
        }

        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        temp.next = null;

        ListNode left_side = sortList(head);
        ListNode right_side = sortList(slow);

        return merge(left_side,right_side);
    }

    public static ListNode merge(ListNode l1,ListNode l2){

        ListNode sorted_temp = new ListNode(0);
        ListNode current_node = sorted_temp;

        while(l1 != null && l2 != null){
            if(l1.val<l2.val){
                current_node.next = l1;
                l1 = l1.next;
            }else{
                current_node.next = l2;
                l2 = l2.next;
            }

            current_node = current_node.next;
        }
        if(l1 != null){
            current_node.next = l1;
            l1 = l1.next;
        }

        if(l2 != null){
            current_node.next = l2;
            l2 = l2.next;
        }

        return sorted_temp.next;
    }



}
