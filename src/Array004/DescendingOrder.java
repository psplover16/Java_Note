import java.util.Arrays;

public class DescendingOrder {
    private int[] array;

    public DescendingOrder(int[] arrayss) {
        array = arrayss;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int[] newArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArr[array.length - 1 - i] = array[i];
        }
        System.out.println(Arrays.toString(newArr));
    }


}
