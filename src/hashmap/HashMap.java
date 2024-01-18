package hashmap;

public class HashMap {
    public static void main(String[] args) {
        java.util.HashMap<String, Integer> student = new java.util.HashMap<>();
        student.put("Mina", 12);
        student.put("George", 5);
        student.put("Smith",2);
        student.put("Marita",11);

//        METHODS
        System.out.println(student.get("Smith"));
        student.put("John",8);
        student.remove("Mina");
        System.out.println(student.size());
        System.out.println(student.containsKey("Marita"));
        System.out.println(student.containsValue(5));
//        student.clear();
        System.out.println(student.keySet());
        System.out.println(student.values());

        System.out.println(student);

//        ADVANCED FOR LOOP FOR PRINTING KEYS OR VALUES
        for(String n:student.keySet()){
            System.out.println(n);     //prints only keyset
            System.out.println("Student Name: "+n+", ID: "+student.get(n));    //prints keysets and values
        }

        for(int v:student.values()){
            System.out.println(v);     //prints only values
        }
    }
}
