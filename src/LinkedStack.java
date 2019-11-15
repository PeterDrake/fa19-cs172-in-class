public class LinkedStack<T> implements Stack<T> {

    public class Node {
        private T item;
        private Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    private Node top;

    @Override
    public T pop() {
        T result = top.item;
        top = top.next;
        return result;
    }

    @Override
    public void push(T item) {
        top = new Node(item, top);
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new LinkedStack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            StdOut.println(s.pop());
        }
    }

}
