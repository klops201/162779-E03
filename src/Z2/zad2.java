package Z2;

import java.time.LocalTime;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class zad2 {
    public static void main(String[] args){
        LinkedHashSet<Integer> intSet = new LinkedHashSet<>();
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        przedostatni(intSet);
        System.out.println(intSet);

        LinkedHashSet<String> strSet = new LinkedHashSet<>();
        strSet.add("a");
        strSet.add("b");
        strSet.add("c");
        strSet.add("d");
        strSet.add("e");
        przedostatni(strSet);
        System.out.println(strSet);

        LinkedHashSet<LocalTime> timeSet = new LinkedHashSet<>();
        timeSet.add(LocalTime.of(12,44));
        timeSet.add(LocalTime.of(23, 55));
        timeSet.add(LocalTime.of(10,13));
        timeSet.add(LocalTime.of(12,0));
        timeSet.add(LocalTime.of(17,34));
        przedostatni(timeSet);
        System.out.println(timeSet);


    }

    public static <T> void przedostatni(LinkedHashSet<T> set){
        Iterator<T> iter = set.iterator();
        T toRemove = null;
        T element;
        int i = 0;

        while(iter.hasNext()){
            element = iter.next();
            if(i == set.size() - 2){

                toRemove = element;
            }
            i++;
        }
        set.remove(toRemove);
    }

}
