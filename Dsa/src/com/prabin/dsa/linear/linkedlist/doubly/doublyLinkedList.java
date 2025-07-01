package com.prabin.dsa.linear.linkedlist.doubly;

public class doublyLinkedList {
     Node head;
     Node tail;

    Node getNodeRoot(){
        return tail;
    }

    public void travel(){
      Node temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
    }
    public void insert(int val){
        Node newNode = new Node(val);
        if(head == null){
            head=tail=newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

    }


    public static void main(String[] args) {
        doublyLinkedList dl = new doublyLinkedList();
        System.out.println("hi");

        dl.insert(5);
        dl.insert(6);
        dl.insert(7);
        dl.insert(8);
        dl.insert(9);

        dl.travel();

    }
}
