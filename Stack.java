import java.util.Arrays;

public class Stack<T> {
    private Object[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public Stack() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void push(T item) {
        if (size == array.length) {
            ensureCapacity();
        }
        array[size++] = item;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía.");
        }
        @SuppressWarnings("unchecked")
        T item = (T) array[--size];
        array[size] = null; // Liberar referencia
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía.");
        }
        @SuppressWarnings("unchecked")
        T item = (T) array[size - 1];
        return item;
    }

    private void ensureCapacity() {
        int newCapacity = array.length * 2;
        array = Arrays.copyOf(array, newCapacity);
    }
}
