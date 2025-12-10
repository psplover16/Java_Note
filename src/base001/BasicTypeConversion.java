package base001;

public class BasicTypeConversion {
//    private 只能在內部使用，外部無法呼叫
//    default 看庫，庫相同即可呼叫
//    protected 子類(不同庫) / 同庫可以呼叫

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
        } catch (NumberFormatException e) {
            System.out.println("不是合法的整數");
        }

////        scanner有專門用法
//        if (scanner.hasNextInt()) {
//            int n = scanner.nextInt();
//        }
    }


}
