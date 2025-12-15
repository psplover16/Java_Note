package list006;

import java.util.*;

public class LinkedListDemo {

    public LinkedListDemo() {
        // arrayList，陣列，資料連續。具引索引系統，所以 get快，但從中間插入慢，也因為連續性，但擴充時會動到整個資料的記憶體位置，所以需要先給定容量
        ArrayList<String> list = new ArrayList<>(10000); // 擴充後，容量會提升約1.5倍

        // LinkedList，資料不連續。沒有引索系統，屬於鏈式結構
        // LinkedList屬於list的一種實作（資料結構）
        LinkedList<String> linkedList = new LinkedList<>();
        // 預設是 Deque<E> 介面，雙向佇列
        // 基本用法語法和 ArrayList 差不多
        // ----------------------------------------------------------------------------------------------------------
        // ----------------------------------------------------------------------------------------------------------
        // ----------------------------------------------------------------------------------------------------------
        // 但多了 stack / queue 的方法
        // Stack（堆疊）是 LIFO（後進先出）
        // 官方建議用 Deque 來取代 Stack
        Deque<String> stack = new LinkedList<>(); // 只能用預設初始，然後填值的方式，沒辦法預設容量
        // push(e) 壓入堆疊（放在最前面）
        stack.push("a");
        stack.push("b");
        stack.push("c");
        // System.out.println(stack.toString()); // [c, b, a]
        // 彈出堆疊（拿走最前面，並回傳）
        stack.pop(); // c
        // System.out.println(stack.pop()); // b
        // System.out.println(stack.toString()); // [a]
        // 看頂端（不移除）
        var stackTop = stack.peek();
        // System.out.println(stackTop); // a
        // ----------------------------------------------------------------------------------------------------------
        // ----------------------------------------------------------------------------------------------------------
        // ----------------------------------------------------------------------------------------------------------
        //
        // Queue（FIFO）用的方法，入列在後端，出列在前端 (排隊)
        Queue<String> queueList = new LinkedList<>();
        // 入列，放到尾端
        queueList.add("A"); // 成功回傳true，失敗會丟 IllegalStateException (但該錯誤再LinkedList不會發生，因為沒容量限制)
        queueList.offer("B"); // 比較安全，不會丟 exception，加入成功回傳true，失敗回傳false
        queueList.add("C"); // LinkedList 允許放 null
        queueList.offer("D");
        queueList.add(null);
        System.out.println(queueList.toString()); // [A, B, C, D, null]
        //
        // 出列，前端拿走
        queueList.remove(); // A，移除並回傳隊首元素，若隊列為空，則丟 NoSuchElementException
        queueList.poll(); // B，移除並回傳隊首元素，若隊列為空，則回傳 null
        var queueListElement = queueList.element(); // C，回傳隊首元素但不移除，若隊列為空，則丟 NoSuchElementException
        System.out.println("queueListElement: " + queueListElement); // queueListElement: C
        var queueHead = queueList.peek(); // D，回傳隊首元素但不移除，若隊列為空，則回傳 null
        System.out.println("queueHead: " + queueHead); // queueHead: C
        System.out.println(queueList.toString()); // [C, D, null]
        //
        // ----------------------------------------------------------------------------------------------------------
        // ----------------------------------------------------------------------------------------------------------
        // ----------------------------------------------------------------------------------------------------------
        //
        // Deque（雙端佇列）的方法，官方明確表示取代Stack比較好
        Deque<String> dequeList = new LinkedList<>();
        dequeList.addFirst("1"); // 從前端加
        dequeList.addLast("2"); // 從尾端加
        dequeList.add("3"); // 預設從尾端加
        System.out.println(dequeList.toString()); // [1, 2, 3]
        System.out.println(dequeList.peekFirst()); // 看前端，不移除 1
        System.out.println(dequeList.peekLast()); // 看尾端，不移除 3

        dequeList.removeFirst(); // 從前端拿，回傳 1
        dequeList.removeLast(); // 從尾端拿，回傳 3

        //
        //
        //
        // Queue<E> 是介面，定義規則，表示 我現在要用的是『Queue 的行為，本身 不能 new，要搭配實作(類別)一起用
        // LinkedList<E> 是 類別（class） / 是一種具體資料結構 / 實作了多個介面，所以符合List / Queue / Stack
        // (因為本身是Deque)
        //
        //
        //
        //
        //
        // LinkedList<String> vs Deque<String>，後者比較好的意思??
        // Deque<String> 通常比較好，而且是「實務上的好」； 前提是你真的在做 Queue / Stack 的事情。
        //
        //
        //
        //
        //
        // 1. 那其實幾乎只用 Deque ，很少用 Stack及 java.util.Queue ??
        // 2. 我可以理解成
        // LinkedList <String >可用方法比 Deque<String> = new LinkedList<>() 還多??
    }

}
