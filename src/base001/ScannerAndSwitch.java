package base001;

import java.util.Scanner;

public class ScannerAndSwitch {
    private Scanner sc = new Scanner(System.in);


    public ScannerAndSwitch() {
        switchTest(1);
        scannerTest();
    }

    public int switchTest(int number) {
        switch (number) {
            case 3:
                System.out.println("高級功能");
            case 2:
                System.out.println("中級功能");
            case 1:
                System.out.println("基礎功能");
                break;
            default:
                System.out.println("default error");
//                break表示在此停住
                break;
        }

        switch (number) {
            case 1, 2 -> System.out.println(number);
            default -> System.out.println("default");
        }

        return switch (number) {
            case 1, 2 -> {
                yield 1;
            }
            case 3 -> {
                yield 3;
            }
            default -> {
                yield 0;
            }
        };
    }


    public void scannerTest() {
//        Scanner 的真正工作是 3 件事：
//         ① 讀取字元輸入（input stream）
//         ② 依分隔符切成 token（標記化 tokenizer）
//              分隔符號有 空格 / tab / 換行 / 多個空白也算一次 delimiter
//         ③ 把 token 轉型成你要的資料型別（parsing/型別轉換器）

        var scStr = sc.next();
        System.out.println(scStr);
//        驗證，若是int，則執行~
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.println(n);
        }
        var scNum = sc.nextInt();
        System.out.println(scNum);
//        sc.nextDouble();
//        不吃掉換行~~~~~
//        會跳過空白
//        只讀下一個 token

////        nextLine他是例外
//        sc.nextLine();
////        從目前游標位置開始讀
////        讀到第一個換行符 \n
////        回傳該行字串（不含 \n）


    }


}
