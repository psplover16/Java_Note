package arraylist006;
import java.util.*;

public class ArrayListIntroDemo {

    public ArrayListIntroDemo() {

        // =========================
        // ArrayList 基本介紹
        // =========================
        // ArrayList 是 List 介面的實作
        // 底層為動態陣列（容量不足會自動擴充）
        // 只能存放 reference type（不能放 primitive(基礎型別)）

        List<String> list = new ArrayList<>();

        list.add("Gary");

        list.add(1, "abc"); // 插入
        list.set(0, "def"); // 修改
        list.remove(0); // 刪 index
        list.remove("def"); // 刪值（若存在）

        System.out.println(list.get(0));

        if (list.contains("Gary")) {
            System.out.println("有 Gary");
        }

        System.out.println(list.indexOf("Gary"));
        System.out.println(list.lastIndexOf("Gary"));

        // =========================
        // 排序
        // =========================
        // Comparator.naturalOrder() 是 static 方法
        // 回傳 Comparator 的 instance
        list.sort(Comparator.naturalOrder()); // 小 → 大
        System.out.println(list);

        list.sort(Comparator.reverseOrder()); // 大 → 小
        System.out.println(list);

        // =========================
        // 不可變 / 固定大小 List
        // =========================

        String[] items = { "Gary", "Jack" };

        // Arrays.asList
        // 固定大小（不能 add / remove）
        // 可以 set
        // 會連動原始 array
        // 可以放 null
        List<String> fixedSizeList = Arrays.asList(items);
        fixedSizeList.set(0, "Gary"); // OK，會影響 items

        // List.of
        // 完全不可變
        // 不能 set / add / remove
        // 不能放 null
        List<String> immutableList = List.of(items);

        // =========================
        // 建立真正可變的 ArrayList
        // =========================
        List<String> mutableList1 = new ArrayList<>(fixedSizeList);
        List<String> mutableList2 = new ArrayList<>(immutableList);

        mutableList1.add("Pai");
        mutableList2.add("Pai");

        // =========================
        // List ↔ Array 轉換
        // =========================

        // List → Array
        // new String[0] 與 new String[list.size()] 功能相同
        // new String[0] 為慣用寫法
        String[] arr1 = mutableList1.toArray(new String[0]);
        String[] arr2 = mutableList1.toArray(new String[mutableList1.size()]);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        // Object[]（不指定型別）
        Object[] objArr = mutableList1.toArray();

        // =========================
        // retain / remove
        // =========================
        mutableList1.retainAll(immutableList); // 只保留交集
        mutableList1.removeAll(immutableList); // 移除指定集合全部元素

        // =========================
        // 清空
        // =========================
        mutableList1.clear();
        System.out.println(mutableList1.isEmpty());
        System.out.println(mutableList1.size());
    }
}