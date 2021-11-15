package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] arr0 = {20,100,10,80,70,1,0,-1,2,10,15,300,7,6,2,18,19,21,9,0};
        System.out.println("Array before removing the duplicates numbers: "+Arrays.toString(arr0));
        duplicatesNumbers(arr0);


    }
    public static ArrayList<Integer> duplicatesNumbers (int [] arr){

        ArrayList<Integer> arrli= new ArrayList<Integer>(arr.length);

        for (int i =0;i< arr.length;i++){

            arrli.add(arr[i]);

        }

        for (int i =0;i< arrli.size();i++){
            for (int j =i+1;j< arrli.size();j++){
                if(arrli.get(i)==arrli.get(j)){
                    arrli.remove(j);


                }
            }
        }

        System.out.println("Array after we remove the duplicates numbers: "+arrli);


        return arrli;
    }
}
