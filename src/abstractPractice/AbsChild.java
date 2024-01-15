package abstractPractice;

public class AbsChild extends Abs{
    public static void main(String[] args) {
        AbsChild absChild = new AbsChild();
        absChild.abs();

        Abs.m1();   //static regular method entry through classname
    }
    @Override
    public void abs() {
        System.out.println("Im an abstract method coming from Abs class. Now being overriden in the subclass (AbsChild)");
    }
}
