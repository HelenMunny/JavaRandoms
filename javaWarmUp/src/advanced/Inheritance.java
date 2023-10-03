package advanced;

public class Inheritance{


    private String ki = "123";
    private int phone = 12398;

    public String getKi() {
        return ki;
    }

    public void setKi(String ki) {
        this.ki = ki;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    void sum(int a, int b){
        System.out.println(a+b);
    }
    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

    void sum(String a, String b){
        System.out.println(a.concat(b));
    }

    public static void main(String[] args){
     Inheritance in = new Inheritance();
     in.sum(2,4);
     in.sum(2,4,4);
     in.sum("Helen","Munny");
    }

}
