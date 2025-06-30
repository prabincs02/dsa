package com.prabin.dsa.sorting;

public class SelectionSort {




    public static void printnum(int arr[]){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void swap(int arr[],int i){

        int min=arr[i];
        int index=i;

        for(int j=i;j<arr.length;j++){
            if(min>arr[j]){
                min=arr[j];
                index=j;
            }
        }
           if(arr[i]>min){
               int temp = arr[index];
               arr[index]=arr[i];
               arr[i]=temp;
           }

           printnum(arr);



    }
    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length;i++){
           swap(arr,i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        //[11, 12, 22, 25, 64]

        printnum(arr);
        System.out.println();
        selectionsort(arr);
        printnum(arr);
    }
}
