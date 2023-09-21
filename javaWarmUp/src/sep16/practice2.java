package sep16;

public class practice2 {
    public static void main(String[] args){

//        LOOPS EXERCISES..........................................
//        QUESTION-1: PRINT SQUARES OF 5 TO 15
        for(int i=5; i<=15; i++){
            System.out.println(i*i);
        }
        System.out.println("======================================");


//        QUESTION-2: CALCULATE THE SUM OF ALL NUMBERA FROM -5 TO 18
        int sum=0;
        for(int i=-5; i<=18; i++){
            sum+=i;
        }
        System.out.println(sum);

        System.out.println("======================================");

//        QUESTION-3: WRITE A PROGRAM TO PRINT A MULTIPLICATION OF 7
        int multiple = 7;

        for(int i=1;i<=10;i++){
            System.out.println(multiple+ "*" + i + "=" + multiple*i);
        }
        System.out.println("======================================");

//        QUESTION-4: COUNT THE TOTAL NUMBER OF DIGITS IN 67687
        int number = 67687;
        int length = String.valueOf(number).length();
        System.out.println (length);
        System.out.println("======================================");

//        QUESTION-5: PRINT NUMBERS FROM -10 TO -1 USING FOR LOOP
        for(int i=-10; i<=-1; i++){
            System.out.println(i);
        }
        System.out.println("======================================");
//        QUESTION-6: PRINT ALL ODD NUMBERS BETWEEN 1 TO 33
        for(int i=1; i<=33; i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
        System.out.println("======================================");


//        QUESTION-7: PRINT FIBONACCI SERIES UP TO 10 TERMS

//        QUESTION-8: CALCULATE THE SUM OF ALL NUMBERS FROM -5 TO 18
        int total = 0;
        for(int i=-5;i<=18;i++){
         total += i;
        }
        System.out.println(total);
        System.out.println("======================================");


//ARRAY EXERCISES.............................................................
        int[] arr = {342, 432, 765, -231, 234, 264, 322};

//        QUESTION-9: PRINT ALL NUMBERS from the array
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("======================================");

//        QUESTION-10: FIND THE LOWEST NUMBER FROM the array

        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("The lowest number in the array is " + min);
        System.out.println("======================================");

//        QUESTION-11: FIND THE BIGGEST NUMBER FROM the array
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The biggest number in the array is " + max);
        System.out.println("======================================");

//        QUESTION-12: FIND THE LOWEST NUMBER FROM 342,-231,432, 997, 765, -715, 234, 265, 322
//       --------------------------- DONE, SAME AS QUESTION-10 -------------------

//        QUESTION-13: ADD ALL THE NUMBERS AND PRINT THE SUM OF 342,-231,432, 997, 765, -715, 234, 265, 322
        int arrSum = 0;
        for(int i=0; i<arr.length; i++){
            arrSum += arr[i];
        }
        System.out.println(arrSum);
        System.out.println("======================================");



    }
}






