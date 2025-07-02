package com.prabin.dsa.linear.linkedlist.single;

public class InsertAtAnyPostion {

    Node insert(int pos ,int val,Node head){
        Node temp = head;
        int count =0;
        Node prev =null;
        Node newNode = new Node(val);

        while(temp!=null){
            count++;
            if(count==pos){
                newNode.setNext(temp);
                prev.setNext(newNode);
                return head;
            }
            prev=temp;
            temp=temp.getNext();
        }
        return head;
    }

}
