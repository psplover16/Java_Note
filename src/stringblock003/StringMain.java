package stringblock003;

public class StringMain {
    public StringMain () {
        BasicString bs = new BasicString();
        // System.out.println(bs.str1); // 呼叫 strTest1 以示範 System.out.printf 的 %d 用法
        // bs.printfTest();
        // bs.printfTestLoop();

        StringMethods sm = new StringMethods();
        // sm.demonstrateStringMethods();
        // sm.unusedMethod();
        // sm.trimGroup();
//        sm.stringConcatGroup();

        StringBuilderTest sbt = new StringBuilderTest();
//        sbt.stringDiff();
//        sbt.stringBuilderTest();
        sbt.stringBuilderMethods();
    }

}
