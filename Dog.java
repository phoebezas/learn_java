package hello_pkg;

public class Dog {
    /*instance variables, you can have as many of these as
    * you want.*/
    public int weightInPound;
    /*one integer constructor for dog class,
    * similar to a method, but it is not a method.
    * it determines how to instantiate the class.*/
    public Dog(int w){
        weightInPound = w;
    }
    /*non static method, a.k.a instance method.
    * if the method is going to be invoked by an instance
    * of the class, then it should be non-static.
    * if the method needs to use "my instance variables",
    * the method must be non-static*/
    public void makeNoise(){
        if (weightInPound < 20){
            System.out.println("yip");
        }else if (weightInPound < 50){
            System.out.println("bark.");
        }else{
            System.out.println("woooooof!");
        }
    }
}
