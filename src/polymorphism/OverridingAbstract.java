package polymorphism;

public class OverridingAbstract extends Abs {

    public static void main(String[] args) {
        OverridingAbstract override = new OverridingAbstract();
        override.m2();
        override.m1();
        override.abs();
        override.abs2();
    }


    void m1(){
        System.out.println("Hi-- Im a regular method.");
    }

    @Override
    public void abs() {
        System.out.println("Im abstract method 1");
    }

    @Override
    public void abs2() {
        System.out.println("Im abstract method 2");
    }
}
