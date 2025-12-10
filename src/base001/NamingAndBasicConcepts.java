package base001;

public class NamingAndBasicConcepts {
//    命名規則與基礎
//    Class	大駝峰
//    Interface	大駝峰
//    Method	小駝峰
//    Variable	小駝峰
//    Constant	UPPER_SNAKE_CASE	MAX_SIZE
//    Enum	大駝峰 + enum values ALL_CAPS	Status.OK
//    Package	全小寫、反向網域	com.gary.project
//    Generic Type	單一大寫字母	T, E, K

    public NamingAndBasicConcepts() {
//      static
        bitTest();
//      因為method沒有 static ，所以需要創建
        NamingAndBasicConcepts newNamingAndBasicConcepts = new NamingAndBasicConcepts();
        newNamingAndBasicConcepts.byteTest();
//        同一個 class可以直接引用
        byteTest();

        shortTest();
        intTest();
        longTest();
        multipleDeclare();

        floatTest();
        doubleTest();

        charTest();

        operationTest();
    }

    public static void bitTest() {
        System.out.println("static，方法及變數屬於class本身，而不屬於物件，所以引用時，不需要創建，new");
        System.out.println("1個bit表示一個0與1控制");
        System.out.println("JAVA原始型別： bit / short / int / long / float / double / char / boolean");
        System.out.println("String 屬於 JAVA內建的 class，但把它當成原始型別使用沒啥太大問題");
        System.out.println("要考慮溢出及下溢");
    }

    void byteTest() {
        byte minVal = Byte.MIN_VALUE;
        byte maxVal = Byte.MAX_VALUE;
        System.out.println("1個byte表示一個位元組");
        System.out.println("Byte最小值:" + minVal + ",最大值:" + maxVal);
        System.out.println("Byte長度，bit數量:" + Byte.SIZE);
    }

    static void shortTest() {
        short minVal = Short.MIN_VALUE;
        short maxVal = Short.MAX_VALUE;
        System.out.println("short最小值:" + minVal + ",最大值:" + maxVal);
        System.out.println("short長度，bit數量:" + Short.SIZE);
    }

    static void intTest() {
        int minVal = Integer.MIN_VALUE;
        int maxVal = Integer.MAX_VALUE;
        System.out.println("整數，JAVA預設的數字型別");
        System.out.println("大數字時，利用_來方便閱讀，禁止使用," + 1_00_00_00);
        System.out.println("int最小值:" + minVal + ",最大值:" + maxVal);
        System.out.println("int長度，bit數量:" + Integer.SIZE);
    }

    static void longTest() {
        long minVal = Long.MIN_VALUE;
        long maxVal = Long.MAX_VALUE;

        long x = 100; // 把int轉成long塞入
        long y = 100L; // 直接long塞入
        System.out.println(x + "," + y);
//        小轉大輕鬆，大轉小可能會有問題

        System.out.println("long最小值:" + minVal + ",最大值:" + maxVal);
        System.out.println("long長度，bit數量:" + Long.SIZE);
    }

    static void multipleDeclare() {
        int x = 5, y = 6;
//        int x = 5, byte y = 6; // 多重宣告要同型別
//        int x=5 , int y=6; // 多重宣告限定 , 且不用多個型別
        System.out.println("x :" + x + ",y:" + y);
    }

    static void floatTest() {
        float minVal = Float.MIN_VALUE;
        float maxVal = Float.MAX_VALUE;
        System.out.println("float最小值:" + minVal + ",最大值:" + maxVal);
        System.out.println("E-10，10的-10次方");
        System.out.println("float長度，bit數量:" + Float.SIZE);
        System.out.println("float的長度與int一致，但可容納的數值更多，但精度差很多，盡量別使用");
    }

    static void doubleTest() {
        double minVal = Double.MIN_VALUE;
        double maxVal = Double.MAX_VALUE;
        System.out.println("double最小值:" + minVal + ",最大值:" + maxVal);
        System.out.println("double長度，bit數量:" + Double.SIZE);
        System.out.println("預設小數是double");

//        float a = 1.5; // 預設是double，大無法塞小
        float a = 1.5f; // 直接指定型態

        double b = 1.5; // 小數偵測預設是double
        double c = 5; // 5 預設是整數，但double會把int轉換成double
        double d = 5d; // 直接輸入 double
    }

    static void charTest() {
        System.out.println("char大小，" + Character.SIZE);
        System.out.println("使用 '' 放入單字符，字串String 才用 \"\" ");
//        https://symbl.cc/en/unicode-table/     //  字元表
        char aD = 'D';
        char bD = '\u0044';  // Unicode 的十六進位編碼
        char cD = 68; // 十進位
        System.out.println("aD，" + aD + ",bD:" + bD + ",cD:" + cD);
    }

    static void operationTest() {
//        內建類別，但其實可以把它當成基礎型別使用
//        string 只有字串相加
        String a = "a" + 123;
        System.out.println("a:" + a);

//        有一個為浮點數，會自動轉換
        System.out.println("5 % 2 = " + 5 % 2); // 1
        System.out.println("5 % 2.0 = " + 5 % 2.0); // 1.0

//        字元算數，因為會把字元轉成數字存入記憶體
        char x = 'a', y = 'b';
        System.out.println("(int) x：" + (int) x); // 97   \u0061
        System.out.println("(int) y：" + (int) y); // 98   \u0062

        System.out.println("+：" + (x + y)); // 195
        System.out.println("-：" + (x - y)); // -1
        System.out.println("*：" + (x * y)); // 9506
        System.out.println("/：" + (x / y)); // 0

        float floatTestA = 5f % 2; // 1.0
        float floatTestD = 5 % 2f; // 1.0
        float floatTestG = 5 % 2.0f; // 1.0
//        float floatTestB = 5f%2d; // 錯誤
//        float floatTestC = 5d%2; // 錯誤
//        float floatTestE = 5%2d; // 錯誤
//        float floatTestF = 5%2.0; // 錯誤，要double才對


        int intTest = 5;
        System.out.println("intTest測試環節");
        System.out.println(intTest); //5
        intTest++; // 先使用變數的值，再把變數 +1。
        System.out.println(intTest); //6
        intTest += 1;
        System.out.println(intTest); //7
        System.out.println(intTest += 1); // 8

        System.out.println(intTest++); // 8  // 先使用 intTest，在加1
        System.out.println(++intTest); // 10 先加，再用

// 複合指定運算子（+=、-=、*=、/=）會自動幫你做強制轉型。

        intTest += 5.5;
        System.out.println(intTest); // 15，會截斷小數位

        int intTestB = 5;
//        intTestB = intTestB + 5.5; // 會有錯誤 因為他是  intTestB 指定小數
    }

}
