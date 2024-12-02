package n05_data_structures;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

public class CustomFIFOQueue<T> implements Queue<T> {
    private CustomFIFOQueueElement<T> head;
    private CustomFIFOQueueElement<T> tail;
    private int size;

    public CustomFIFOQueue() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (T v : this) {
            if (o.equals(v)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private CustomFIFOQueueElement<T> current = CustomFIFOQueue.this.tail;

            @Override
            public boolean hasNext() {
                return this.current != null;
            }

            @Override
            public T next() {
                T result = this.current.value;
                this.current = this.current.prev;
                return result;
            }
        };
    }

    @Override
    public T[] toArray() {
        //noinspection unchecked
        return this.toArray((T[]) new Object[this.size]);
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        //noinspection unchecked
        T1[] result = (T1[]) new Object[this.size];
        int i = 0;
        for (T v : this) {
            //noinspection unchecked
            result[i++] = (T1) v;
        }
        return result;
    }

    @Override
    public boolean add(T t) {
        CustomFIFOQueueElement<T> newHead = new CustomFIFOQueueElement<>(this.head, null, t);
        if (this.head == null) {
            this.tail = newHead;
        } else {
            head.prev = newHead;
        }
        this.head = newHead;
        this.size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        CustomFIFOQueueElement<T> current = this.head;
        while (current != null) {
            if (current.value.equals(o)) {
                if (current.prev == null) {
                    this.head = current.next;
                } else {
                    current.prev.next = current.next;
                }
                if (current.next == null) {
                    this.tail = current.prev;
                } else {
                    current.next.prev = current.prev;
                }
                this.size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object o : c) {
            if (!this.contains(o)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        for (T v : c) {
            this.add(v);
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        CustomFIFOQueueElement<T> current = this.head;
        boolean result = false;
        while (current != null) {
            if (c.contains(current.value)) {
                if (current.prev == null) {
                    this.head = current.next;
                } else {
                    current.prev.next = current.next;
                }
                if (current.next == null) {
                    this.tail = current.prev;
                } else {
                    current.next.prev = current.prev;
                }
                this.size--;
                result = true;
            }
            current = current.next;
        }
        return result;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        CustomFIFOQueueElement<T> current = this.head;
        boolean result = false;
        while (current != null) {
            if (!c.contains(current.value)) {
                if (current.prev == null) {
                    this.head = current.next;
                } else {
                    current.prev.next = current.next;
                }
                if (current.next == null) {
                    this.tail = current.prev;
                } else {
                    current.next.prev = current.prev;
                }
                this.size--;
                result = true;
            }
            current = current.next;
        }
        return result;
    }

    @Override
    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public boolean offer(T t) {
        return this.add(t);
    }

    @Override
    public T remove() {
        T result = this.poll();
        if (result == null) {
            throw new NoSuchElementException();
        }
        return result;
    }

    @Override
    public T poll() {
        CustomFIFOQueueElement<T> tmp = this.tail;
        if (tmp == null) {
            return null;
        }
        this.tail.prev.next = null;
        this.tail = this.tail.prev;
        this.size--;
        return tmp.value;
    }

    @Override
    public T element() {
        T result = this.peek();
        if (result == null) {
            throw new NoSuchElementException();
        }
        return result;
    }

    @Override
    public T peek() {
        return this.tail == null ? null : this.tail.value;
    }
}
