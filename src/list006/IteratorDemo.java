package list006;

import java.util.*;

public class IteratorDemo {
    public IteratorDemo() {
        setIteratorDemo();
        setListIterator();
    }


    void setIteratorDemo() {
        List<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
//        iterator // 一個預設在第一個元素之前地游標
        Iterator<String> it = list.iterator();
//        只有三作法
        while (it.hasNext()) { // 後面還有沒有?
            String value = it.next();   // 游標往前，回傳掃過的元素
            if (value.equals("A")) {
                it.remove();           // 刪「剛剛 next() 的那個」
            }
        }
        System.out.println(list); // [B, C]
    }

    void setListIterator() {
        //        list.listIterator()
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        ListIterator<String> it = list.listIterator(); // ListIterator 只能用在 List，是 Iterator的強化版

        it.nextIndex(); // 0，「如果現在再呼叫 next()，會回傳哪個元素的 index」
        it.hasNext();   // true，後面還有沒有元素
        String v1 = it.next(); // "A"，游標往前，拿元素
        it.nextIndex(); // 1

//        ABC
        if (v1.equals("A")) {
            it.add("X"); // 在游標位置插入，插入後，游標會在插入後的文字後方。 在游標位置插入新元素。 // AXBC
        }

        String v2 = it.next(); // "B"
//        set的定義，替換「最後一次由 next() 或 previous() 回傳的那個元素」，所以規則如下
//        1. 一定要在 next() 或 previous() 之後。若沒有，則iterator不知道要修改哪個元素
//        2. 不能在 add() 之後馬上用

////        以下是禁止情況
//        it.next();        // 拿到 A
//        it.add("B");     // 插入 B
//        it.set("X");     // ❌ IllegalStateException
//        add("B") 之後： 游標位置改變，剛剛「被選取的元素」已不再是「最後一次操作的元素」。Java 刻意清空「最後選取元素」的狀態。


        it.set("Y"); // 改剛剛拿到的那個元素。  // AXYC

        it.hasPrevious(); // true，前面還有沒有元素
        String back = it.previous(); // "Y"  游標往回，回傳剛剛跨過去的元素。游標往後，拿元素

        it.remove(); // remove 刪的是最後一次移動（next / previous）拿到的元素，AXC

        it.next(); // "C"
        it.add("Z"); // AXCZ

//
//
//
//
//
//
//        hasNext() 👉 後面還有沒有元素
//        next() 👉 游標往前，拿元素
//        hasPrevious() 👉 前面還有沒有元素
//        previous() 👉 游標往後，拿元素
//        add() 👉 在游標位置插入新元素
//        set() 👉 改剛剛拿到的那個元素
//        remove() 👉 刪剛剛拿到的那個元素
//        nextIndex() 👉 如果現在 next，會是第幾個
    }
}

