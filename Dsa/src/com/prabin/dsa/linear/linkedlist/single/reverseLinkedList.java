package com.prabin.dsa.linear.linkedlist.single;

public class reverseLinkedList {


    public Node reverselist(Node head) {

        Node prev = null;
        Node current =head;
        Node next = null;

        while(current != null){

       next = current.getNext();
       current.setNext(prev);
       prev=current;
       current=next;

        }

        return prev;
    }
}
