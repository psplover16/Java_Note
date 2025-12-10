package stringblock003;

public class StringBuilderTest {
    public StringBuilder strBuilder = new StringBuilder("Hello:" + "First word");
    public String str = "Hello:" + "First word";


    public void printStringInfo(StringBuilder strBuilder) {
        System.out.println("strBuilder is:" + strBuilder);
        System.out.println("strBuilder's stringLength':" + strBuilder.length()); // 實際字串內容長度
        System.out.println("strBuilder's bufferSize':" + strBuilder.capacity()); // 內部緩衝(預留)空間
        System.out.println("-".repeat(16));
    }

    public void printStringInfo(String str) {
        System.out.println("String is:" + str);
        System.out.println("String's length':" + str.length());
        System.out.println("-".repeat(16));
    }

    public void stringDiff() {
        printStringInfo(str);
        printStringInfo(strBuilder);
        str.concat("My name is Gary"); // 會回傳(不會操控原本)
        strBuilder.append("My name is Gary"); // 操控原本
        System.out.printf("-".repeat(10) + "\n");
        printStringInfo(str);
        printStringInfo(strBuilder);
    }


    public void stringBuilderTest() {
//        建立一個「空的」可變字串，無初始內容
        StringBuilder strBuilderEmpty = new StringBuilder(); // 0 / 16
//        建立一個以空字串為初始值的 builder，有初始內容，但為0
        StringBuilder strBuilderEmptyString = new StringBuilder(""); // 0 / 16+0
//        建立一個以空字串為初始值的 builder，初始內容為32
        StringBuilder strBuilder32 = new StringBuilder(32);

        printStringInfo(strBuilderEmpty);
        printStringInfo(strBuilderEmptyString);
        printStringInfo(strBuilder32);

        strBuilderEmpty.append("a".repeat(57));
        strBuilderEmptyString.append("a".repeat(17));
        strBuilder32.append("a".repeat(16));

//        buffer 成長規則， 先2倍原始+2，不夠，直接 = n

        printStringInfo(strBuilderEmpty);
        printStringInfo(strBuilderEmptyString);
        printStringInfo(strBuilder32);
    }

    public void stringBuilderMethods() {
        printStringInfo(strBuilder);
//        刪除 從 start（含） 到 end（不含） 的區段字元。 數字>0
        strBuilder.delete(0, 2);
        printStringInfo(strBuilder);

//        刪除單一字元（比 delete 更精準）
        strBuilder.deleteCharAt(0);
        printStringInfo(strBuilder);

//        在指定位置「插入」字串、數字、字元等
        strBuilder.insert(2, "123" + 456);
        printStringInfo(strBuilder);

//        反轉
        strBuilder.reverse();
        printStringInfo(strBuilder);

//        直接設定字串的「長度」。 截短字串 或  讓字串變長（多出來的部分會補 \u0000 也就是 null 字元）
        strBuilder.setLength(6);
        printStringInfo(strBuilder);
    }

}
