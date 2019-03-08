package main;

public class Recursion {
    public static void countDown(int number) {
        if (number == 0)
            return;
        System.out.println(number);
        number = number - 1;
        countDown(number);
    }

    public static void main(String[] args) {
countDown(4);
    }
}