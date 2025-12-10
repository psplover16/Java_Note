import java.util.Arrays;
import java.util.Scanner;

public class ReadInteger {
    public static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);

        String sc = scanner.nextLine();
        String[] sarr = sc.split(",");
//        "Gary","BAG","JACKY"
//1,2,3

        int[] sarrInt = new int[sarr.length];
        for (int i = 0; i < sarr.length; i++) {
            sarrInt[i] = Integer.parseInt(sarr[i].trim());
        }

        System.out.println(Arrays.toString(sarrInt));
        return sarrInt;
    }

    public static int findMin(int... arr) {
        int minval = arr[0];
        for (int ele : arr) {
            if (ele < minval) minval = ele;
        }
        System.out.println(minval);
        return minval;
    }
}
