package com.prabin.dsa.others.Backtracking;


import java.util.ArrayList;
import java.util.List;

public class subset {

    public static  void sub (int arr[],int index,List<Integer>s,List<List<Integer>>result){
        if(index == arr.length){
           result.add(new ArrayList<>(s));
            return;
        }

        s.add(arr[index]);
        sub(arr,index+1,s,result);

        s.remove(s.size()-1);
        sub(arr,index+1,s,result);
    }


    public static void main(String[] args) {
        //input [1,2,3]
        // output [][1][2][3][1,2][1,3][2,3][1,2,3]
        int arr[]={1,2,3};
        List<List<Integer>>result = new ArrayList<>() ;

        sub(arr,0,new ArrayList<>(),result);
        for(int i=0;i<result.size();i++){
           System.out.println(result.get(i));
        }
       // System.out.println(result.size());

    }

}
