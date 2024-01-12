package staticNonStatic;

public class Class2 {
    public static void main(String[] args) {
//        static to static within same class. no object creation needed. direct acces without classname
     m1Class2();
     System.out.println(aClass2);

     //        static to static, while visiting other class. no object creation. entry through classname
        System.out.println(Class1.aClass1+aClass2);    //here, aClass1 is visiting Class2 through Class1 name: Class1.aClass1


//     non static to static, within same class. always object creation
     Class2 class2 = new Class2();
        System.out.println(aClass2-class2.bClass2);


//     non static to static, visiting other class. always object creation needed
        Class1 class1 = new Class1();
        System.out.println(class1.bClass1);
        class1.m2Class1();




        class2.m2Class2();

    }

    public static void m1Class2(){
        System.out.println("Im a static method inside Class2");
    }
    public void m2Class2(){
        System.out.println("Im a non static method inside Class2");

//        non-static to non-static, visiting other class. object creation needed
        Class1 class1 = new Class1();
        class1.m2Class1();


//        static to non static, within same class. no object creation. direct access.
//        here m1Class2() is a static method visiting non-static method m2Class2(); direct access is applicable
        m1Class2();

    }
    public static int aClass2 = 100;
    public int bClass2 = 40;


}
