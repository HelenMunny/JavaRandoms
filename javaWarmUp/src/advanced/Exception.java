package advanced;


public class Exception {

    public static void main(String[] args) throws InterruptedException {
//        int[] myNumbers = {1, 2, 3};
//        System.out.println(myNumbers[0]);
//        try{
//            System.out.println(myNumbers[10]);
//        }catch(java.lang.Exception e){
//            System.out.println("Exception caught!");
//        }
//        System.out.println(myNumbers[1]);
        int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[0]);
        try{
            System.out.println(myNumbers[0]);
            System.out.println(myNumbers[10]);
            System.out.println(myNumbers[1]);
        }
        catch(java.lang.Exception e){
            System.out.println("Exception");
        }
//        Thread.sleep(2000);



    }
}
