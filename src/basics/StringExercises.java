package basics;

public class StringExercises {
    public static void main(String[] args) {
        String str = "Java is a powerful programming language";
        String[] words = str.split(" ");
        System.out.println(words.length);
        String str3 = str.replace(" ","");
        System.out.println(str3);
        

//        char[] arr= str.toCharArray();
//        System.out.println(arr.length);
//
//        String str2 = str.replaceAll(" ","");
//        System.out.println(str2.length());

    }

}
