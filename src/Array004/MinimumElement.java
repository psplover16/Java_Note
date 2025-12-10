import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    public static int readInteger() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }

    public static int[] readElements(int arrLength) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }


    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int ele : arr) {
            if (ele < min) {
                min = ele;
            }
        }
        return min;
    }

//    public static int[] reverse(int[] arr) {
//        System.out.printf("Array = %s\n", Arrays.toString(arr));
//        for (int i = 0; i < arr.length / 2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length - i - 1];
//            arr[arr.length - i - 1] = temp;
//        }
//        System.out.printf("Array = %s\n", Arrays.toString(arr));
//        return arr;
//    }

    public static void reverse(int[] arr) {
        System.out.printf("Array = %s\n", Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.printf("Reversed array = %s\n", Arrays.toString(arr));
    }

//Arrays.deepToString


}
