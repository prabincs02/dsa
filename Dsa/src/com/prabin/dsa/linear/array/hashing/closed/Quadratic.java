package com.prabin.dsa.linear.array.hashing.closed;

import java.util.Arrays;

class quadratichash{
    private static int []table;
    private static int size=7;
    quadratichash(){
        table = new int[size];
        Arrays.fill(table,-1);
    }
    int findindex(int num){
        return num % size;
    }
    void insert(int num){
        int index = findindex(num);
        int  i=0;
        int pos;
       // while(table[(index + i*i)%size]!=-1){
          while (table[(pos = Math.floorMod(index + i * i, size))] != -1) {

                i++;
                if(i==size)
                    return;
            }


      //  table[(index + i*i)%size]=num;
          table[pos]=num;
    }
    void display(){
        for(int i : table){
            System.out.print(i+" ");
        }
    }
}
public class Quadratic {
    public static void main(String[] args) {
       quadratichash quad = new quadratichash();
       quad.insert(10);
        quad.insert(17);
        quad.insert(24);
        quad.insert(31);
       // quad.insert(10);
        quad.insert(16);

        quad.display();
    }
}
