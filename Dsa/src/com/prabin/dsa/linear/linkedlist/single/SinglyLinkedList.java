package com.prabin.dsa.linear.linkedlist.single;


public class SinglyLinkedList {

    Node head;


    SinglyLinkedList() {
        head = null;

    }

    void insert(int val) {

        Node newnode = new Node(val);
//        if (head == null) {
//            head = newnode;
//
//        } else {
//            newnode.setNext(head);
//            head = newnode;
//        }

        if(head== null){
            head= newnode;
        }
        else{
            Node temp =head;
            Node prev=head;
            while(temp!=null){
                prev=temp;
                temp=temp.getNext();
            }
            prev.setNext(newnode);
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

    void insertAtFirst(int val){
         nodeatfirst n1 = new nodeatfirst();

         head=n1.insert(val,head);
    }

        void lengthOfTheList(){
        LengthofaLinkedList lll = new LengthofaLinkedList();
            int val =  lll.travel(head);
            System.out.print(val);
        }

    private void insertAtLast(int val) {
         Insertlast i1 = new Insertlast();
        head = i1.insert(val,head);
    }
   void insertpos(int pos,int num){
        InsertAtAnyPostion i1 = new InsertAtAnyPostion();
        head = i1.insert(pos,num,head);
   }

    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.insert(5);
        sl.insert(6);
        sl.insert(7);
        sl.insert(9);
        sl.insert(10);
        sl.insert(2);
        sl.insert(11);
        sl.insert(87);
        sl.insert(13);


        System.out.println("Traversal of Singly Linked List");
        sl.display();
        System.out.println();
        System.out.println("Delete the value 10");
        sl.delete(10);
        sl.display();
        System.out.println();
        System.out.println("Length of Singly Linked List");
        sl.lengthOfTheList();
        System.out.println();
        System.out.println("insertion at the Beginning of Singly Linked List");
        sl.insertAtFirst(4);
        sl.display();
        System.out.println();
        System.out.println("Insertion at the End of Singly Linked List:");
        sl.insertAtLast(99);
        sl.display();
        System.out.println();
        System.out.println("Insertion at a Specific Position of the Singly Linked List:");

        sl.insertpos(5,999);
        sl.display();

        System.out.println();
        System.out.println("delete at begining");
        // delete at begining;
        sl.deleteAtBegin();
        sl.display();

        System.out.println();
        System.out.println("delete at last");
        sl.deleteatLast();
        sl.display();


        System.out.println();
        System.out.println("delete at any ");
        sl.deleteatany(5);
        sl.display();



    }

    private void deleteatany(int i) {
        deleteAnything dl3 = new deleteAnything();

        head=dl3.deleteatpos(i,head);
    }

    private void deleteatLast() {
        deleteAnything d2 = new deleteAnything();
        head = d2.deletelast(head);
    }

    private void deleteAtBegin() {
        deleteAnything dl = new deleteAnything();
        head = dl.deletefirst(head);
    }


}
