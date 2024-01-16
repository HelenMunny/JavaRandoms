package Encapsulation;

public class OtherClass {
    public static void main(String[] args) {
       PrivateInfo pvt = new PrivateInfo();

        pvt.setSSN("1899939393");
        pvt.setDob("10.08.1994");
        pvt.setBank(199383.56);

        System.out.println(pvt.getSSN()+" "+pvt.getBank()+" "+pvt.getDob());
    }
}
