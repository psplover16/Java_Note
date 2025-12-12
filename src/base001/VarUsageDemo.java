package base001;

public class VarUsageDemo {

    public VarUsageDemo() {

        // var：由編譯器根據右邊的值，自動推斷型別
        // 一定要有右值
        // 右邊不能是 null
        // 不能用在 class 成員變數（欄位）
        // 可讀性可能變差（若右邊型別不明確）

        var number = 10; // int
        var text = "Gary"; // String
        var arr = new String[] { "A", "B" }; // String[]

        // var 不能這樣用
        // var x = null; // ❌
        // var arr2 = {"A"}; // ❌

        // 常見搭配泛型（減少重複型別）
        var list = new java.util.ArrayList<String>();
        list.add("Jack");

        // 編譯期就已決定型別，不是動態型別
        // list = new ArrayList<Integer>(); // ❌ 編譯錯誤
    }
}