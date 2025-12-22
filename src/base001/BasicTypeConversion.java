package base001;

public class BasicTypeConversion {
//    private 只能在內部使用，外部無法呼叫
//    default 看庫，庫相同即可呼叫
//    protected 子類(不同庫) / 同庫可以呼叫
//    在最頂層只能用private 及 default，設計問題
    public BasicTypeConversion() {
        parseFunc();
        parseNumDanger("123"); // 解析數字要小心
    }

    public static void parseFunc() {
//        若字串不是整數 → NumberFormatException
        int n = Integer.parseInt("123");
//        功能類似 parseInt，但回傳 Integer 物件。
        Integer num = Integer.valueOf("456"); //  System.out.println(num); // 456
        int hex = Integer.parseInt("FF", 16);  // 255

        double d = Double.parseDouble("3.14");
        float f = Float.parseFloat("2.5"); // 常見錯誤字串（例如 "1,234"）會報錯。

//        字串（忽略大小寫）等於 "true" → true，其他都是false
        boolean b = Boolean.parseBoolean("true");  // true

        long numLum = Long.parseLong("123456789");

        short s = Short.parseShort("100");
        byte bNum = Byte.parseByte("5");

//        解析 char（不是 parse，用字串轉型），此處特別
        char c = "A".charAt(0);
    }

    public void parseNumDanger(String input) {
        try {
            int n = Integer.parseInt(input);
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("不是合法的整數");
        }

    }


    void primitiveIntro() {
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

//        primitive 不能直接是 Object，但 Java 會自動裝箱成 wrapper（int → Integer），就變成 Object。
        Object o = 10; // OK（10 → Integer → Object）
//        Object o = (Object) 10; // ❌ int 不能直接 cast 成 Object
    }

    void compileAndRuntime() {
//        Queue<String> queueList = new LinkedList<>();
//        int[] a = new int[5];
//        Animal dog = new Dog();

//        以上三者，左邊都是編譯期型別（Compile - time Type），編譯器在「編譯時期」用來檢查你能不能這樣寫程式的型別
//        右邊則是 執行期型別（Runtime Type），程式跑起來後，記憶體中「真正存在的物件型別」，實際執行哪個版本的方法

//        左邊其實是限制器、是規則，用來限制與規定右邊的方法
//        對應的正式版本是：
//        左邊（編譯期型別）定義「我允許你使用哪些方法」
//        右邊（執行期型別）決定「實際執行哪一個實作」

    }


}
