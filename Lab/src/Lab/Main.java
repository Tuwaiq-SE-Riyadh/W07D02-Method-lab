package Lab;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Follow these steps:
//        Create a method that takes an integer array argument and removes all duplicates from the array.
//        Test your method by calling it from the class main method with an array argument comprising
//             the following elements: 20,100,10,80,70,1,0,-1,2,10,15,300,7,6,2,18,19,21,9,0.
//        Print the array before and after calling the method.
//                Compile, save and run your file.
        int[] arr = {20,100,10,80,70,1,0,-1,2,10,15,300,7,6,2,18,19,21,9,0};
        cleanArray(arr);
    }
    public static int cleanArray(int[] arr){
        // 1, 2, 3, 4, 2 >>
        int num=0;
        int[] newArray = new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    arr[i]= -99999;
                }
            }

        }
        for (int i = 0; i < newArray.length; i++) {
            if(arr[i]!=-99999){
                int temp = arr[i];
                newArray[num]= temp;
                System.out.println("element is new Array "+newArray[num]);
                num++;

            }
        }

        return num;
    }
    public static void addToArray(int[] arr){

    }
    }
