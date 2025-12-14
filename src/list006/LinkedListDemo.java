package list006;

public class LinkedListDemo {

public LinkedListDemo() {
//    arrayList
//    add()	// 加到尾端
//    remove()	// 移除指定 index  或元素
//
//
//    Stack（LIFO）用的方法（來自 Deque）
//    push(e)	壓入堆疊（放在最前面）
//    pop()	彈出堆疊（拿最前面）
//    peek()	看頂端（不移除）
//
//
//    Queue（FIFO）用的方法，入列在後端，出列在前端
//            加到尾端
//    add(e)	入列	丟 exception
//    offer(e)	入列	回傳 false--------------
//            ----------------------------------------------------------------以上後端，以下前端
//    remove()	出列	丟 exception
//    poll()	出列	回傳 null-------------
//            element()	看頭	丟 exception
//    peek()	看頭	回傳 null
//
//
//    java.util.Deque（雙端佇列）的方法-------------------官方明確表示取代Stack比較好
//    addFirst(e)	從前端加
//    addLast(e)	從尾端加
//    removeFirst()	從前端拿
//    removeLast()
//    peekFirst()
//    peekLast()
//
//
//
//    Queue<E> 是介面，定義規則，表示 我現在要用的是『Queue 的行為，本身 不能 new，要搭配實作(類別)一起用
//    LinkedList<E> 是 類別（class） / 是一種具體資料結構 / 實作了多個介面，所以符合List / Queue / Stack  (因為本身是Deque)
//
//
//
//
//
//    LinkedList<String> vs  Deque<String>，後者比較好的意思??
//            Deque<String> 通常比較好，而且是「實務上的好」； 前提是你真的在做 Queue / Stack 的事情。
//
//
//
//
//
//    1. 那其實幾乎只用 Deque ，很少用 Stack及 java.util.Queue ??
//            2. 我可以理解成
//    LinkedList <String >可用方法比 Deque<String> = new  LinkedList<>() 還多??
}


}
