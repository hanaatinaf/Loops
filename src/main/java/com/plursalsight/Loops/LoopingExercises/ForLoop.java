package com.plursalsight.Loops.LoopingExercises;

public class ForLoop {
    public static void main(String[] args)  throws InterruptedException {
        for (int i = 1; i <= 10;  i++){

            System.out.println(i + " Launch!");
            Thread.sleep(1000);
        }
    }
}
