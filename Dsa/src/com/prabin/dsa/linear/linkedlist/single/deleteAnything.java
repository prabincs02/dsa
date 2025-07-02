package com.prabin.dsa.linear.linkedlist.single;

public class deleteAnything {

    public Node deletefirst(Node head){

      Node temp =head.getNext();
      head =temp;

      return head;

    }

    public Node deletelast(Node head) {
        Node prev = null;
        Node temp = head;

        while(temp != null && temp.getNext()!=null)
        {
            prev=temp;
            temp=temp.getNext();

        }
        prev.setNext(null);
        return head;
    }

    public Node deleteatpos(int i,Node head) {
        Node temp = head;
        Node prev = null;
        int count =0;

        while(temp!=null){

            count++;

            if(count==i){
                prev.setNext(temp.getNext());
            }
            prev=temp;
            temp=temp.getNext();
        }

        return head;

    }
}
