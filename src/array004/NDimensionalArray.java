package array004;

import java.util.Arrays;

public class NDimensionalArray {
    //    多維陣列
    public NDimensionalArray() {

        // ===============================
        // I. 二維陣列初始化（正確寫法）
        // ===============================

        int[][] arr2D;   // 僅宣告 → arr2D 是 null，還沒有任何空間

        // 若需要手動指定第二維內容，就必須 new 第一維
        arr2D = new int[1][];             // 第一維長度 = 1
        arr2D[0] = new int[]{1, 2, 3};    // 第二維直接給資料（不規則陣列）


        // ===============================
        // II. Object[]：可以裝任何 Object
        // ===============================

        Object[] objArr = new Object[3];

        objArr[0] = new String[]{"x", "y", "z"};  // String[] 是 Object
        objArr[1] = new String[]{"a", "b", "c"};  // 再放一個 String[]
        objArr[2] = new int[2][2][2];             // int[][][] 也是 Object
//        objArr[2] = new int[]{1, 2, 3}; // 這樣寫沒錯，會出錯是後續轉型的問題會出錯，因為int[] 是 Object，但 int[] 不是 Object[]，所以不能轉型成 Object[]


        // ===============================
        // III. 安全印出：使用 deepToString()
        // ===============================

        for (Object element : objArr) {
//            取得 element 的實際型別（runtime type），並印出它的類別名稱。
            System.out.println(element.getClass().getSimpleName());


            // 所有陣列都是 Object 的子類別
            // 但 deepToString 需要 Object[]，因此必須做「安全轉型」
            // 注意：多維陣列本質上是 Object[]，可以成功轉型
            Object[] castedArray = (Object[]) element;

            System.out.println(Arrays.deepToString(castedArray));
        }
    }
}
