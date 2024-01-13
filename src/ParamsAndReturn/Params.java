package ParamsAndReturn;

public class Params {
    public static void m1(String name, int age){
        System.out.println("My name is "+name+". "+"Im "+age+" years old.");
    }
    public void m2(String java){
        System.out.println("Im doing a bootcamp on "+java);
    }

    public static void main(String[] args) {
        m1("Mahmuda Helen Munny",29);

        Params params = new Params();
        params.m2("Selenium with java.");
    }
}
