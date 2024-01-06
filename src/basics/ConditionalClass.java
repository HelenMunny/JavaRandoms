package basics;

public class ConditionalClass {
    public static void main(String[] args) {
//        1. In a company everyone gets a $10000 salary. The company decided to give a bonus of 5% to employees if his/her year of service is more than 5 years, 10% for more than 10 years, 30% for more than 15 years.
        int salary = 10000;
        int yearOfService = 33;
        if(yearOfService<=5){
            System.out.println("Your salary is "+ salary);
        }else if(yearOfService>5 && yearOfService<=10){
            System.out.println("Your salary is "+(salary+ (salary*.05)));
        }else if(yearOfService>10 && yearOfService<=15){
            System.out.println("Your salary is "+(salary+ (salary*.10)));
        }else if(yearOfService>15){
            System.out.println("Your salary is "+(salary+ (salary*.30)));
        }
        System.out.println("======================================");

//        2. If your age is between 13 to 19 the message will be “You are a teen”
//else the message will be “You are not a teen”
        int age = 20;
        if(age>=13 && age<=19){
            System.out.println("You are a teen");
        }else{
            System.out.println("You are not a teen");
        }
        System.out.println("======================================");

//        3. Determine whether a number is an even number or an odd number.
        int num = 3;
        if(num%2==0){
            System.out.println("Even number");
        } else{
            System.out.println("Odd number");
        }
        System.out.println("======================================");

//        4. Write a program that will convert weight in pounds into kilograms.
        double weightLbs = 115;
        System.out.println("Your weight in kilogram is "+ (weightLbs*0.453592));   // because 1 lb = 0.453592 kg;
        System.out.println("======================================");

//        5. Write a program to determine the cost of an automobile insurance premium, based on the number of accidents occurred by drivers.
//        The basic insurance charge is $500.
//        Number of accidents Accident Surcharge
//        1   50
//        2  120
//        3  220
//        4  370
//        5  570
//        6 or more No insurance
        int base = 500;
        int accident = 5;
        if(accident==1){
            System.out.println("Cost of insurance premium is "+(base+50));
        }else if(accident==2){
            System.out.println("Cost of insurance premium is "+(base+120));
        } else if(accident==3){
            System.out.println("Cost of insurance premium is "+(base+220));
        }else if(accident==4){
            System.out.println("Cost of insurance premium is "+(base+370));
        }else if(accident==5){
            System.out.println("Cost of insurance premium is "+(base+570));
        }else if(accident>=6){
            System.out.println("No insurance");
        }
    }
}
