public class ArrayStack<T> implements Stack<T> {

    private T[] data;

    private int size;

    public ArrayStack() {
        data = (T[])new Object[1];
    }

    @Override
    public T pop() {
        return data[--size];
    }

    @Override
    public void push(T item) {
        if (size == data.length) {
            T[] newData = (T[])new Object[data.length * 2];
            for (int i = 0; i < size; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
        data[size++] = item;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new ArrayStack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            StdOut.println(s.pop());
        }
    }

}
