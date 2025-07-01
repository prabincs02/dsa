package com.prabin.dsa.linear.linkedlist.circular;

public class CircularLinkedList {
    Node head,tail;

    private class Node {
        int val;
        Node prev,next;

        Node(int val){
            this.val=val;
            prev=null;
            next=null;
        }
    }
    public void insert(int val){
        Node newNode = new Node(val);
        if(head==null){
            head=newNode;
            tail=newNode;
            head.prev=tail;
            tail.next=head;
        }
        else{
            newNode.next=head;
            newNode.prev=tail;
            head.prev=newNode;
            tail.next=newNode;

            head=newNode;

        }
    }

    public void forward(Node head){

        Node temp = head;
        boolean firstpass = true;
        while(temp != head || firstpass ){
            System.out.print(temp.val+" ");
            temp=temp.next;
            firstpass=false;
        }
    }

    public void backward(Node tail){
        if (tail == null) return;
        Node temp = tail;
        boolean firstpass = true;
        while(temp != tail || firstpass ){
            System.out.print(temp.val+" ");
            temp=temp.prev;
            firstpass=false;
        }
    }

    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insert(5);
        circularLinkedList.insert(6);
        circularLinkedList.insert(7);
        circularLinkedList.insert(8);
        circularLinkedList.insert(9);

        circularLinkedList.forward(circularLinkedList.head);
        System.out.println();
        circularLinkedList.backward(circularLinkedList.tail);

    }

}
