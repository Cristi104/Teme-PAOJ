package lab9_11.ex2;

import java.util.*;

public class main {
    public static void main(String[] args) {
        MyHashSet set = new MyHashSet();
        set.add(1);
        set.add(2);
        set.add(2);

        set.addAll(Arrays.asList(2, 3, 4, 4));

        System.out.println(set);
        System.out.println("nr total de elemente adaugate: " + set.getTotalAdaugate());

        MyList list = new MyList();
        list.add(1);
        list.add(2);
        list.add(2);
        list.addAll(Arrays.asList(3, 4, 4));

        System.out.println(list);
        System.out.println("nr total de elemente adaugate: " + list.getTotalAdaugate());
    }
}
