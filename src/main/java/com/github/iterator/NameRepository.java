package com.github.iterator;

public class NameRepository implements Container<String> {
    private Iterator<String> iterator;
    private final String[] names = { "Tom", "Jerry", "Martin", "Joy" };

    @Override
    public Iterator<String> iterator() {
        if (iterator == null)
            iterator = new MyIterator();
        return iterator;
    }

    public final class MyIterator implements Iterator<String> {
        private int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public String next() {
            return names[index++];
        }
    };
}
