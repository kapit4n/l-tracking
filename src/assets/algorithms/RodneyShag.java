import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();

        Arrays.sort(array);
        int total = 0;
        for (int num : array) total += num;

        double mean = (double) total / size;

        double median;
        if (size % 2 == 0) {
            median = (array[size / 2 - 1]) + array[size / 2] / 2.0;
        } else {
            mediam 
        }
    }
}
