package practice;

public class Polymorphism {
    public static void main(String[] args) {

        Polymorphism ref = new Polymorphism();
        ref.sum(2,3);
        ref.sum(5,5,4);
        ref.sum("Helen","Munny");


    }


    void sum(int a, int b){
        System.out.println(a+b);
    }

    void sum(int a, int b,int c){
        System.out.println(a+b+c);
    }

    void sum(String a, String b){
        System.out.println(a.concat(b));
    }
}
