package exceptionHandling;

public class InterruptedExp {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Im first");
        Thread.sleep(2000);
        System.out.println("Im second");
        Thread.sleep(2000);
        System.out.println("Im third");
    }
}
