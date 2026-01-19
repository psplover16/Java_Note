package abstractionAndInterface007.InterfacePackage;

public class InterfaceGenericDemo {
    // 1. 設計一個「可追蹤、可執行任務的載具系統」
    // 2. 不同載具執行的任務型別不同（泛型），且部分行為由 abstract class 提供，部分由 interface 提供。
}

interface TaskExecutable<T> {
    // public abstract 皆可省略
    void executeTask(T task);

    // default 方法：提供共用行為
    default void beforeTask() {
        System.out.println("任務準備中...");
    }

    // static 方法（與介面本身綁定）
    static void commonRule() {
        System.out.println("所有任務必須記錄");
    }
}