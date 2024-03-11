package interviewPractice;

import java.util.*;

public class RandomCodes {
    public static void main(String[] args) {

        //SWIPE VALUE BETWEEN TWO INTEGERS
        System.out.println("SWIPE VALUE BETWEEN TWO INTEGERS:");
        int a = 5;
        int b = 10;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a is "+a);
        System.out.println("b is "+b);
        System.out.println("===========================");

        // FIND OUT THE LARGEST, SECOND LARGEST, SMALLEST, SECOND SMALLEST VALUE FROM AN ARRAY
        System.out.println("FIND OUT THE LARGEST, SECOND LARGEST, SMALLEST, SECOND SMALLEST VALUE FROM AN ARRAY:");
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
        System.out.println("===========================");

//        FIBONACCI SERIES up to 50
        System.out.println("FIBONACCI SERIES up to 50:");
        int fNum = 0;
        System.out.println(fNum);
        int secNum = 1;
        System.out.println(secNum);

        for(int i=0; i<8; i++){
            int thirdNum = fNum+secNum;
            System.out.println(thirdNum);
            fNum = secNum;
            secNum = thirdNum;
        }
        System.out.println("===========================");

//        PRINT FIBONACCI NUMBER SERIES UPTO 500
        System.out.println("PRINT FIBONACCI NUMBER SERIES UPTO 500:");
        ArrayList<Integer> al = new ArrayList<>();
        int first = 0;
        int second = 1;
        al.add(first);
        al.add(second);
        for(int i=0;i<498;i++){
            int third = first+second;
            al.add(third);
            first = second;
            second = third;
        }
        System.out.println(al);
        System.out.println("===========================");

//        CHECK WHETHER A GIVEN NUMBER IS A PRIME NUMBER OR NOT
        System.out.println("CHECK WHETHER A GIVEN NUMBER IS A PRIME NUMBER OR NOT:");
        int num = 15;
        boolean prime=true;
        for(int i=2; i<num/2;i++){
            if(num%i==0){
                prime = false;
            }
        }
        System.out.println(prime);
        System.out.println("===========================");


//PRINT THE PRIME NUMBER SERIES FROM 1 TO 100
        System.out.println("PRINT THE PRIME NUMBER SERIES FROM 1 TO 100:");
        for(int i=1;i<=100;i++){
            boolean isPrime = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isPrime = false;
                }
            }
            if(i<2){
                isPrime=false;
            }
            if (isPrime){
                System.out.print( i +" ");
            }
        }
        System.out.println(""+"===========================");

//        PRINT FIRST 10 PRIME NUMBERS
        System.out.println("PRINT FIRST 10 PRIME NUMBERS:");
       int count = 1;
        for(int i=1;i<=100;i++){
            boolean isPrime = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isPrime = false;
                }
            }
            if(i<2){
                isPrime=false;
            }
            if(count<=10){
                if (isPrime){
                    System.out.print( i +" ");
                    count++;
                }
            }
        }
        System.out.println(" ");
        System.out.println("===========================");



    }
}
