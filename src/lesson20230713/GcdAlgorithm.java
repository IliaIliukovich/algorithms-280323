package lesson20230713;

public class GcdAlgorithm {

    // Greatest common divisor
    // brute force solution
    public static int bruteForce(int a, int b){
        int x = Math.max(a, b);
        int y = Math.min(a, b);

        for (int i = y; i > 0; i--) {
            if (x % i == 0 && y % i == 0) return i;
        }
        return 1;
    }

    // Euclidean algorithm
    // Формула НОД: НОД (a, b) = НОД (b, с), где с — остаток от деления a на b.
    //1 Большее число поделить на меньшее.
    //2 Меньшее число поделить на остаток, который получается после деления.
    //3 Первый остаток поделить на второй остаток.
    //4 Второй остаток поделить на третий и т. д.
    //5 Деление продолжается до тех пор, пока в остатке не получится нуль. Последний делитель и есть наибольший общий делитель.
    //
    // НОД(28, 12)
    //1. 28 / 12 -> ост. 4
    //2. 12 / 4 -> ост. 0
    // итого НОД(28, 12) = 4
    public static int euclidean(int a, int b){
        int x = Math.max(a, b);
        int y = Math.min(a, b);
        int tmp = y;
        while (tmp != 0){
            tmp = x % y;
            x = y;
            y = tmp;
        }
        return x;
    }

    public static void main(String[] args) {

        long start = System.nanoTime();
        int result = bruteForce(5000, 3000);
        long end = System.nanoTime();
        System.out.println("Brute force result: "+ result);
        System.out.println("Time elapsed: " + (end - start));

        start = System.nanoTime();
        result = euclidean(5000, 3000);
        end = System.nanoTime();
        System.out.println("Euclidean alg result: " + result);
        System.out.println("Time elapsed: " + (end - start));
    }

}
