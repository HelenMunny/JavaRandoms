package advanced;

import java.util.ArrayList;

public class Sep26{
    int a = 5;
    void sum(){
        int k = 6;
        int l = 7;
        System.out.println(k+l);

        ArrayList<String> names = new ArrayList<>();
        names.add("Mina");
        names.add("Tina");
        names.remove("Tina");
        names.add("Bina");
        System.out.println(names.get(1));
        System.out.println(names.size()+2);
    }






    public static void main(String[] args) {
       Sep26 sep26 = new Sep26();
       sep26.sum();
       Practice3.stat("static","object creation");

    }
}
