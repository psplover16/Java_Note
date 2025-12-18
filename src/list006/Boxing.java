package list006;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Boxing {
    public Boxing() {
//        雖然primitive速度快 且 占用記憶體少，但是有限制，比如說List系列不能用(陣列可以用)、汎型不能用，所以需要轉成物件
//        primitive轉成
        Integer boxedInt = Integer.valueOf(1); // 正規手動裝箱，但非必要，少用
        Integer deprecatedInt = new Integer(1); // 舊版，已經廢棄的寫法
        int unboxedInt = boxedInt.intValue(); // 正規拆箱，但非必要，少用

//        System.out.println(boxedInt.toString()); // 1
//        System.out.println(deprecatedInt.toString()); // 1
//        System.out.println(unboxedInt); // 1

//        自動
        Integer autoBoxedInt = 15; //  自動裝箱
        int autoUnBoxedInt = autoBoxedInt;
//        System.out.println(autoBoxedInt.getClass().getSimpleName()); // Integer
//        System.out.println(autoBoxedInt.getClass().getName()); // java.lang.Integer
//        System.out.println(autoUnBoxedInt.getClass()); //// 因為是primitive，沒有方法


        Double DoubleObj = getDoubleObject(getDoublePrimitive());
        System.out.println(DoubleObj.getClass().getName());


        Integer[] wrapperArr = new Integer[5];
        wrapperArr[0] = 50;
//        System.out.println(Arrays.toString(wrapperArr)); // [50, null, null, null, null]
//        System.out.println(wrapperArr[0].getClass().getName()); // java.lang.Integer

        Character[] wrapperCharArr = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(wrapperCharArr)); // [a, b, c, d]

//        setting>inlay Hints>type(JAVA)(Implicit types)     打開IDE的顯示型別提示功能
//        Implicit type 其實不是 Java 新語法，而是 編輯器幫你「顯示型別提示」的功能。
        var outList = getList(1, 2, 3);
//        outList = getList(10);
//        outList = getList(new int[]{1, 2, 3});
//        outList = getList(new int[]{10});
//        outList = getList(new int[]{});
//        outList = getList();
        System.out.println(outList);
        var outList2 = List.of(1, 2, 3); // List<Integer>
    }


    private Double getDoubleObject(double value) {
        return Double.valueOf(value);
//        return value;
    }

    private double getDoublePrimitive() {
        return 100.0;
    }

        private ArrayList<Integer> getList(int... varargs) {
//    private ArrayList<Integer> getList(Integer... varargs) { // 因為自動 封箱 裝箱，所以可以這樣切換，Integer... 可以傳 null
//        int...varargs，表示可以傳多個 int，本質其實是 int[]{}
//        一個方法 只能有一個 varargs
//        Varargs 一定要放在最後
//        Varargs 可以「不傳」
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : varargs) {
            list.add(i);
        }
        return list;
    }


}
