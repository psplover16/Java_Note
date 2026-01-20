package abstractionAndInterface007.InterfacePackage; // 將此檔案定義的所有 class / interface，屬於這個命名空間（package）」

public class InterfaceGenericDemo {
    // 1. 設計一個「可追蹤、可執行任務的載具系統」
    // 2. 不同載具執行的任務型別不同（泛型），且部分行為由 abstract class 提供，部分由 interface 提供。

    public InterfaceGenericDemo() {
        Vehicle v1 = new Drone("D-01");
        v1.start();
        v1.move();
//        編譯器只問一件事，「TaskExecutable<String> 裡，有沒有 executeTask(String)？」
//        v1.executeTask("Photo Survey"); // 由於 Vehicle沒有executeTask，所以不能用

//        執行期，會呼叫實際物件的方法
//        把v1 當成 TaskExecutable<String>來用
        TaskExecutable<String> droneTask = (TaskExecutable<String>) v1;
        droneTask.executeTask("Photo Survey");

        AirVehicle<Integer> jet = new FighterJet("F-99");
        jet.executeTask(777);
        jet.track();

        TaskExecutable.commonRule();
    }

}

// 任務能力，T表示任務型別
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

// 載具基礎行為
abstract class Vehicle {
    protected String id;

    protected Vehicle(String id) {
        this.id = id;
    }

    protected abstract void move();

    //    concrete 方法：共同行為，繼承體系的共用邏輯
    public void start() {
        System.out.println("Vehicle " + id + " started");
    }
}

// 追蹤能力
interface Trackable {
    void track();

    default void logTrack() {
        System.out.println("Tracking log saved");
    }
}

// 抽象子類：空中載具
abstract class AirVehicle<T> extends Vehicle implements TaskExecutable<T>, Trackable {
    public AirVehicle(String id) {
        super(id);
    }

    @Override
    protected void move() {
        System.out.println("AirVehicle is moving");
    }
}

// 具體類別，無人機
class Drone extends AirVehicle<String> {
    public Drone(String id) {
        super(id);
    }

    @Override
    public void executeTask(String task) {
        beforeTask(); // 出自TaskExecutable
        System.out.println("Drone executing task: " + task);
    }

    @Override
    public void track() {
        System.out.println("Drone tracking position");
//        Trackable.super.logTrack(); // super僅限上一層，所以 Trackable 要在 Drone implement才可以用這段
        logTrack();
    }
}

// 具體類別：戰機（任務是 Integer）
class FighterJet extends AirVehicle<Integer> {

    public FighterJet(String id) {
        super(id);
    }

    @Override
    public void executeTask(Integer taskCode) {
        beforeTask();
        System.out.println("FighterJet executing mission code: " + taskCode);
    }

    @Override
    public void track() {
        System.out.println("FighterJet tracking radar");
    }
}