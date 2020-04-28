package se.lexicon;

public class OrderOfExecution {
    public static int number = 1; //1

    static {  //2
        System.out.println(number);
    }

    public String name;//6

    public static void main(String[] args) { //5
        OrderOfExecution obj = new OrderOfExecution();
        System.out.println(obj);
        System.out.println(foo);
        System.out.println(obj.name);

    }

    public OrderOfExecution(){ //7
        name = "Erik";
    }

    { //6
        System.out.println(name);
    }



    static{ //3
        System.out.println("Inside the static block");
        foo = "I am useless information";
    }
    static String foo; //4
}
