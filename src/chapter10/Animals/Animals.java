/**
 * Simple test of plymorphism
 * Author: Philippe Matias
 */


 public class Animals
 {
    public static void main(String[] args)
    {
        var polly = new Parrot("Polly", 3);
        polly.sayHi();
        polly.fly();

        var stewart = new Rat("Stewart", 5);
        stewart.climb();
        stewart.sayHi();
    }
 }