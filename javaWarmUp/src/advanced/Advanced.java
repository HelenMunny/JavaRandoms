package advanced;

public class Advanced {
public static void main(String[] args){
Advanced advanced = new Advanced();
advanced.method();

}

 void method(){
    Practice3.stat("static","object creation");
    System.out.println(Practice3.stat);

    Practice3 practice3 = new Practice3();
    practice3.nonStat("non static","object creation");
    System.out.println(practice3.nonStat);
}

}


