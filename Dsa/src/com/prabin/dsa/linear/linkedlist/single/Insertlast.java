package com.prabin.dsa.linear.linkedlist.single;

public class Insertlast {
    Node insert(int num,Node head){
        Node newNode = new Node(num);
        Node temp = head ;
        Node prev=null;
        while(temp != null){
            prev=temp;
            temp = temp.getNext();
        }
        prev.setNext(newNode);
        return head;

     }
}
