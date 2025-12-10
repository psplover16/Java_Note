package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//ArrayList vs Array
public class ListAndArr {
    public ListAndArr() {
//        基本型別 / 原始型別，指的是 不是物件、不是 class、不是 reference type 的那 8 種最底層資料型別。
//        這些是 Java 唯一不是物件的類型。
//        因為 primitives 不是物件，所以 Java 做了一組「包裝類」：  資料結構中（List, Map, Stream）就不能用 primitive，只能用 wrapper
//        primitive	wrapper
//        int	Integer
//        double	Double
//        boolean	Boolean
//        char	Character
//        byte	Byte
//        short	Short
//        long	Long
//        float	Float
        List<Integer> nextList;
//        List<int> nextList;  // 錯誤
        int[] nextArr;
        Integer[] nextArr2;

//        宣告與初始化，ArrayList常見兩種做法
        String[] strArr = {"first", "third", "second"};
        ArrayList<String> strArrayList = new ArrayList<>(Arrays.asList(strArr));
        ArrayList<String> strArrayList2 = new ArrayList<>(List.of(strArr));
//        ArrayList轉Array
        strArrayList.toArray(new String[strArrayList.size() - 1]); // 轉換成指定屬性及指定長度的陣列

//        取長度方法不同
        int strArrLength = strArr.length;
        int strArrListLength = strArrayList2.size();

//        設值
        strArr[0] = "one";
        strArrayList.set(0, "one");
//        取值
        System.out.println(strArr[0]);
        System.out.println(strArrayList.get(0));

//        打印
        System.out.println(Arrays.toString(strArr));
//        System.out.println(Arrays.deepToString(strArr)); // 2維Array
        System.out.println(strArrayList);

//        排序，呼叫方法，直接把陣列排序，不回傳
        Arrays.sort(strArr);
        strArrayList.sort(Comparator.naturalOrder()); // 能引用排序方法，小到大
        strArrayList.sort(Comparator.reverseOrder()); // 大到小

//        查找元素
        int findArr = Arrays.binarySearch(strArr, "one"); // 只有這方法，二分搜尋，限用sort過的陣列，查不到回傳-1
        boolean strArrayListGetEle = strArrayList.contains("one");
        boolean strArrayListGetEles = strArrayList.containsAll(List.of(strArr)); // 查找list是否都有
        int strArrayListGetEleIndex = strArrayList.indexOf("one");
        int strArrayListGetEleLastIndex = strArrayList.lastIndexOf("one");


//        Array轉成List有兩方法
//        固定大小，不能新增刪除 / 可以修改元素 / 會連動原始Array / 可放null
        var arrayList1 = Arrays.asList(strArr);
//        不可變的List，完全常數，都不能動，也不能丟null
        var arrayLst2 = List.of(strArr);

//      淨空
        strArr = new String[3]; // 因為陣列大小無法改變，所以很多人直接重新 new
        strArrayList.clear();
    }

}
