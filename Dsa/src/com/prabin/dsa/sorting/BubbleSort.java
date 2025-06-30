package com.prabin.dsa.sorting;

import static java.util.Collections.swap;

public class BubbleSort {

    public static void numswap(int num1, int num2,int arr[]){
           int temp = arr[num1];
            arr[num1] = arr[num2];
            arr[num2] = temp;

    }

    public static void bubblesort(int arr[]){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    numswap(j,j+1,arr);
                }
            }
        }

    }

    public static void printnum(int arr[]){
           for(int i : arr){
               System.out.print(i+" ");
           }
    }


    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
                  //[11, 12, 22, 25, 64]

        printnum(arr);
        System.out.println();
        bubblesort(arr);
        printnum(arr);
    }
}
