package com.company;

import java.util.*;

public class Methods_Lab {

    public static void main(String[] args) {
        int array [] = {20,100,10,80,70,1,0,-1,2,10,15,300,7,6,2,18,19,21,9,0};
        removesAllDuplicates(array);

    }


public  static void removesAllDuplicates(int array[]){

    ArrayList<Integer> arr=new ArrayList<Integer>();
    System.out.println(Arrays.toString(array));
    for(int i = 0 ; i < array.length ; i++){
        if (!arr.contains(array[i])){
            arr.add(array[i]);
        }
    }

    System.out.println(arr.toString());


}
}
