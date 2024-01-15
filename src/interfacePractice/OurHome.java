package interfacePractice;

public class OurHome implements Home{

    public static void main(String[] args) {
        OurHome ourHome = new OurHome();
        ourHome.ac();
        ourHome.furnitures();
        ourHome.rooms();
    }
    @Override
    public void rooms() {
        System.out.println("We need rooms");
    }

    @Override
    public void ac() {
        System.out.println("air conditioning");
    }

    @Override
    public void electricity() {
        System.out.println("power and water supply");
    }

    @Override
    public void furnitures() {
        System.out.println("all the necessary furnitures");
    }

    @Override
    public void electronics() {
        System.out.println("electronics and devices");
    }

    @Override
    public void appliances() {
        System.out.println("home appliances like dishwasher, oven, washer, dryer, refrigerator etc.");
    }

    @Override
    public void wc() {
        System.out.println("toilets and washrooms");
    }
}
