package basics;

import java.util.Arrays;

public class ArrayExcercises {
    public static void main(String[] args) {
//ARRAY EXERCISES.............................................................
        int[] arr = {35,67,25,12,93,74,55,25};

//        QUESTION-9: PRINT ALL NUMBERS from the array
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("======================================");


//        QUESTION-10: FIND THE LOWEST NUMBER FROM the array
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
        System.out.println("======================================");


//        QUESTION-11: FIND THE BIGGEST NUMBER FROM the array
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
        System.out.println("======================================");


//        QUESTION-12: FIND THE LOWEST NUMBER FROM 342,-231,432, 997, 765, -715, 234, 265, 322
        int[] newArr = {342,-231,432,997,765,-715,234,265,322};
        int lowest = newArr[0];
        for(int i=0; i<newArr.length; i++){
            if(newArr[i]<lowest){
                lowest = newArr[i];
            }
        }
        System.out.println(lowest);
        System.out.println("======================================");


//        QUESTION-13: ADD ALL THE NUMBERS AND PRINT THE SUM OF 342,-231,432, 997, 765, -715, 234, 265, 322
        int sum = 0;
        for(int i=0; i<newArr.length; i++){
            sum += newArr[i];
        }
        System.out.println(sum);
        System.out.println("======================================");


//        different methods of declaring array

      int[] array = {9,3,6,1,8,3};
      Arrays.sort(array);
        System.out.println(array.length);

        int[] A = new int[5];
        A[0] = 5;
        A[1] = 9;
        A[2] = 3;
        A[3] = 17;
        A[4] = 2;
        System.out.println(A.length);
        System.out.println("===================================");

//  advanced/enhanced/forEach loop for printing each element of the array
        for(int s:A){
            System.out.println(s);
        }

        System.out.println("===================================");
    }
}
