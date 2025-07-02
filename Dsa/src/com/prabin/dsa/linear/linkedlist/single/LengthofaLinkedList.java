package com.prabin.dsa.linear.linkedlist.single;

public class LengthofaLinkedList {
    int count=0;
    public int travel(Node head) {

        while (head != null) {
            head = head.getNext();
            count++;
        }

        return count;
    }

}
