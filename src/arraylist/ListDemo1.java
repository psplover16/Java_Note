package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListDemo1 {
    public ListDemo1() {
//        var 編譯器會根據右邊的值，自動推斷變數型別。 所以右邊一定要有值且不能為null
//        var 不能用在欄位（class 成員變數）
//        可讀性可能變差（若右邊型別不明確）

//        String[] items = {"Gary", "Jack"};
        var items = new String[]{"Gary", "Jack"};
//        var arr = {"Gary", "Jack"}; // ❌ 不行

//        回傳 不可變 List（immutable），專門用來建立常數資料，語意更明確
//        List<String> fixed = List.of("Gary", "Jack"); // 不可變
//        List<String> fixed = List.of(items);
        var fixed = List.of(items);

//        Arrays.asList(arr) → 意思是「把 array 包裝成 List」, 常見於「已有 array → 要變成 list」的情境
        var fixed2 = Arrays.asList(items);

//        可以直接對fixed3做出ArrayList的操作，但不能新增刪除，因為它會動到原本的array
        var fixed3 = Arrays.asList(items);
//        fixed3.add("GG");
        fixed3.set(0, "Gary");
        System.out.println(fixed3);
        var arrayFixed3 = fixed3.toArray(new String[0]);
        System.out.println(fixed3); // ArrayList直接打印
        System.out.println(Arrays.toString(arrayFixed3)); // Array要轉換才能打印

        System.out.println(fixed); // [Gary, Jack]
        // 建立可變 List，預設把fixed 塞入 nextList
        List<String> nextList = new ArrayList<>(fixed2);
        nextList.add("Pai"); // [Gary, Jack, Pai]
        nextList.add(1, "abc"); // [Gary, abc, Jack, Pai]
        nextList.set(0, "def"); // [def, abc, Jack, Pai]
        nextList.remove(0); // [abc, Jack, Pai]
        nextList.remove("def"); // [abc, Jack, Pai]
        nextList.addAll(fixed); // [abc, Jack, Pai, Gary, Jack]
        nextList.addAll(fixed); // [abc, Jack, Pai, Gary, Jack, Gary, Jack]

        System.out.println(nextList.get(0)); // 可用 index 取值
        if (nextList.contains("Gary")) { // 是否包含
            System.out.println("有Gary");
        }
        System.out.println(nextList.indexOf("Gary")); // 3
        System.out.println(nextList.lastIndexOf("Gary")); // 5

//        System.out.println(Comparator.naturalOrder()); // instance
//        instance?
//        class 內部有 static 與 instance
//        class 的 static（類別層級）
//        class 的 instance（物件層級）
        nextList.sort(Comparator.naturalOrder()); // 由小到大，對字串是依照 Unicode 字典序排序
        System.out.println(nextList); // [Gary, Gary, Jack, Jack, Jack, Pai, abc]
        nextList.sort(Comparator.reverseOrder()); // 由大到小
        System.out.println(nextList); // [abc, Pai, Jack, Jack, Jack, Gary, Gary]

//        轉陣列(甚麼型別,不加表示轉成物件陣列 object[])
//        new String[nextList.size()] 與 new String[0] 功能相同，性能略佳
        var arrayNextList = nextList.toArray(new String[nextList.size()]);
        System.out.println(Arrays.toString(arrayNextList));


        System.out.println(nextList.size()); // 7
        nextList.retainAll(fixed2); // 只保留與指定集合（Collection）重複的元素
        nextList.removeAll(fixed2); // 移除指定的全部 list
        //  []
        System.out.println(nextList.size()); // 0

        nextList.clear(); // 清空list
        System.out.println(nextList); // []
        System.out.println(nextList.isEmpty()); // true
        System.out.println(nextList.size()); // 0

    }
}
