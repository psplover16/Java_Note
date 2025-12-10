import java.util.Arrays;

public class Array2 {
    public Array2() {
        String[] strArr = new String[]{"Gary", "Dainel", "Apple", "Jay"};
        System.out.println(Arrays.toString(strArr));
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));
//        ⼆元搜尋，從中間找，看往前還往後，一直持續
//        陣列 一定要已經排序（Sort）
        int indexBinary = Arrays.binarySearch(strArr, "Gary");
        System.out.println(indexBinary);

//        陣列 值 是否相同，而非記憶體位置， === 是表示記憶體位置
        int[] s1 = new int[]{1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5};
//        int[] s3 = new int[5];
        Boolean arrayContain = Arrays.equals(s1, s2);
        System.out.println(arrayContain);
    }
}
