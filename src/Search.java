public class Search {

    /** Returns the index within a of the first appearance of key, or -1 if key does not appear. */
    public static int indexOf(int key, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        StdOut.println("abc".compareTo("abcd"));
        StdOut.println(Integer.MAX_VALUE);
    }
}
