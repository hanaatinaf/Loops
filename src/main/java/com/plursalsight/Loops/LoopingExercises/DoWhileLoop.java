package com.plursalsight.Loops.LoopingExercises;

/*Create  class named DoWhileLoop. Add a new main() method and
print "I love Java" again, 5 times, but this use a do/while loop*/
public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("I love Java");
            i++;

        }while (i < 5);
    }
}
