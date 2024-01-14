package polymorphism;

public class OverridingInterface implements Interface{
    @Override
    public void house() {
        System.out.println("Own house");
    }

    @Override
    public void car() {
        System.out.println("Own car");
    }

    @Override
    public void job() {
        System.out.println("dream job with dream salary");
    }

    @Override
    public void family() {
        System.out.println("My family by my side");
    }

    @Override
    public void gc() {
        System.out.println("permanent residence card");
    }
}
