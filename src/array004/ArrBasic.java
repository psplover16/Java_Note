package array004;

import java.util.Arrays;
import java.util.Random;

public class ArrBasic {
    public ArrBasic() {
//        陣列（Array）在「建立」的那一刻，必須決定長度（也就是容量）。一旦建立後，長度就固定不能改變。
//        宣告的方式(宣告時一併賦值)
        int[] test1 = {1, 2, 3, 4, 5, 6}; // 此種寫法僅限於 宣告時
        int[] test2 = new int[]{1, 2, 3, 4, 5};
        int[] test3; // 宣告陣列，不需要長度
        test3 = new int[]{1, 2, 3, 4, 5};
        int[] test4 = new int[5]; // 宣告，並建立一個長度為5的空陣列
        for (int i = 0; i < test4.length; i++) {
            test4[i] = i + 1;
        }

//        Array轉Str
        System.out.println(Arrays.toString(test4));

//        forEach的寫法，可用於 Array / List / Set / Map
        for (int ele : test4) {
//            System.out.println(ele);
        }

//        物件的陣列
        Object obj = new int[]{1, 2, 3, 4, 5};
//        檢查obj的型別，是否為int[]，若檢查成功，(新版寫法，自動建立變數名稱ints)
        if (obj instanceof int[] ints) {
            System.out.println(ints[0]);
        }
//        舊版寫法
        if (obj instanceof int[]) {
            int[] ints = (int[]) obj;   // 必須手動轉型
            System.out.println(ints[0]);
        }


//        物件可容納各種型別，但這樣寫不好
        Object[] obj2 = new Object[]{1, 2.0, "e"};


        int[] firstArr = getRandomArray(10);
        Arrays.sort(firstArr); // 預設是 升冪排序，支援數字類。 char類是看unicode
        Arrays.sort(firstArr, 1, 4); // 排 1,2,3 的位置，將他們 升冪排序


        int[] secndArr = new int[10];
        Arrays.fill(secndArr, 2); // 填滿

//        淺拷貝
        int[] thirdArr = secndArr;
        thirdArr[0] = 5;

//        深拷貝
//        複製前幾個
        int[] forthArr = Arrays.copyOf(secndArr, 15); // 建立一個新陣列，長度為 newLength，內容複製原陣列的 '前'幾格。
//        複製區間
        int[] fiveArr = Arrays.copyOfRange(secndArr, 0, 15); // 建立一個新陣列，內容為 arr[from] 到 arr[to-1]。若 to 超出範圍 → 用預設值補滿，若 from 不合法 → 會噴例外
        forthArr[0] = 9;


        String[] strArr = new String[]{"Gary", "Dainel", "Apple", "Jay"};
        Arrays.sort(strArr);
//        ⼆元搜尋，從中間找，看往前還往後，一直持續
//        陣列 一定要已經排序（Sort），否則結果不正確。
//        回傳 index。 若 index < 0，表示找不到
        int indexBinary = Arrays.binarySearch(strArr, "Gary"); // 找到在排序第幾個index (數字)

//        陣列 值 是否相同，而非記憶體位置， === 是表示記憶體位置
        int[] s1 = new int[]{1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5};
        Boolean arrayContain = Arrays.equals(s1, s2); // true
        System.out.println(s1 == s2); // false


    }


    int[] getRandomArray(int len) {
        int[] arr = new int[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
//            double d = random.nextDouble();
            arr[i] = random.nextInt(100); // 從0~100隨機生成數值
        }
        return arr;
    }


}



