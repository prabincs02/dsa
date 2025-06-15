package com.prabin.dsa.linear.array.hashing.openseparatechaining;


import java.util.LinkedList;
import java.util.List;

class hashing{

    private static  final int size =5;

     List<Integer>[]table;

    public  hashing(){
        table = new LinkedList[size];

         for(int i=0;i<size;i++){
             table[i]= new LinkedList<>();
         }
     }
     public int getKey(int num){
        return num %size;

     }
     public void insert(int num){
        int number = getKey(num);
        table[number].add(num);
     }


     public void display(){
        for(int i=0;i<size;i++){
            System.out.print(i+"---");
            for(int j=0;j<table[i].size();j++){
                System.out.print(table[i].get(j)+"->");
            }

            System.out.println("null");
        }
     }
}

public class SeparateChaining {

    public static void main(String[] args) {

        hashing hash = new hashing();
        hash.insert(10);
        hash.insert(15);
        hash.insert(7);
        hash.insert(22);
        hash.insert(5);
        hash.insert(2);

        hash.display();
    }
}
