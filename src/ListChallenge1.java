import java.util.*;

public class ListChallenge1 {
    private Scanner sc = new Scanner(System.in);
    //    private Scanner sc2 = new Scanner(System.in);
    private String noticeText = """
            Available actions:
            0 - to shutdown
            1 - to add an item to list (comma delimited list)
            2 - to remove an item from the list (comma delimited list)
            Enter a number for which action you want to do:
            """;
    private ArrayList<String> strArrList = new ArrayList<>();

    public ListChallenge1() {
        System.out.println(noticeText);
        boolean flag = true;
        while (flag) {
//            int choice = sc.nextInt();
            switch (sc.nextInt()) {
                case 1 -> {
                    sc.nextLine(); // 吃掉換行符號
                    System.out.println("新增物件請用逗號分隔");
                    var tmpAct = sc.nextLine().split(",");

                    for (var ele : tmpAct) {
                        if (!strArrList.contains(ele.trim())) {
                            strArrList.add(ele.trim());
                        }
                    }

                    strArrList.sort(Comparator.naturalOrder());
                }
                case 2 -> {
                    strArrList.remove(strArrList.size() - 1);
                }
                default -> flag = false;
            }
            System.out.println(strArrList);
        }


    }


}
