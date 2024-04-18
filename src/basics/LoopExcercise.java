package basics;

public class LoopExcercise {
    public static void main(String[] args) {

        //        LOOPS EXERCISES..........................................
//        QUESTION-1: PRINT SQUARES OF 5 TO 15
//        for(int i=5; i<=15; i++){
//            System.out.println(i*i);
//        }
        int j=5;
        while(j<=15){
            System.out.println(j*j);
            j++;
        }
        System.out.println("======================================");

//        QUESTION-2: CALCULATE THE SUM OF ALL NUMBERs FROM -5 TO 18
        int sum = 0;
        for(int i=-5;i<=18;i++){
            sum += i;
        }
        System.out.println(sum);
        System.out.println("======================================");

//        QUESTION-3: WRITE A PROGRAM TO PRINT A MULTIPLICATION OF 7
        int multiple = 7;
        for(int i=1;i<=10;i++){
            System.out.println(multiple+" * "+i+" = "+(multiple*i));
        }
        System.out.println("======================================");

//        QUESTION-4: COUNT THE TOTAL NUMBER OF DIGITS IN 67687
        int number = 67687;
        int length = String.valueOf(number).length();   //converting a number to String, method is String.valueOf(number)
        System.out.println(length);
        System.out.println("======================================");

//        QUESTION-5: PRINT NUMBERS FROM -10 TO -1 USING FOR LOOP
        for(int i=-10; i<=-1;i++){
            System.out.println(i);
        }
        System.out.println("======================================");

//        QUESTION-6: PRINT ALL ODD NUMBERS BETWEEN 1 TO 33
        for(int i=1;i<=33;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
        System.out.println("======================================");

//        QUESTION-7: PRINT FIBONACCI SERIES UP TO 10 TERMS
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);

        for(int i=1; i<=8;i++){
            int c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }
        System.out.println("==========================================");

//        QUESTION-8: CALCULATE THE SUM OF ALL NUMBERS FROM -5 TO 18
        int total = 0;
        for(int i=-5; i<=18; i++){
            total += i;
        }
        System.out.println(total);
        System.out.println("======================================");

    }
}
