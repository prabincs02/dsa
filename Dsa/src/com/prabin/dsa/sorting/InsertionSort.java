package com.prabin.dsa.sorting;



public class InsertionSort {



    public static void printnum(int arr[]){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void swap(int arr[],int i){

        for(int j=i;j>0;j--){
            if(arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
            }
        }


    }
    public static void insertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){

           // System.out.println();
            swap(arr,i);
            printnum(arr);
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        //[11, 12, 22, 25, 64]

        printnum(arr);
        System.out.println();
        insertionsort(arr);

    }
}

