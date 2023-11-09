public class MyHashMap {
    private static final int INITIAL_CAPACITY = 16;
    private Entry[] table;
    private int size;

    public MyHashMap() {
        table = new Entry[INITIAL_CAPACITY];
        size = 0;
    }

    public void put(Object key, Object value) {
        if (key == null) {
            putNullKey(value);
            return;
        }

        int index = getIndex(key);
        Entry entry = table[index];

        if (entry == null) {
            table[index] = new Entry(key, value);
            size++;
        } else {
            Entry prev = null;
            while (entry != null) {
                if (entry.key.equals(key)) {
                    entry.value = value;
                    return;
                }
                prev = entry;
                entry = entry.next;
            }
            prev.next = new Entry(key, value);
            size++;
        }
    }

    private void putNullKey(Object value) {
        int index = 0;
        Entry entry = table[index];

        if (entry == null) {
            table[index] = new Entry(null, value);
            size++;
        } else {
            Entry prev = null;
            while (entry != null) {
                if (entry.key == null) {
                    entry.value = value;
                    return;
                }
                prev = entry;
                entry = entry.next;
            }
            prev.next = new Entry(null, value);
            size++;
        }
    }

    public Object get(Object key) {
        if (key == null) {
            return getNullKey();
        }

        int index = getIndex(key);
        Entry entry = table[index];

        while (entry != null) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
            entry = entry.next;
        }

        return null;
    }

    private Object getNullKey() {
        Entry entry = table[0];

        while (entry != null) {
            if (entry.key == null) {
                return entry.value;
            }
            entry = entry.next;
        }

        return null;
    }

    public void remove(Object key) {
        if (key == null) {
            removeNullKey();
            return;
        }

        int index = getIndex(key);
        Entry entry = table[index];
        Entry prev = null;

        while (entry != null) {
            if (entry.key.equals(key)) {
                if (prev == null) {
                    table[index] = entry.next;
                } else {
                    prev.next = entry.next;
                }
                size--;
                return;
            }
            prev = entry;
            entry = entry.next;
        }
    }

    private void removeNullKey() {
        Entry entry = table[0];
        Entry prev = null;

        while (entry != null) {
            if (entry.key == null) {
                if (prev == null) {
                    table[0] = entry.next;
                } else {
                    prev.next = entry.next;
                }
                size--;
                return;
            }
            prev = entry;
            entry = entry.next;
        }
    }

    public void clear() {
        for (int i = 0; i < table.length; i++) {
            table[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    private int getIndex(Object key) {
        return key.hashCode() % table.length;
    }

    private static class Entry {
        Object key;
        Object value;
        Entry next;

        Entry(Object key, Object value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
}
