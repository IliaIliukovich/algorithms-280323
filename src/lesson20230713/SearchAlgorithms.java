package lesson20230713;

import java.util.Arrays;

public class SearchAlgorithms {

    public static void main(String[] args) {
       Integer[] data = new Integer[] {1, 2, 1, 6, -6, 10, 21, 17, 9};

        System.out.println(findSequentially(2, data));
        System.out.println(binarySearch(2, data));
    }

    public static Integer findSequentially(Integer key, Integer[] data){
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(key)) return i;
        }
        return null;
    }

    public static Integer binarySearch(Integer key, Integer[] data){
        Arrays.sort(data); // binary search works only with sorted data
        System.out.println("Sorted data:" + Arrays.toString(data));

        int left = 0;
        int right = data.length - 1;
        int middle = left + (right - left) / 2;

        while (left <= right) {
            if (data[middle].equals(key)) return middle;
            else if (data[middle].compareTo(key) > 0) right = middle - 1;
            else if (data[middle].compareTo(key) < 0) left = middle + 1;
            middle = left + (right - left) / 2;
        }
        return null;
    }

}
