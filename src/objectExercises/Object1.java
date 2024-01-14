package objectExercises;

public class Object1 {
    public static void main(String[] args) {
        Object1 obj = new Object1();
        obj.method1();
        System.out.println(obj.a);
        obj.method2();

        Object2 obj2 = new Object2();
        System.out.println(obj.a+ obj2.b);
        obj2.m2();

    }

    public int a = 5;
      void method1(){
         System.out.println("Hi, Im method 1 inside Object1 class");
     }

     public void method2(){
         System.out.println("Im method 2");
     }
}
