package list006;

import java.util.*;

public class ArrayVsArrayListDemo {

    public ArrayVsArrayListDemo() {

        // Array 可以存 primitive 與 reference
        int[] intArr = { 1, 2, 3 };
        String[] strArr = { "first", "third", "second" };

        // ArrayList 只能存 reference type
        List<Integer> intList;
        // List<int> intList; // ❌ 錯誤（泛型不能用 primitive）

        // Array → ArrayList（可變）
        ArrayList<String> list = new ArrayList<>(Arrays.asList(strArr));

        // 取長度方式不同
        int arrLength = strArr.length;
        int listLength = list.size();

        // 設值
        strArr[0] = "one";
        list.set(0, "one");

        // 取值
        System.out.println(strArr[0]);
        System.out.println(list.get(0));

        // 打印
        System.out.println(Arrays.toString(strArr));
        System.out.println(list);

        // 排序
        Arrays.sort(strArr); // 直接排序，不回傳
        list.sort(Comparator.naturalOrder()); // 小 → 大
        list.sort(Comparator.reverseOrder()); // 大 → 小

        // 查找
        // binarySearch 必須先 sort，否則結果不正確。回傳 index。 若 index < 0，表示找不到
        int index = Arrays.binarySearch(strArr, "one");

        boolean contains = list.contains("one"); // 本質與 equals() 相同，而非 ==
        int firstIndex = list.indexOf("one");
        int lastIndex = list.lastIndexOf("one");

        // 清空方式不同
        strArr = new String[3]; // 陣列大小不可變，常見做法是重新 new
        list.clear();
    }
}