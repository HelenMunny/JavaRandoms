package advanced;

import java.util.Scanner;

public class Practice3 {
 int nonStat = 5;
 static int stat = 6;

 void nonStat(String param1, String param2){
     System.out.println("Hello, I am a "+param1+" method. and I cannot visit a static method without "+param2);
 }
 static void stat (String param1, String param2){
     Practice3 practice3 = new Practice3();
     System.out.println("Hello, I am a "+param1+
             " method. and I can visit a static/non-static method without "
             +param2+" but for visiting another class, I enter through the class name."+stat+practice3.nonStat);


 }
}
