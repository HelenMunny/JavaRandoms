package InheritanceExercise;

public class ChildSub extends ParentSuper{

    public static void main(String[] args) {
        ChildSub child = new ChildSub();
        child.pm1("Mahmuda Helen","Munny");
        System.out.println(child.p1-child.age);
        child.cm1("NC","USA");
        child.SuperThis();
        System.out.println(child.superP1-child.thisP1);
    }
    public int p1 = 50;
    public void cm1(String state, String country){
        System.out.println("I live in "+state+", "+country);
    }

//    In child class and parent class both has a property of same name,
//    in that case it becomes a little confusing to separate which property is coming from which class.
//    In that case we can use this and super keyword.
//    But we cannot use super and this keyword inside the main method.
//    we can use this and super keyword outside of the main method, inside another method,
//    and then call the method from main class
    public void SuperThis(){
        System.out.println("Im p1 of parent class "+ super.p1);
        System.out.println("Im p1 of child/this/current class "+ this.p1);
    }
//    OR  we can store same named properties under different named variable or method,
//    then call those from main method.
//    By doing that both get different names. same name collision problem get resolved
    int superP1 = super.p1;      //p1 from parent class, stored under new variable
    int thisP1 = this.p1;        //p1 from child class, stored under new variable
}
