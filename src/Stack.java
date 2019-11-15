public interface Stack<T> {

    /** Remove and return the top item from this stack. */
    public T pop();

    /** Add item to the top of this stack. */
    public void push(T item);

    /** Returns true if this stack is empty. */
    public boolean isEmpty();

}
