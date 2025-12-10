package stringblock003;

public class StringMethods {
    String testStr1 = "Hello, World! 2024-06-15 is a great day. psplover16@example.com #Java_Programming";

    public void demonstrateStringMethods() {
        // 判斷是否包含某字串，字串查詢字串
        boolean containsJava = testStr1.contains("Java");
        System.out.printf("Contains 'Java': %b%n", containsJava); // true

        // 判斷內容是否相等，比較「字串」與「其他字元序列」是否有相同內容
        // 字串.contentEquals(其他字元序列)
        boolean contentEquals = testStr1.contentEquals(testStr1);
        // String / StringBuilder / Buffer / CharSequence
        StringBuilder sb = new StringBuilder("123456");
        System.out.printf("Content Equals: %b%n", testStr1.contentEquals(sb)); // true
        System.out.printf("Content Equals: %b%n", contentEquals); // true

        // 判斷內容是否相等（區分大小寫）
        // 字串.equals(其他字元序列)
        boolean equals = testStr1
                .equals("hello, world! 2024-06-15 is a great day. psplover16@example.com #Java_Programming");
        System.out.printf("Equals: %b%n", equals); // false
        System.out.printf("Equals: %b%n", testStr1.equals(sb)); // false

        // 判斷是否包含某字串（區分大小寫）
        boolean equalsIgnoreCase = testStr1.equalsIgnoreCase("hello, world! 2024-06-15 IS A GREAT DAY.");
        System.out.printf("Equals Ignore Case: %b%n", equalsIgnoreCase); // true

        // 字串開頭是否為某字串
        boolean startsWithHello = testStr1.startsWith("Hello");
        System.out.printf("Starts With 'Hello': %b%n", startsWithHello); // true

        // 字串結尾是否為某字串
        boolean endsWithProgramming = testStr1.endsWith("Programming");
        System.out.printf("Ends With 'Programming': %b%n", endsWithProgramming); // false

        // 用來比較「字串部分區域」是否相等，有兩種方法
        // s1.regionMatches(
        // // toffset, // s1 的起始位置
        // // s2, // 要比較的另一個字串
        // // ooffset, // s2 的起始位置
        // // len // 要比較的長度
        // )
        boolean regionMatches = testStr1.regionMatches(0, "Hello", 0, 5);
        System.out.printf("Region Matches: %b%n", regionMatches); // true

        // regionMatches(
        // // ignoreCase, // 要不要忽略大小寫？
        // // toffset, // 本字串的起始位置（開始比對的位置）
        // // other, // 要比較的另一個字串
        // // ooffset, // 另一個字串的起始位置
        // // len // 要比較的長度（比幾個字）
        // )
        boolean regionMatchesIgnoreCase = testStr1.regionMatches(false, 0, "hello", 0, 5);
        System.out.printf("Region Matches Ignore Case: %b%n", regionMatchesIgnoreCase); // false
    }

    public void unusedMethod() {
        // 字串長度
        int length = testStr1.length();
        System.out.printf("Length: %d%n", length);

        // 字元取值，序列號多少的字元
        char charAt5 = testStr1.charAt(5);
        System.out.printf("Character at index 5: %c%n", charAt5);

        // 搜尋字串或字元在序列號多少，沒有找到回傳 -1
        int indexOfWorld = testStr1.indexOf("World");
        System.out.printf("Index of 'World': %d%n", indexOfWorld);

        // 從後面開始搜尋字串或字元在序列號多少，沒有找到回傳 -1
        // int lastIndexOfJava = testStr1.lastIndexOf("Java");
        int lastIndexOfJava = testStr1.lastIndexOf('J'); // Using char overload
        System.out.printf("Last index of 'Java': %d%n", lastIndexOfJava);

        // 判斷是否為空字串
        boolean isEmpty = testStr1.isEmpty();
        System.out.printf("Is empty: %b%n", isEmpty); // false
        System.out.printf("Is empty: %b%n", "".isEmpty()); // true

        // 判斷是否為空白字串
        boolean isBlank = testStr1.isBlank();
        System.out.printf("Is blank: %b%n", isBlank); // false
        System.out.printf("Is blank: %b%n", "  \t\n ".isBlank()); // true

        // 轉成大寫
        String upperStr = testStr1.toUpperCase();
        System.out.printf("Uppercase: %s%n", upperStr);

        // 轉成小寫
        String lowerStr = testStr1.toLowerCase();
        System.out.printf("Lowercase: %s%n", lowerStr);

    }

    public void trimGroup() {
        // 字串縮排 增加/最多移除 幾個空白
        System.out.printf("Indented String: %s%n", testStr1.indent(0));
        System.out.printf("Indented String: %s%n", testStr1.indent(8));
        System.out.printf("Indented String: %s%n", testStr1.indent(-8));

        String fullWidthSpaceString = "\u3000hello\u3000";
        // 去除前後空白，只處理前後的空白字元" "，全型空白不處理
        String trimmedStr = testStr1.trim();
        System.out.printf("Trimmed String: '%s'%n", trimmedStr);
        System.out.printf("Trimmed String: '%s'%n", fullWidthSpaceString.trim()); // 全型空白不處理

        // 移除「前後」所有 Unicode 空白
        String strippedStr = testStr1.strip();
        System.out.printf("Stripped String: '%s'%n", strippedStr);
        System.out.printf("Stripped String: '%s'%n", fullWidthSpaceString.strip()); // 全型空白也會被移除

        // 移除「前面」所有 Unicode 空白
        String strippedLeading = testStr1.stripLeading();
        System.out.printf("Stripped Leading: '%s'%n", strippedLeading);
        System.out.printf("Stripped Leading: '%s'%n", fullWidthSpaceString.stripLeading()); // 全型空白也會被移除

        // 移除「後面」所有 Unicode 空白
        String strippedTrailing = testStr1.stripTrailing();
        System.out.printf("Stripped Trailing: '%s'%n", strippedTrailing);
        System.out.printf("Stripped Trailing: '%s'%n", fullWidthSpaceString.stripTrailing()); // 全型空白也會被移除
    }

    public void stringConcatGroup() {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "2024";

        String result = str1 + " " + str2 + " " + str3;
        result = str1.concat(str2).concat(str3); // concat 方法用來連接字串
        System.out.printf("Concatenated String: %s%n", result); // HelloWorld2024
        // join 方法可以用來連接多個字串，並在它們之間插入指定的分隔符號
        result = String.join("!", str1, str2, str3); // 使用 ! 作為分隔符號
        System.out.printf("Concatenated String: %s%n", result); // Hello!World!2024

        // 取代字串，取代所有出現的字串，不使用正規表達式
        String replacedStr = testStr1.replace("great", "wonderful");
        System.out.printf("Replaced String: %s%n", replacedStr);

        // 取代字串，取代所有出現的字串，使用正規表達式
        String replacedAllStr = testStr1.replaceAll("great", "wonderful");
        System.out.printf("Replaced All String: %s%n", replacedAllStr);

        // 取代字串，取代第一個出現的字串，使用正規表達式
        String replacedFirstStr = testStr1.replaceFirst("a", "one");
        System.out.printf("Replaced First String: %s%n", replacedFirstStr);

        // 取子字串，從序列號開始到結束，回傳 String
        String subStr = testStr1.substring(7, 12); // 從序列號 7 開始到 12（不包含 12）,end不填寫則到結束
        System.out.printf("Substring (7 to 12): %s%n", subStr);

        // 取子字元序列，從序列號開始到結束，回傳 CharSequence，可轉成 String
        // CharSequence，是一個介面，String 有實作這個介面。 用途是可以接受多種不同的字元序列類型。陣列、字串、字元序列都可以使用。
        // 例如 StringBuilder、StringBuffer 也實作了 CharSequence。
        // 所以這個方法回傳 CharSequence，可以讓你更靈活地處理不同類型的字元序列。
        // 與 string 差別在於，string 是具體的字串類型，而 CharSequence 是一個更抽象的字元序列介面。
        CharSequence subSeq2 = testStr1.subSequence(7, 12); // 從序列號 7 開始到 12（不包含 12）
        System.out.printf("Subsequence (7 to 12): %s%n", subSeq2.toString());

        // repeat 方法可以用來重複字串指定次數，然後將這些重複的字串連接起來形成一個新的字串
        String repeatedStr = str1.concat("-").repeat(3); // 重複 3 次
        System.out.printf("Repeated String: %s%n", repeatedStr); // HelloHelloHello

    }

}