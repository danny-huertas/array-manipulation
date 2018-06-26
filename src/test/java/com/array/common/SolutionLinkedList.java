package com.array.common;/*

Delete the kth last Node From Linked List


*/

class SolutionLinkedList {
    public static void main(String[] args) {
        Node head = new Node(4);
        Node current = head;

        //System.out.println(head.toString());
        for (int i = 0; i < 7; i++) {
            current.next = new Node(i);
            current = current.next;
        }

        //System.out.println(head);

        int k = 2;

        Node node = removeKthLast(head, k);
        printNodes(node);
    }

    public static Node removeKthLast(Node head, int k) {
        Node current = head;
        Node prev = null;
        int length = nodeLength(head);

        while (current.next != null && k != length) {
            prev = current;
            if (--length == k) {
                prev = current.next;
                current = current.next;
            }
            if (current.next != null) {
                current = current.next;
            }
        }

        if (prev != null && current.next != null) {
            prev.next = current.next;
        }

        return head;
    }

    public static int nodeLength(Node head) {
        Node current = head;
        int length = 0;

        while (current.next != null) {
            current = current.next;
            length++;
        }

        return length;
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