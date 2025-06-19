package com.prabin.dsa.linear.linkedlist.single;

public class Deletebyvalue {
    private int val;

    Node temp;

    Node delete(int deleteval,Node head) {
        if (head == null)
            return null;

            if (head.getVal() == deleteval) {
                return head.getNext(); // skip head
            }



        temp = head;
        Node prev = null;


        while(temp!=null){
            if(temp.getVal() == deleteval){
               prev.setNext(temp.getNext());
               break;
            }
            prev = temp;
            temp=temp.getNext();

        }
        return head;
    }



}
