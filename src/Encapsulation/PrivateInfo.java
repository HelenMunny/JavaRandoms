package Encapsulation;

public class PrivateInfo {
    private String SSN = "1256889";
    private String dob = "12.08.1994";
    private double bank = 129499596.45;

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getBank() {
        return bank;
    }

    public void setBank(double bank) {
        this.bank = bank;
    }




}
