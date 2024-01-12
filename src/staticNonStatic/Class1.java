package staticNonStatic;

public class Class1 {
    public static void main(String[] args) {
    }


    public static void m1Class1(){
        System.out.println("Im a static method under Class1.");
    }
    public void m2Class1(){
        System.out.println("Im a non static method under Class1");

//        non-static to non-static within same class. direct access
        System.out.println(bClass1);

//        static to non-static, visiting other class. no object creation. entry through classname
        Class2.m1Class2();
    }

    public static int aClass1= 50;
    public int bClass1 = 20;
}
