package rahulShetty;

import java.util.Set;

public class RahulRandoms {


//    Parameterized constructor
    public RahulRandoms(int a){
        System.out.println(a);
    }

//    default constructor
    public RahulRandoms(){
        System.out.println("Default");
    }

    public static void main(String[] args) {
        RahulRandoms randoms = new RahulRandoms(5);  // parameterized constructor will be called
        RahulRandoms random = new RahulRandoms();    //default constructor will be called

    }
}



