public class Hanoi {

    public static void main(String[] args) {
        hanoi("a","b","c", 3);
    }

    static void hanoi(String start, String spare, String end, int n) {
        if (n==1) {
            StdOut.println(start+"-->"+end);
        }
        else {
            hanoi(start,end,spare, n-1);
            StdOut.println(start+"-->"+end);
            hanoi(spare,start,end, n-1);
        }

    }

}
