package list006.challenge;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class IteratorChallenge {
    public IteratorChallenge() {

                LinkedList<Place> placeList = new LinkedList<>();
                Place placeTmp = new Place("a", 100);
                Place placeTmp2 = new Place("b", 300);
                Place placeTmp3 = new Place("c", 50);
                Place placeTmp4 = new Place("a", 910);
//        System.out.println(placeList.toString());
                addList(placeList, placeTmp);
                System.out.println(placeList.toString());
                addList(placeList, placeTmp2);
                System.out.println(placeList.toString());
                addList(placeList, placeTmp3);
                System.out.println(placeList.toString());
                addList(placeList, placeTmp4);
                System.out.println(placeList.toString());
//
                Scanner input = new Scanner(System.in);
//        String aa = input.nextLine();
//        do {
//            System.out.println(aa);
//            aa = input.nextLine();

//        } while (aa.length() > 0);




    }

    public static void addList(LinkedList<Place> placeList, Place newPlace) {
        if (placeList.size() == 0) {
            Place firstPlace = new Place("Sydney", 0);
            placeList.add(firstPlace);
        }

        ListIterator<Place> iterator = placeList.listIterator();

        boolean alreadyJoin = false;

        while (iterator.hasNext()) {
            Place place = iterator.next();

            if (place.name.equalsIgnoreCase(newPlace.name)) {
//                還沒增加過，直接不做事
                if (!alreadyJoin) {
                    return;
                }
//                增加過
                while (iterator.hasPrevious()) {
                    Place previousPlace = iterator.previous();
                    if (previousPlace.equals(newPlace)) {
                        iterator.remove();
                        return;
                    }
                }
            }


            if (place.distance > newPlace.distance && !alreadyJoin) {
                iterator.previous();
                iterator.add(newPlace);
                iterator.next();
                alreadyJoin = true;
            }
            if(!alreadyJoin && !iterator.hasNext()) {
                iterator.add(newPlace);
            }
        }
    }
    public static void linkedList(LinkedList<Place> placeList, Place newPlace) {

    }
}


class Place {
    String name;     // 城市 / 地點名稱
    int distance;    // 距離起點的距離


    public Place(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String toString() {
        // return name + " : " + distance;
        return String.format("%s : %d", name, distance);
    }

}