package Z1;

import java.time.LocalDate;
import java.util.LinkedList;

public class zad1 {


    public static <E extends LinkedList<?>> LinkedList redukuj(E list, int n) {
        for (int i = n - 1; i< list.size();i = i + n -1){
            list.remove(i);
        }
        return list;
    }

    public static void main(String[] args){
        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        System.out.println(redukuj(intList, 2));

        LinkedList<LocalDate> dateList = new LinkedList<>();
        dateList.add(LocalDate.of(2001,1,3));
        dateList.add(LocalDate.of(2003,3,11));
        dateList.add(LocalDate.of(2002,5,23));
        dateList.add(LocalDate.of(2000,10,7));
        dateList.add(LocalDate.of(2004,5,6));
        System.out.println(redukuj(dateList,2));

    }

}
