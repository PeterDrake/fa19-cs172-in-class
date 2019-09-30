public class Shuffler {

    static void shuffle(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            int j = StdRandom.uniform(i + 1);
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3};
        shuffle(a);
        StdOut.println(java.util.Arrays.toString(a));
    }

}
