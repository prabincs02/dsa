package com.prabin.dsa.linear.linkedlist.single;

public class nodeatfirst {

    Node insert(int num,Node head){
        Node temp = new Node(num);
        temp.setNext(head);
        head = temp;

        return head;
    }


}
