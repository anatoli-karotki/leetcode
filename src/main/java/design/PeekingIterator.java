package design;

import java.util.Iterator;

public class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    private Integer cache;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
        cache = iterator.next();
    }

    public Integer peek() {
        return cache;
    }

    @Override
    public Integer next() {
        int output = cache;
        cache = iterator.hasNext() ? iterator.next() : null;
        return output;
    }

    @Override
    public boolean hasNext() {
        return cache != null;
    }
}
