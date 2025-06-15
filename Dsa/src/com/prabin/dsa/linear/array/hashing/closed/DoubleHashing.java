package com.prabin.dsa.linear.array.hashing.closed;

import java.util.Arrays;

public class DoubleHashing {
    private static int hashtable[];
    private static int size=7;
    private static int r =5;
   DoubleHashing(){
       hashtable= new int[size];
       Arrays.fill(hashtable,-1);
    }

    public void insert(int num) {
        int index1 = num % size;
        int index2 = r - (num % r);  // Correct secondary hash
        int i = 0;

        while (i < size) {
            int index = Math.floorMod(index1 + i * index2, size);

            if (hashtable[index] == -1) {
                hashtable[index] = num;
                System.out.println("Inserted " + num + " at index " + index);
                return;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        DoubleHashing dh = new DoubleHashing();

        dh.insert(10);
        dh.insert(17);
        dh.insert(24);
        dh.insert(31);
        dh.insert(16);
        dh.insert(56);
        dh.insert(90);
        dh.insert(80);
    }
}
