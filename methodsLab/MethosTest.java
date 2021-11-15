package methodsLab;

import java.util.Arrays;

public class MethosTest {

	public static void main(String[] args) {
		int[] array = {10,15,20,10,20,15,25,53,21,43,55,53};
		System.out.println("--Befor--");
		System.out.println(Arrays.toString(array));
		removeDuplicates(array);
	}
	
	public static void removeDuplicates(int[] array){
		Arrays.sort(array);  
		int[] newArray = new int[array.length];
        int j = 0;  
        for (int i=0; i<array.length-1; i++){  
            if (array[i] != array[i+1]){  
            	newArray[j++] = array[i];  
            }  
         }  
        newArray[j++] = array[array.length-1];
        System.out.println("\n--After--");
        for (int i=0; i<j; i++){  
        	if(i == 0){
        		System.out.print("[" + newArray[i] + ", ");
        	}
        	else if((i+1) == j){
        		System.out.print(newArray[i]);
        	}
        	else {
        		System.out.print(newArray[i] + ", ");
        	}
        }
        System.out.print("]");
	}
}
