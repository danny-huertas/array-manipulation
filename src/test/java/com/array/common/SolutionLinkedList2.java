package com.array.common;/*

Delete the kth last Node From Linked List


*/

class SolutionLinkedList2 {
    public static void main(String[] args) {
        Node head = new Node(-1);
        Node current = head;

        //System.out.println(head.toString());
        for (int i = 5; i < 10; i++) {
            current.next = new Node(i);
            current = current.next;
            // System.out.println(current.toString());
        }

        //System.out.println(head);

        int k = 0;

        Node node = removeKthLast(head, k);

        printNodes(node);
    }

    public static Node removeKthLast(Node head, int k) {
        Node stop = head;
        Node prev = null;
        Node current = head;

        while (k - 1 > 0 && stop.next != null) {
            stop = stop.next;
            k--;
        }

        while (stop.next != null) {
            prev = current;
            current = current.next;
            stop = stop.next;
        }

        if (prev == null) {
            head = current.next;
        } else {
            prev.next = current.next;
        }

        return head;
    }

    public static void printNodes(Node head) {
        Node current = head;

        while (current.next != null) {
            System.out.println(current.toString());
            current = current.next;
        }
        System.out.println(current.toString());
    }
}