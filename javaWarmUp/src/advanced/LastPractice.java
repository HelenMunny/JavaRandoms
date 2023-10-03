package advanced;

public class LastPractice extends LastClass{
    public static void main(String[] args) {
      LastClass last= new LastClass();

      last.setSsn("1274");
      last.setBal(13425.7);
      last.setBirthDate("12.08.1994");

      System.out.println(last.getSsn()+" "+last.getBirthDate()+" "+last.getBal());
    }

}
