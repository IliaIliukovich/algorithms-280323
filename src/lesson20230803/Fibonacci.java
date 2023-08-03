package lesson20230803;

public class Fibonacci {

    // fibonacci sequence
    // 0 1 1 2 3 5 8 13
    // f(0) = 0
    // f(1) = 1
    // f(2) = 1
    // f(3) = 2
    // f(4) = 3

    public static long fibonacci(int n){
        if (n == 0) return 0; // base condition
        if (n == 1) return 1; // base condition
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static long fibonacciMemo(int n){
        long[] cache = new long[n + 1];
        cache[0] = 0;
        cache[1] = 1;
        return fibonacciMemo(n, cache);
    }

    public static long fibonacciMemo(int n, long[] cache){
        if (n == 0) return 0; // base condition
        if (n == 1) return 1; // base condition
        if (cache[n] != 0) return cache[n];
        long result = fibonacciMemo(n - 1, cache) + fibonacciMemo(n - 2, cache);
        cache[n] = result;
        return result;
    }



    public static void main(String[] args) {

        int n = 30;

        long start = System.nanoTime();
        long result = fibonacci(n);
        long end = System.nanoTime();
        System.out.println("Time: " + (end - start) + " Result: " + result);

        start = System.nanoTime();
        result = fibonacciMemo(n);
        end = System.nanoTime();
        System.out.println("Time: " + (end - start) + " Result Memo: " + result);
    }
}
