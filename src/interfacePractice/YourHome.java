package interfacePractice;

public class YourHome implements Home{

    public static void main(String[] args) {
        YourHome yourHome = new YourHome();
        yourHome.rooms();
        yourHome.appliances();
    }
    @Override
    public void rooms() {
        System.out.println("rooms for your home");
    }

    @Override
    public void ac() {
        System.out.println("ac for your home");
    }

    @Override
    public void electricity() {
        System.out.println("power and water for your home");
    }

    @Override
    public void furnitures() {
        System.out.println("furnitures for your home");
    }

    @Override
    public void electronics() {
        System.out.println("electronics for your home");
    }

    @Override
    public void appliances() {
        System.out.println("appliances for your home");
    }

    @Override
    public void wc() {
        System.out.println("washrooms for your home");
    }
}
