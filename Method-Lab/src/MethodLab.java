import java.util.Arrays;

public class MethodLab {
    public static void main(String[] args) {

        int[] Arr = {20, 100, 10, 80, 70, 1, 0, -1, 2, 10, 15, 300, 7, 6, 2, 18, 19, 21, 9, 0};
//        print Array
        for( int i = 0 ; i< Arr.length ; i++){
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
//        call function
        removeDuplicates(Arr);
    }

    public static void removeDuplicates(int[] arr) {
        System.out.println("After sorting: ");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] result = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                result[index++] = arr[i];
            }
        }
        result[index++] = arr[arr.length-1];

//        print result
        System.out.println("Result: ");
        for(int i=0; i<index; i++){
            System.out.print(result[i] + " " );
        }
    }
}

