package basics;

public class BasicStuffs {

    public static void main(String[] args){
// if/else exercise 1
        boolean rain = true;
        if(rain){
            System.out.println("Raining! Carry umbrella.");
        }else{
            System.out.println("Sunny. No need to carry umbrella...");
        }

// if/else exercise 2
        int income = 25000;

        if(income<25000){
            System.out.println("Low income");
        } else if( income>25000 && income<=78000){
            System.out.println("Lower middle income");
        }else if(income>78000 && income<=187000){
            System.out.println("Upper middle income");
        } else if(income>187000){
            System.out.println("High income");
        }

        // if/else exercise 3
        //if age is less than 18 you will get 20% discount in price, age 18-65 = No discount, age more than 65 10% discount
        int age = 65;
        double price = 10.99;
        if(age<18){
            System.out.println("Congrats, you got a 20% discount. Discounted price for you is "+ (price*.80));
        } else if(age>=18 && age<=65){
            System.out.println("Price for you is "+price);
        }else if(age>65){
            System.out.println("Congrats, you got a 10% discount. Discounted price for you is "+ (price*.90));
        }

//        if/else exercise 4
        int num = -3;
        if(num>=0){
            System.out.println("positive number");
        }else if(num<0){
            System.out.println("negative number");
        }

//        if/else exercise 5
//        odd/even number
        int newNum = 3;
        if(newNum%2==0){
            System.out.println("even number");
        } else if(newNum%2!=0){
            System.out.println("odd");
        }
    }
}
