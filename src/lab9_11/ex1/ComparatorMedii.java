package lab9_11.ex1;

import java.util.Comparator;

public class ComparatorMedii implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}