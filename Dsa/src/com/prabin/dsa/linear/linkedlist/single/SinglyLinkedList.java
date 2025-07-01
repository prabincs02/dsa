package com.prabin.dsa.linear.linkedlist.single;


public class SinglyLinkedList {

    Node head;


    SinglyLinkedList() {
        head = null;

    }

    void insert(int val) {

        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;

        } else {
            newnode.setNext(head);
            head = newnode;
        }
    }


    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getVal() + " ");
            temp = temp.getNext();
        }
    }
   void delete(int val){
            Deletebyvalue del = new Deletebyvalue();

          head =   del.delete(val,head);


        }


    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.insert(5);
        sl.insert(6);
        sl.insert(7);
        sl.insert(9);
        sl.insert(9);
        sl.insert(2);
        sl.insert(11);
        sl.insert(87);
        sl.insert(13);



        sl.display();
        System.out.println();
        sl.delete(10);
        sl.display();


    }
}
