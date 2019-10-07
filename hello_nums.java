package hello_pkg;

public class hello_nums {
    public static void main(String[] args){
        int x = 1;
        while (x<10){
            System.out.println(x);
            x = x+1;
        }
    }
}
/*
1. Before Java variables can be used, they must be declared first.
2. Java variables must have a specific type;
3. Java variables can not be changed, for example, after we declare x as int, we can not write x = 'horse'
   or string x = 'horse' since variable x has been declared as int.
4. Types are verified before the code runs.
if we write x = 'horse' after the loop, the code even won't run and will give us the error message, while in python
if we write x = 1+'fre' after the loop, we still get 0 to 9 first and get error message.
Here is a huge difference between Java and python, java is more strict about types of variables which makes it easier
to debug and you will know that x should always be an integer.
*/

