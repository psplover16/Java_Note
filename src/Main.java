//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //    main為static，不能直接呼叫main非static的函數
    public static void main(String[] args) {
//        ❌ main 是入口點，不是一般邏輯函式
//        ❌ main 裡常常包含啟動流程，不適合作為工具函式
//        ❌ main 通常是程式起始，不是業務邏輯


////        命名與基礎觀念
//        new NamingAndBasicConcepts();
//        new ScannerAndSwitch();
//        new BasicTypeConversion();
////        非常少用
////        systemConsoleTest(); // IDE會報錯
////        字串使用
//        new StringMain();
//
////        封裝（Encapsulation）
//        new Encapsulation();
////        繼承（Inheritance）
//        new Inheritance();
////        多型（Polymorphism）
//        new Polymorphism();
////        組合（Composition）
//        new Composition();
//
////        Record的使用
//        new RecordUse();
////        陣列的使用
//        new ArrDemo1();


//        List的使用


////
//        printLine();
//        new ListDemo1();
//        printLine();
//        new ListAndArr();
//        printLine();
//        new ListChallenge1();
    }


    static void printLine() {
        System.out.printf("-".repeat(40) + "\n");
    }


    static void systemConsoleTest() {
//        非常少用
//        IDE不能用
//        java src/Main.java
        String name = System.console().readLine("Enter your name: ");
        System.out.println("Hello, " + name + "!");
        String age = System.console().readLine("Enter your age: ");
        System.out.println("age: " + age);
        System.out.println("name: " + name);
    }


}