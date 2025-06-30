package com.prabin.dsa.searching;

import java.util.Arrays;

public class BinarySearch {

    public static void binarySeacrh(int arr[],int target){
        int left=0,right=arr.length-1;



        while(left<right){

            int mid=left+(right-left)/2;

            if(arr[mid]==target){
                System.out.println("Found "+mid);
                return;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        System.out.println("Not Found");


    }



    public static void main(String[] args) {


        int [] arr = {10, 25, 30, 45, 50};
        int target = 30;
        Arrays.sort(arr);

       binarySeacrh(arr,target);

    }
}
