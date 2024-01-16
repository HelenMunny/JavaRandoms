package exceptionHandling;

public class TryAndCatch {
    public static void main(String[] args) {
        int[] arr = {5,7,9,12,2};
        System.out.println(arr[0]);
        System.out.println(arr[3]);

        try{
            System.out.println(arr[6]);   //error producing line
        }catch(Exception e){
            System.out.println("Exception detected!");
        }

        System.out.println(arr[2]);
        System.out.println(arr[1]);
    }

}
