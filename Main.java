package HW1;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        int numbers[]={20,100,10,80,70,1,0,-1,2,10,15,300,7,6,2,18,19,21,9,0};

        for(int i=0;i<numbers.length;i++){
            System.out.print(" "+numbers[i]+" ");
        }
        Arrays.sort(numbers);//sorting array to remove Duplicates
        int length=removeDuplicates (numbers);
        System.out.println("\n\n");
        for(int i=0;i<length;i++){
            System.out.print(" "+numbers[i]+" ");
        }
    }


    public static int removeDuplicates (int numbers []){
        int newArray[]=new int[numbers.length];
        int k=0;
        for(int i=0;i<numbers.length-1;i++){
                if (numbers[i] != numbers[i+1]){
                    newArray[k++]= numbers[i] ;
                }
            }
        newArray[k++]=numbers[numbers.length-1];
        for(int i=0;i<k;i++){
            numbers[i]=newArray[i];
        }


        return k;

    }


}


