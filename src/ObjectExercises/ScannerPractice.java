package ObjectExercises;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your first name");
        String fName = scan.next();
        System.out.println("Type your last name");
        String lName = scan.next();
        System.out.println("Your full name is "+fName+" "+lName);
    }
}
