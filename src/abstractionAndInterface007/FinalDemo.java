package abstractionAndInterface007;

public class FinalDemo {
//    final，不可變（類，不能被繼承 / 方法，不能被覆寫 / 變數，不能修改）
//    final 的語意是「我明確決定這個值是什麼」，所以一定要至少賦值一次
    public FinalDemo() {
        var test1 = new finalDemo1("finalTest1", 2);
        System.out.println(test1.toString());

        var test2 = new finalDemo2(2, 3);
        test2.run();

        var test3 = new finalDemo3(3, 4);
        test3.walk();
        test3.jump();
    }

    //    放在在class當作修飾符，表示不可繼承
    final class finalDemo1 {
        public String name;
        //        protected int age; // 由於不可繼承，所以不建議用protected
        private int age;

        finalDemo1(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("name=%s, age=%d", name, age);
        }
    }

    class finalDemo2 {
        final int x = 10;
        int y;
        final int z;
        public static final int MAX_USERS = 100; // 屬於類別且final只能賦予一次，在class載入，就被賦值，任何地方都無法更改

        finalDemo2(int y, int z) {
//            this.x = x; // 因為final，所以只能被賦予一次值
//            this.y = y;
            this.z = z;
            System.out.println(MAX_USERS);
        }

        final void run() {
            System.out.println(getClass().getSimpleName() + "Run");
        }

        final void walk() {
            System.out.println(getClass().getSimpleName() + " walk");
        }

        void jump() {
            System.out.println(getClass().getSimpleName() + "jump");
        }
        @Override
        public String toString() {
            return String.format("x=%d, y=%d, z=%d", x, y, z);
        }
    }

    final class finalClass {
        public void help() {
            System.out.println("不能被繼承");
        }
    }

    class finalDemo3 extends finalDemo2 {
        finalDemo3(int y, int z) {
            super(y, z);
        }


        @Override
        void jump() { // override不可權限變小
            super.jump();
            System.out.println("jumpDemo3");
        }
    }

}
