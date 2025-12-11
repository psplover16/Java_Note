package record005;

public class RecordUse {

    public RecordUse() {
//        Record用法
        record005.RecordDemo recordPerson = new record005.RecordDemo("Gary", 30);
//        record005.RecordDemo recordPerson = new record005.RecordDemo("Gary", -5); // 驗證拋出錯誤
        System.out.println(recordPerson.name()); // Gary
        System.out.println(recordPerson.sayHello()); // Hi, I'm Gary
        System.out.println(recordPerson);        // print會呼叫 實例化變數的toString
    }


}
