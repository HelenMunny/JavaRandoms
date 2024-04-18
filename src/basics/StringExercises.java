package basics;

public class StringExercises {
    public static void main(String[] args) {
        String str = "Java is a powerful programming language";
        String str2 = "Im a second string";


//        STRING METHODS
        System.out.println(str.length());
        System.out.println(str.contains("Java"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        System.out.println("===================");
        String[] words = str.split(" ");      //spilts on the basis of input. stores the spilted elements in an array
        System.out.println(words.length);
        System.out.println(words[1]);
        System.out.println("==================");

        System.out.println(str.trim());    //cuts whitespaces from both ends
        System.out.println(str.substring(3,20));
        System.out.println(str.replace("powerful","popular"));
        System.out.println(str.replaceAll(" ",""));    //replaces all the white spaces with no space

        char[] arr= str.toCharArray();
        System.out.println(arr[0]);

        System.out.println(str.charAt(25));
        System.out.println(str.startsWith("k"));
        System.out.println(str.endsWith("e"));
        System.out.println(str.equals(str2));
        System.out.println(str.concat(". "+str2));
    }

}
