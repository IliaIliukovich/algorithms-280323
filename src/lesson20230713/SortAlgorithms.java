package lesson20230713;

import java.util.Arrays;
import java.util.Random;

public class SortAlgorithms {


    public static void main(String[] args) {

        int[] ints = new int[] {0, 1, 3, 7, 0, 3, 2, 11, 31};
        sortBruteForce(ints);
        System.out.println(Arrays.toString(ints));

        int n = 1000;
        int[] testData = generateTestData(n);
        long start = System.nanoTime();
        sortBruteForce(testData);
        long end = System.nanoTime();
        System.out.println("Selection sort alg time elapsed: " + (end - start));

        testData = generateTestData(n);
        start = System.nanoTime();
        Arrays.sort(testData);
        end = System.nanoTime();
        System.out.println("Arrays.sort() alg time elapsed: " + (end - start));
    }

    private static int[] generateTestData(int n) {
        Random random = new Random();
        int[] ints = new int[n];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(0, 10_000);
        }
        return ints;
    }

    // selection sort
    public static void sortBruteForce(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            int min = ints[i];
            int indMin = i;
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[j] < min){
                    indMin = j;
                    min = ints[j];
                }
            }
            int tmp = ints[i];
            ints[i] = ints[indMin];
            ints[indMin] = tmp;
        }
    }


}
