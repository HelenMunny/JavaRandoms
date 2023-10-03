package advanced;

import java.util.HashMap;

public class Inherit {
    public static void main(String[] args) {
        HashMap<String, String> students = new HashMap<>();
        students.put("Mina","01");
        students.put("Tina","02");
        students.put("Hina","03");
        students.put("Sina","04");
        System.out.println(students);

        for(String x:students.keySet()){
//            System.out.println(x+": "+students.get(x));
            System.out.println(x);
            System.out.println(students.get(x));
        }
    }


}
