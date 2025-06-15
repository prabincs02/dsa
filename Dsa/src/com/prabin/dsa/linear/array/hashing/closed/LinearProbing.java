package com.prabin.dsa.linear.array.hashing.closed;

import java.util.Arrays;

class lp{
    private static int hashtable[];
    private static int size=6;

    lp(){
        hashtable =new int [size];
        Arrays.fill(hashtable,-1);

    }
    int getindex(int num){
        return num%size;
    }

    void insert(int val){
        int index=getindex(val);

        while(hashtable[index]!=-1){
            index = (index+1)%size;
        }
        hashtable[index]=val;
       // System.out.print(index);
    }

    void display(){
    //    System.out.println();
        for(int i:hashtable){
            System.out.print(i+" ");
        }
    }
}

public class LinearProbing {
    public static void main(String[] args) {
        lp linear = new lp();
        System.out.println("10 16 22 4 5 6");
        linear.insert(10);
        linear.insert(16);
        linear.insert(22);
        linear.insert(4);
        linear.insert(5);
        linear.insert(6);

        linear.display();
    }
}
