package lesson20230803;

public class AlgAnalysis {

    public int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    // space complexity: 1 int variable -> O(1)
    // time complexity:
    // 1 step: a + b
    // 1 step: =
    // 1 step: return
    // 3 operations: O(3) = O(1)

    public int sumArray(int[] array){
        int sum = 0; // 1
        for (int i = 0; i < array.length; i++) { // 3 * (n + 1)
            sum = sum + array[i]; // 2 * n
        }
        return sum; // 1
    }

    // space complexity: sum, i  -> O(1)
    // time complexity: 1 + 3 * (n + 1) + 2 * n + 1 = 5n + 5
    // O(5n + 5) = O(5n) = O(n)

}
