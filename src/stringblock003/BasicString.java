package stringblock003;

public class BasicString {
    // \n表示斷行
    // 若要把 \n 當成字元使用，要用 \\n
    // Unicode的圓點：\u2022
    // 若要把特殊符號當字串使用，要用 \ 前綴
    //
    public String str1 = "Hello:" + "? First word" + "\n" +
            "\u2022 Unicode的圓點" + "\n" +
            "\u2022 \\n表示斷行" + "\n" +
            "\t \\t表示跳格" + "\n" +
            "\'表示單引號" + "\n" +
            "\"表示雙引號" + "\n" +
            "\\表示反斜線";

    public void printfTest() {
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Formatter.html
        // formater
        // 常用
        System.out.printf("test is %d\n", 35); // %d 用來格式化 整數
        // %s 用來格式化字串，大寫 S 表示轉成大寫字母，小寫 s 則不變，萬用~~可放任合格式，因為會自動轉換成字串
        System.out.printf("test is %s%S\n", "Hello World", "HELLO world");
        System.out.printf("test is %.2f\n", 3.14159); // %f 用來格式化浮點數，float及double都可放，.2 表示小數點後保留兩位，四捨五入
        // %c 用來格式化單一字元，大寫 C 表示轉成大寫字母，小寫 c 則不變
        System.out.printf("test is %c%C\n", 'A', 'a');

        System.out.printf("test is %b%B\n", true, true); // %b 用來格式化布林值
        // %x 用來格式化十六進位整數，小寫 x 表示小寫字母 a~f，大寫 X 表示大寫字母 A~F
        System.out.printf("test is %x%X%n", 255, 255);
        System.out.printf("test is %n"); // %n 用來換行

        System.out.printf("混合使用 %d是%s，%.3f是浮點數\n", 12345, "整數", 3.14159); // %e 用來格式化科學記號
    }

    public void printfTestLoop() {
        for (int i = 0; i < 150; i += 50) {
            // 指定「至少 2 個字元寬度」的整數輸出
            System.out.printf("test is %2s\n", i);
        }
    }

}
