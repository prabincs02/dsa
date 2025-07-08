package com.prabin.dsa.sorting;

import java.util.*;
public class MergeSort{
    static int n;

    public static void merged(int[] arr,int low,int high){
        if(low>=high) return;
        int mid = (low+high)/2;

        merged(arr,low,mid);
        merged(arr,mid+1,high);
        merge(arr,low,high,mid);

        for(int i = 0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();


    }

    public static void merge(int[] arr,int low,int high,int mid){
        int left = low;
        int right = mid+1;
        List<Integer> l = new ArrayList<>();

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                l.add(arr[left]);
                left++;
            }
            else{
                l.add(arr[right]);
                right++;
            }
        }

        while(left<=mid){
            l.add(arr[left]);
            left++;
        }
        while(right<=high){
            l.add(arr[right]);
            right++;
        }

        for(int i = low ;i<=high;i++){
            arr[i] = l.get(i-low);
        }


    }


    public static void main(String fhd[]){
        Scanner sc = new Scanner(System.in);
        n = 6;
        int[] arr = {45,78,12,49,11,6};

       // for(int i = 0;i<n;i++) arr[i] = sc.nextInt();
        merged(arr,0,n-1);
    }
}



//
//public class MergeSort {
//  public static int len;
//    public static void mergeSort(int arr[]){
//        int length =arr.length;
//
//        if(length <=1){
//            return ;
//        }
//
//        int mid = length/2;
//
//        int[] leftarr = new int[mid];
//        int[] rightarr = new int[length - mid];
//        int j=0;
//        for(int i=0;i<length;i++){
//            if(i<mid){
//                leftarr[i]=arr[i];
//            }
//            else{
//                rightarr[j]=arr[i];
//                j++;
//            }
//        }
//
//        mergeSort(leftarr);
//        mergeSort(rightarr);
//        merge(leftarr,rightarr,arr);
//
//        printt(arr);
//        System.out.println();
//
//    }
//    public static void merge(int leftarr[],int rightarr[],int arr[]){
//        int l=0,r=0;
//        int i=0;
//        int leftsize= arr.length/2;
//        int rightsize = arr.length-leftsize;
//
//        while(l<leftsize && r<rightsize){
//            if(leftarr[l]<rightarr[r]){
//                arr[i++]=leftarr[l++];
//
//            }
//            else{
//                arr[i++]=rightarr[r++];
//            }
//        }
//
//        while(l<leftsize){
//            arr[i++]=leftarr[l++];
//        }
//        while(r<rightsize){
//
//            arr[i++]=rightarr[r++];
//        }
//    }
//
//    public static void printt(int arr[]){
//        for(int i = 0; i < len; i++){
//            System.out.print(arr[i]+ " ");
//        }
//    }
//    public static void main(String[] args) {
//        int[] array = {45,78,12,49,11,6};
//     len=array.length;
//        mergeSort(array);
//
//
//    }
//}
