package se.lexicon;

/**
 * Hello world!
 *
 */
public class App {

    public static int staticNumber = 1;
    public int instanceNumber = 1;

    public static void main( String[] args ){
        System.out.println("The number is " + staticNumber);
        App objectOfTypeApp = new App();
        System.out.println("Instance number is " + objectOfTypeApp.instanceNumber);
        objectOfTypeApp.printInstance("Hello instance");
    }

    public static void printStatic(String string){
        System.out.println(string);
    }

    public void printInstance(String string){
        System.out.println(string);
    }


}
