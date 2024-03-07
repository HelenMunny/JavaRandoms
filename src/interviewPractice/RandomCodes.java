package interviewPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RandomCodes {
    public static void main(String[] args) {
        //SWIPE VALUE BETWEEN TWO INTEGERS
        int a = 5;
        int b = 10;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a is "+a);
        System.out.println("b is "+b);

        // FIND OUT THE LARGEST, SECOND LARGEST, SMALLEST, SECOND SMALLEST VALUE FROM AN ARRAY

        // we will create a TreeSet (Treeset doesn't contain duplicates but is sorted from smallest to the largest).
        //Then we will run a for loop for adding the unique array elements to the TreeSet
        // Now we have got treeSet without duplicates and with sorted values
        //Now we will create a new Object array and convert the TreeSet to Array
        //We got an Array now, then we can run operations
        int[] arr = {23,67,12,65,77,12,23,96,83,26,69,72};
        Set<Integer> set = new TreeSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        Object[] newArr = set.toArray();

//        smallest number
        System.out.println(newArr[0]);

//        second smallest number
        System.out.println(newArr[1]);

        //        largest num
        System.out.println(newArr[newArr.length-2]);

//       second largest num
        System.out.println(newArr[newArr.length-2]);


//        FIBONACCI SERIES up to 50
        int fNum = 0;
        System.out.println(fNum);
        int secNum = 1;
        System.out.println(secNum);

        for(int i=0; i<48; i++){
            int thirdNum = fNum+secNum;
            System.out.println(thirdNum);
            fNum = secNum;
            secNum = thirdNum;
        }

//        PRINT PRIME NUMBER SERIES UPTO 500



    }
}
