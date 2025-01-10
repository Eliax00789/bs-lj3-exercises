package n06_sorting_algorithms;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new Random().ints(12, 0, 100).toArray();
        System.out.println(Arrays.toString(Main.bubbleSort(arr.clone())));
        System.out.println(Arrays.toString(Main.bogoSort(arr.clone())));
    }

    private static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int tmp;
        int jNext;
        boolean haveChange;
        for (int i = 0; i < n - 1; i++) {
            haveChange = false;
            for (int j = 0; j < n - 1 - i; j++) {
                jNext = j + 1;
                if (arr[j] > arr[jNext]) {
                    haveChange = true;
                    tmp = arr[j];
                    arr[j] = arr[jNext];
                    arr[jNext] = tmp;
                }
            }
            if (!haveChange) {
                break;
            }
        }
        return arr;
    }

    private static int[] bogoSort(int[] arr) {
        while (!Main.isSorted(arr)) {
            Random random = new Random();
            for (int i = arr.length - 1; i > 0; i--) {
                int j = random.nextInt(i + 1);
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return arr;
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
