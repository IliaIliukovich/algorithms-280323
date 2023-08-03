package lesson20230803;

public class RecursionExamples {

    public static void main(String[] args) {
        f(110);
        f1(10);

        int n = 1000;

        long start = System.nanoTime();
        int sum = sum(n);
        long end = System.nanoTime();
        System.out.println("Time: " + (end - start));
        System.out.println("Sum in loop = " + sum);

        start = System.nanoTime();
        sum = sumRecursive(n);
        end = System.nanoTime();
        System.out.println("Time: " + (end - start));
        System.out.println("Sum recursive = " + sum);

        n = 15;
        System.out.println(n + "!= " + factorialRecursive(n));

    }


    public static void f(int n) {
        if (n == 100) { // base condition
            System.out.println("Got to the base condition");
            return;
        }
        System.out.println(" n = " + n);
        f(n - 1);
    }

    public static void f1(int n){
        System.out.println("Inside f1. N = " + n);
        f2(n);
    }

    public static void f2(int n) {
        if (n == 15) return; // base condition
        System.out.println("Inside f2. N = " + n);
        f1(n + 1);
    }

    public static int sum(int n){
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = result + i;
        }
        return result;
    }

    public static int sumRecursive(int n){
        if (n == 1) return 1;
        return n + sumRecursive(n - 1);
    }


    // n!
    // 0! == 1
    // 1! == 1
    // 2*3*4....*n
    // 3! = 2*3 = 6
    // 4! = 2*3*4 = 24
    public static long factorialRecursive(int n){
        if (n == 0) return 1; // base condition
        if (n == 1) return 1;
        return n * factorialRecursive(n - 1);
    }




}
