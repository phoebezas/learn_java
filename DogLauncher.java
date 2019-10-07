package hello_pkg;

public class DogLauncher {
    public static void main(String[] args){
        /*
        Dog d = new Dog(60);
        d.makeNoise();
        */
        /* create arrays of objects
        * first use new keyword to create array*/
        Dog[] dogs = new Dog[2]; /*create an array of Dogs of size 2*/
        dogs[0] = new Dog(8);
        /*use new again for each object that you want to put in the array*/
        dogs[1] = new Dog(50);
        dogs[0].makeNoise();
        dogs[1].makeNoise();
    }
}
