package practice;

import java.util.Scanner;

public class Exception {


    public static void main(String[] args) throws InterruptedException{
        int[] a = {3,7,5,1,9,6};

        System.out.println(a[3]);
        Thread.sleep(2000);
        try{
            System.out.println(a[7]);
        }catch(java.lang.Exception e){
            System.out.println("Exception caught!");
        }
        Thread.sleep(2000);
        System.out.println(a[2]);

        Scanner scan = new Scanner(System.in);
        System.out.print("What's your first name?");
        String fname= scan.next();
        System.out.print("What's your last name?");
       String lname= scan.next();
        System.out.println(fname+" "+lname);
    }

}
