import java.util.Arrays;

public class Array1 {


    public Array1() {
        //        宣告方式
        int[] test1 = {1, 2, 3, 4, 5, 6};
        int[] test2 = new int[]{1, 2, 3, 4, 5};
        int[] test3;
        test3 = new int[]{1, 2, 3, 4, 5};

        int[] test4 = new int[5];
        for (int i = 0; i < test4.length; i++) {
            test4[i] = i + 1;
        }
// Array轉Str
        System.out.println(Arrays.toString(test4));
// Array的迴圈
        for (int ele : test4) {
            System.out.println(ele);
        }

        // 混合物件的宣告
        Object obj = new int[]{1, 2, 3, 4, 5};
        if (obj instanceof int[] ints) {
            System.out.println(123);
            System.out.println(ints[0]);
        }
        Object[] obj2 = new Object[]{1, 2.0, "e"};
        System.out.println(obj2[0]);
        System.out.println(obj2[1]);
        System.out.println(obj2[2]);

        System.out.printf("-".repeat(30) + "%n");
        //        Main m = new Main();
//        int[] frstArr = m.getRandomArray(10);
        int[] firstArr = Main.getRandomArray(10);
        System.out.println(Arrays.toString(firstArr));
        Arrays.sort(firstArr);
        System.out.println(Arrays.toString(firstArr));

        int[] secndArr = new int[10];
        System.out.println(Arrays.toString(secndArr));
        Arrays.fill(secndArr, 2); // 填滿
//        Arrays.fill(secndArr, 15);
        System.out.println(Arrays.toString(secndArr));

        //        淺拷貝
        int[] thirdArr = secndArr;
        System.out.println(Arrays.toString(thirdArr));
        thirdArr[0] = 5;
        System.out.println(Arrays.toString(secndArr));
        System.out.println(Arrays.toString(thirdArr));

        //        深拷貝
//        int[] forthArr = Arrays.copyOf(secndArr, 8);
        int[] forthArr = Arrays.copyOf(secndArr, 15);
//        int[] forthArr = Arrays.copyOf(secndArr, secndArr.length);
        System.out.println(Arrays.toString(forthArr));
        forthArr[0] = 9;
        System.out.println(Arrays.toString(secndArr));
        System.out.println(Arrays.toString(forthArr));

    }


}
