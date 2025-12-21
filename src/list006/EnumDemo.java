package list006;

public class EnumDemo {
    public EnumDemo() {
        Weak sunday = Weak.SUNDAY; // SUNDAY
//        System.out.println(sunday);
        String sundayStr = sunday.name(); // 列舉常數的名稱
//        System.out.println(sundayStr);
        int sundayInt = sunday.ordinal(); // 定義順序的 index，不建議使用
//        System.out.println(sundayInt);
        Weak[] weak = Weak.values(); // 將enum包裝成Array
        for (Weak ele : weak) {
            System.out.println(ele);
            System.out.println(ele.getDollar());
            System.out.println(ele.getIsWork());
        }


    }


    enum Weak {
        SUNDAY(0, false),
        MONDAY(1, true),
        TUESDAY(2, true),
        WEDNESDAY(),
        THURSDAY,
        FRIDAY,
        SATURDAY;

        //        enum的實例只能在enum裡被建立
//        final表示只能被賦值一次，所以與enum是標配
        private final int dollar;
        private final boolean isWork;

        Weak(int dollar, boolean isWork) {
            this.dollar = dollar;
            this.isWork = isWork;
        }

        Weak() {
            this(0, false);
        }

        public int getDollar() {
            return dollar;
        }

        public boolean getIsWork() {
            return isWork;
        }

    }

}
