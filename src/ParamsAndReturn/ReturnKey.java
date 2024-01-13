package ParamsAndReturn;

public class ReturnKey {
    public String returnType(String code){
        System.out.println(25+5);
        return ("I love to "+code);      //must return String, but we can put other data types inside the method too, ex. 25+5
    }

    public static int sum(int i, int j){
        return i+j;
    }

    public static void main(String[] args) {

        System.out.println(sum(60,40));
        ReturnKey returnK = new ReturnKey();
        System.out.println(returnK.returnType("code"));
    }
}
