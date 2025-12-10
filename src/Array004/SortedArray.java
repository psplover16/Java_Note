import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int arrLength) {
        Scanner scanner = new Scanner(System.in);
        int[] returnArr = new int[arrLength];

        int index = 0;
        while (index < arrLength) {
            int ans = scanner.nextInt();
            returnArr[index] = ans;
            index++;
        }
        return returnArr;
    }


    //    public static int[] sortIntegers(int[] originalArr) {
//    可變參數只能有一個且需要放在最尾巴
    public static int[] sortIntegers(int... originalArr) {
        int[] dealArr = Arrays.copyOf(originalArr, originalArr.length);
        Arrays.sort(dealArr);
        int[] returnArr = new int[dealArr.length];
        for (int i = 0; i < dealArr.length; i++) {
            returnArr[dealArr.length - 1 - i] = dealArr[i];
        }
        return returnArr;
    }


    public static void printArray(int[] arr) {

        for (int index = 0; index < arr.length; index++) {
            System.out.printf("Element %d contents %d%n", index, arr[index]);
        }

    }

}
