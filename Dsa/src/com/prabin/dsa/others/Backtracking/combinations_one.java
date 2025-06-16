package com.prabin.dsa.others.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class combinations_one {

    public static void com(int arr[],int target,int index,int count,List<Integer>sum,List<List<Integer>>result){
        if(target == count ){
            result.add(new ArrayList<>(sum));
            return;
        }
        if(index >= arr.length  || target <= count){
            return;
        }

        sum.add(arr[index]);
        com(arr,target,      index,  count+arr[index],sum,result);
        sum.remove(sum.size()-1);
        com(arr,target,index+1,count,sum,result);

    }

    public static void main(String[] args) {
        //input 2 3 6 7
        // output [2,2,2,3],[7]

        int arr[]={2,3,5};
        int target=8;

        List<List<Integer>> result = new ArrayList<>();
        com(arr,target,0,0,new ArrayList<>(),result);

        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }

    }
}
