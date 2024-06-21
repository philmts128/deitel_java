/**
 * Simple test of plymorphism
 * Author: Philippe Matias
 */


 /*-------------------------------------*/
 public class Parrot extends Animal
 {
      /*-------------------------------------*/
     private int loudness;
 
      /*-------------------------------------*/
     Parrot(String name, int loudness) 
     {
         super(name, "green", 25);
         this.loudness = loudness;
     } 
 
     /*-------------------------------------*/
     @Override
     public void sayHi()
     {
         System.out.printf("** %s says \'Loro quer biscoito\' at %d\n", this.name, this.loudness);
     }
 
     /*-------------------------------------*/
     public void fly()
     {
         System.out.printf("** %s flies away\n", this.name);
     }
 }