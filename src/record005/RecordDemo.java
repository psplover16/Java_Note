package record005;

public record RecordDemo(String name, int age) {
//    Record 用法，也是屬於Class
//    record 是不可變資料類別，全部都是
//    record 有自帶的 constructor、getter，撈取直接 實例化變數.name
//    record = 自動產生 constructor + getter + equals + hashCode + toString 的不可變資料類別。

//    可以新增方法
    public String sayHello() {
        return "Hi, I'm " + name;
    }
//    可以做自訂驗證
    public RecordDemo {
        if (age < 0) throw new IllegalArgumentException("age error");
    }

    @Override
    public String toString() {
        return "record005.RecordDemo{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
