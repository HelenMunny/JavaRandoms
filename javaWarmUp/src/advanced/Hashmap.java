package advanced;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,String> students = new HashMap<>();
        students.put("Mina","ID-01");
        students.put("Tina","ID-02");
        students.put("Hina","ID-03");
        students.put("Sina","ID-04");

        for(String name:students.keySet()){
            System.out.println(name);
        }
        for(String id:students.keySet()){
            System.out.println(students.get(id));
        }
    }
}
