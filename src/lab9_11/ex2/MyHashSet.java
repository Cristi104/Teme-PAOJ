package lab9_11.ex2;

import java.util.HashSet;
import java.util.Collection;

public class MyHashSet extends HashSet<Integer> {
    private int totalAdaugate = 0;

    @Override
    public boolean add(Integer e) {
        boolean added = super.add(e);
        if (added) totalAdaugate++;
        return added;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        int before = this.size();
        boolean changed = super.addAll(c);
        int addedNow = this.size() - before;
        totalAdaugate += addedNow;
        return changed;
    }

    public int getTotalAdaugate() {
        return totalAdaugate;
    }
}