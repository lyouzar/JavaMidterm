package math.problems;

public class Fibonacci {

    public static int Fib(int n) {

        if (n <= 1)
            return n;
        return Fib(n - 1) + Fib(n - 2);
    }

    /*
    Write a method that will print or return at least 40 Fibonacci numbers

      0,1,1,2,3,5,8,13
     */

    public static void main(String[] args) {

        for (int i = 0; i < 40; i++) {
            System.out.print(Fib(i) + ", ");
        }
    }
}

