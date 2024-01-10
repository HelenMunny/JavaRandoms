package ObjectExercises;

public class Object2 {
    public static void main(String[] args) {
        Object2 obj2 = new Object2();
        Object1 obj = new Object1();

        System.out.println(obj2.b-obj.a);
        obj2.m2();
    }

    int b = 10;
    void m2(){
        System.out.println("Im m2 in Object2 class");
    }
}
