package com.prabin.dsa.linear.stack;

public class StackUsingArray {
    private int arr[];
    private int capacity;
    private int top;

    StackUsingArray(int val){
        arr=new int[val];
        capacity=val;
        top=-1;
    }


    void push(int val){
        
    }



    public static void main(String[] args) {
        StackUsingArray st = new StackUsingArray(5);

        st.push(1);



    }

}
