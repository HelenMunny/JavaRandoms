package sep14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class practice {

    public static void main(String[] args){

//        ArrayList<String> names = new ArrayList<>();
//
//        names.add("Hina");
//        names.add("Mina");
//        names.add("Tina");
//        names.add("Bina");
//        names.remove(2);
//        names.add("Sina");
//        names.set(0,"Puma");
//        System.out.println(names.get(2));
//
//        for(String i:names){
//            System.out.println(i);
//        }

        String statement ="Hello! My name is Mahmuda Munny. Im 28 years old.";

        System.out.println(statement.toUpperCase());
        System.out.println(statement.toLowerCase());
        System.out.println(statement.contains("name"));
        System.out.println(statement.substring(0,5));
       String[] words= statement.split(" ");
        System.out.println(statement.replace("Hello","Hi"));

        Object.method1();

        Object object = new Object();
        System.out.println(object.num);
//        System.out.println(Object.method2()+2);
        System.out.println("Hello! My full name is "+Object.name("Mahmuda","Helen"));

        Scanner scan = new Scanner(System.in);
        System.out.print("What's your first name? ");
        String fname= scan.next();
        System.out.print("What's your last name? ");
        String lname= scan.next();
        System.out.println(fname+" "+lname);

//       STRING METHODS/OPERATIONS:
//       length(), contains(), toUpperCase(), toLowerCase(), split(), substring(starting index, ending index);
//       replace(old chars, new chars), String1.equals(String2), charAt(), indexOf(), startsWith(), endsWith(), compareTo(), concat(), toCharArray()



//      List all = Arrays.asList(statement);
//       System.out.println(all);
//        for(String y:words){
//            System.out.println(y);
//        }



    }
}
