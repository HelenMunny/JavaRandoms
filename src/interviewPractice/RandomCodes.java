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
        System.out.println("a is " + a);
        System.out.println("b is " + b);
        System.out.println("===========================");

        // FIND OUT THE LARGEST, SECOND LARGEST, SMALLEST, SECOND SMALLEST VALUE FROM AN ARRAY
        System.out.println("FIND OUT THE LARGEST, SECOND LARGEST, SMALLEST, SECOND SMALLEST VALUE FROM AN ARRAY:");
        // we will create a TreeSet (Treeset doesn't contain duplicates but is sorted from smallest to the largest).
        //Then we will run a for loop for adding the unique array elements to the TreeSet
        // Now we have got treeSet without duplicates and with sorted values
        //Now we will create a new Object array and convert the TreeSet to Array
        //We got an Array now, then we can run operations
        int[] arr = {23, 67, 12, 65, 77, 12, 23, 96, 83, 26, 69, 72};
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        Object[] newArr = set.toArray();

//        smallest number
        System.out.println(newArr[0]);

//        second smallest number
        System.out.println(newArr[1]);

        //        largest num
        System.out.println(newArr[newArr.length - 1]);

//       second largest num
        System.out.println(newArr[newArr.length - 2]);
        System.out.println("===========================");

//        FIBONACCI SERIES up to 50
        System.out.println("FIBONACCI SERIES up to 50:");
        int fNum = 0;
        System.out.println(fNum);
        int secNum = 1;
        System.out.println(secNum);

        for (int i = 0; i < 8; i++) {
            int thirdNum = fNum + secNum;
            System.out.println(thirdNum);
            fNum = secNum;
            secNum = thirdNum;
        }
        System.out.println("===========================");

//      PRINT FIBONACCI NUMBER SERIES UPTO 500
        System.out.println("PRINT FIBONACCI NUMBER SERIES UPTO 500:");
        ArrayList<Integer> al = new ArrayList<>();
        int first = 0;
        int second = 1;
        al.add(first);
        al.add(second);
        for (int i = 0; i < 498; i++) {
            int third = first + second;
            al.add(third);
            first = second;
            second = third;
        }
        System.out.println(al);
        System.out.println("===========================");

//        CHECK WHETHER A GIVEN NUMBER IS A PRIME NUMBER OR NOT
        System.out.println("CHECK WHETHER A GIVEN NUMBER IS A PRIME NUMBER OR NOT:");
        int num = 15;
        boolean prime = true;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                prime = false;
            }
        }
        System.out.println(prime);
        System.out.println("===========================");


//PRINT THE PRIME NUMBER SERIES FROM 1 TO 100
        System.out.println("PRINT THE PRIME NUMBER SERIES FROM 1 TO 100:");
        for (int i = 1; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (i < 2) {
                isPrime = false;
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        System.out.println("===========================");

//        PRINT FIRST 10 PRIME NUMBERS
        System.out.println("PRINT FIRST 10 PRIME NUMBERS:");
        int count = 1;
        for (int i = 1; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (i < 2) {
                isPrime = false;
            }
            if (count <= 10) {
                if (isPrime) {
                    System.out.print(i + " ");
                    count++;
                }
            }
        }
        System.out.println(" ");
        System.out.println("===========================");

//  STRING PALINDROME A. bob B. marry
        System.out.println("STRING PALINDROME A. bob B. marry");
        String bob = "bob";
        String marry = "marry";
        StringBuffer strBob = new StringBuffer(bob);
        String reverseBob = strBob.reverse().toString();
        boolean bobPalindrome = bob.equals(reverseBob);
        System.out.println(bobPalindrome);
        StringBuffer strMarry = new StringBuffer(marry);
        String reverseMarry = strMarry.reverse().toString();
        boolean marryPalindrome = marry.equals(reverseMarry);
        System.out.println(marryPalindrome);
        System.out.println("===============================");

//        INTEGER PALINDROME A. 1001 B. 1231
        System.out.println("INTEGER PALINDROME A. 1001 B. 1231");
        int number = 1001;
        String palindrome = String.valueOf(number);
        StringBuffer sbp = new StringBuffer(palindrome);
        String rv = sbp.reverse().toString();
        int newP = Integer.valueOf(rv);
        if (number == newP) {
            System.out.println(newP + " palindrome number");
        } else {
            System.out.println(number + " not a palindrome number");
        }
        System.out.println("=====================");


//        REVERSE A NUMBER
        System.out.println("REVERSE A NUMBER:");
        int n1 = 6589494;
        String n1Value = String.valueOf(n1);
        StringBuffer sb = new StringBuffer(n1Value);
        String newN1 = sb.reverse().toString();
        System.out.println(newN1);
        System.out.println("===========================");

//        REVERSE AN INTEGER WITHOUT USING METHODS
        int reversedint = reverse(13919191);
        System.out.println(reversedint + " Reveresed without method");

//        REVERSE A STRING
        System.out.println("REVERSE A STRING:");
        String str1 = "analogy";
        StringBuffer sbStr1 = new StringBuffer(str1);
        String reverseStr1 = sbStr1.reverse().toString();
        System.out.println(reverseStr1);
        System.out.println("===========================");

//        REVERSE A STRING WITHOUT USING ANY METHOD
        String sss = "Tommy";
        char ch;
        String reversed = "";
        for (int i = sss.length() - 1; i >= 0; i--) {
            ch = sss.charAt(i);
            reversed = reversed + ch;
        }
        System.out.println(reversed + "  String reversed without a method");


//        REMOVE DUPLICATES FROM AN ARRAY
        System.out.println("REMOVE DUPLICATES FROM AN ARRAY:");
        int[] arr1 = {19, 9, 2, 3, 9, 8, 2, 7};
        Set<Integer> s = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            s.add(arr1[i]);
        }
        Object[] removeDuplicates = s.toArray();
        System.out.println(removeDuplicates.length);    //length reduced from 8 to 6
        System.out.println("=============================");


//        STRING ANAGRAM MARY, ARMY
        System.out.println("STRING ANAGRAM MARY, ARMY:");
        boolean anagram = true;
        String strA1 = "Mary";
        String strA2 = "Army";
        strA1.toLowerCase();
        strA2.toLowerCase();
        if (strA1.length() != strA2.length()) {
            anagram = false;
        } else {
            char[] arrA1 = strA1.toCharArray();
            Arrays.sort(arrA1);
            char[] arrA2 = strA2.toCharArray();
            Arrays.sort(arrA2);
            if (arrA1.equals(arrA2)) {
                anagram = true;
            }
        }
        System.out.println(anagram);
        System.out.println("==================================");


//        FACTORIAL 7
        System.out.println("FACTORIAL 7");
        int n = 7;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact);
        System.out.println("================================");


//        COUNT NON DUPLICATES WORDS IN A STRING
        System.out.println("COUNT NON DUPLICATES WORDS IN A STRING");
        String words = " I am a student. I love to study. But I do not have any time to study as I am a full-time stay at home parent.";
        String[] arrS = words.split(" ");
        Set<String> setS = new TreeSet<>();
        for (int i = 0; i < arrS.length; i++) {
            setS.add(arrS[i]);
        }
        Object[] finalWords = setS.toArray();
        System.out.println(arrS.length);
        System.out.println(finalWords.length);   //length reduced from 27 to 21. so non-duplicates words for the String is 21
        System.out.println("======================================");


//        FIND THE LENGTH OF THE STRING WITHOUT THE LENGTH METHOD
        System.out.println("FIND THE LENGTH OF THE STRING WITHOUT THE LENGTH METHOD:");
        String str3 = "I am a newbie to learn java.";
        char[] charArr = str3.toCharArray();
        int count2 = 0;
        for (int i = 0; i < charArr.length; i++) {
            count2++;
        }
        System.out.println(count2);
        System.out.println(str3.length());   // length is 28
        System.out.println("====================================");


//        ARMSTRONG NUMBER
        System.out.println("ARMSTRONG NUMBER:");
        int an = 153;
        int temp1 = an;
        int sum = 0;

        while (an > 0) {
            sum = sum + (an % 10) * (an % 10) * (an % 10);
            an = an / 10;
        }
        if (sum == temp1) {
            System.out.println(temp1 + " is an armstrong number");
        } else {
            System.out.println(temp1 + " is not an armstrong number");
        }
        System.out.println("===========================");

//        COUNT THE EVEN AND ODD DIGITS IN A GIVEN NUMBER
//        SUM OF DIGITS OF A GIVEN NUMBER
//        FIND LARGEST OF 3 NUMBERS
//        GENERATE RANDOM NUMBERS AND STRINGS
//        EVEN AND ODD NUMBERS FROM AN ARRAY
//        FIND MISSING NUMBER IN AN ARRAY
//        FIND DUPLICATE ELEMENTS IN AN ARRAY
//        REMOVE SPECIAL CHARECTER FROM A STRING
//        FIND THE OCCURANCES OF A CHARECTER IN A STRING
//        READ AND WRITE DATA INTO TEXT FILE


    }

    public static int reverse(int num) {
        int reverse = 0;
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        return reverse;
    }
}

