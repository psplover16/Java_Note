import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        new Array1();
//        new Array2();
//        new DescendingOrder(getRandomArray(5));
//        SortedArray.getIntegers(5);
//        int[] numbers = SortedArray.getIntegers(5); // 呼叫並接回傳陣列

//        System.out.println(Arrays.toString(numbers));
//        int[] srotArr = SortedArray.sortIntegers(numbers);
//        System.out.println(Arrays.toString(srotArr));

//        SortedArray.printArray(srotArr);

//        String[] sarr = {"a", "b", "c", "d", "e", "f", "g"};
//        把字串陣列（或任意 Iterable<String>）接起來，指定分隔符
//        System.out.println(String.join(", ", sarr));

//        int[] tmpArr = ReadInteger.readIntegers();
//        ReadInteger.findMin(tmpArr);


//        int readInt = MinimumElement.readInteger();
//        int[] inteles = MinimumElement.readElements(readInt);
//        int minVal = MinimumElement.findMin(inteles);
//        System.out.print(minVal);

//        int[] intArr = new int[]{1, 3, 4, 7, 8};
//        MinimumElement.reverse(intArr);
//        System.out.print(Arrays.toString(MinimumElement.reverse(intArr)));


        int[][] arrTest;
//        花括號的這種寫法只能用在宣告並同時初始化的時候
//        arrTest[0] = {1,2,3};
//        int[][] arrTest; 只是宣告了二維陣列的參考，還沒有實際分配空間，所以 arrTest 還是 null，arrTest[0] = new int[]{1, 2, 3};
//        會在存取時丟 NullPointerException。必須先建立第一維
        arrTest = new int[1][0];
        arrTest[0] = new int[]{1, 2, 3};

        Object[] objArr = new Object[3];
//        objArr[0] = new int[]{1, 2, 3}; // JAVA不允許把INT當成 obj所以報錯
        objArr[0] = new String[]{"x", "y", "z"};
        objArr[1] = new String[]{"a", "b", "c"};
        objArr[2] = new int[2][2][2];
//        objArr[2] = "Hello";

//        System.out.println(Arrays.deepToString(objArr));
        for (Object obj : objArr) {
//            System.out.println(obj.getClass().getSimpleName());
//            System.out.println(obj);
//            System.out.println(Arrays.toString(objArr));
            System.out.println(Arrays.deepToString((Object[]) obj));
        }

    }


    public static int[] getRandomArray(int len) {
        int[] arr = new int[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(100); // 從0~100隨機生成數值
        }
        return arr;
    }


}