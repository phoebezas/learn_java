package hello_pkg;

public class largerdemo {
    /** we can use this to demonstrate the function since some software will use /** to find sentences to build a document */
    public static int larger(int x, int y){
        if (x > y){
            return x;
        }
        return y;
    }
    public static void main(String[] args){
        System.out.println(larger(-5, 10));
    }
}
/*
1. functions are declared as a part of a class in Java.
    A function in Java is called "method", so all functions in Java are methods.
2. To define a function we use public static while we may use other definitions later.
3. All variables in a function must have declared type and the return variable must have declared type too.
    Java functions only return one value.
4. To run a Java code, we must define a main method, now we are using public static void main(String[] args){}.

*/
