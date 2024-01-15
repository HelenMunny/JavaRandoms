package polymorphism;

public class Overloading1 {
    public static void main(String[] args) {
        Overloading1 overloading = new Overloading1();
        overloading.sub(50,70);
        overloading.sub("Mahmuda","Helen");
        overloading.sub(40,60,10);
//        here all the methods are sharing the same name sub, because the parameters are different in numbers, combinations, types and sequences.
    }
    public void sub(int a, int b){
        System.out.println(a+b);
    }
    public void sub(int c, int d, int e){
        System.out.println(c+d+e);
    }

    public void sub(String f, String g){
        System.out.println(f+" "+g);
    }

}
