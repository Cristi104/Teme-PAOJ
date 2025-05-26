package lab9_11.ex2;

import java.util.Collection;
import java.util.LinkedList;

public class MyList extends LinkedList<Integer> {
    private int totalAdaugate = 0;

    @Override
    public boolean add(Integer e) {
        totalAdaugate++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        totalAdaugate += c.size();
        return super.addAll(c);
    }

    public int getTotalAdaugate() {
        return totalAdaugate;
    }
}
