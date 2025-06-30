package com.prabin.dsa.searching;

public class LinearSearch {

    public static void linearSearch(int arr[],int target){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Found inside");
                return;
            }
        }
        System.out.println("not found");
    }


    public static void main(String[] args) {


       int [] arr = {10, 25, 30, 45, 50};
       int target = 4;

       linearSearch(arr,target);

    }
}

