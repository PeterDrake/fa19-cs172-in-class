public class NodeExample {

    public static void main(String[] args) {
        Node a = new Node();
        Node b = new Node();
        Node c = new Node();
        a.item = 4;
        a.next = b;
        b.item = 8;
        b.next = c;
        c.item = 5;
        c.next = null; // Not needed
        Node ls = a;
        StdOut.println(lengthIterative(ls));
    }

    static int lengthRecursive(Node n) {
        if (n == null) {
            return 0;
        } else {
            return 1 + lengthRecursive(n.next);
        }
    }

    static int lengthIterative(Node n) {
        int count = 0;
        for (Node here = n; here != null; here = here.next) {
            count++;
        }
        return count;
    }

    static int sumRecursive(Node n) {
        if (n == null) {
            return 0;
        } else {
            return n.item + sumRecursive(n.next);
        }
    }

    static int sumIterative(Node n) {
        int sum = 0;
        for ( ; n != null; n = n.next) {
            sum += n.item;
        }
        return sum;
    }

    public static int maxRecursive(Node n) {
        if (n.next == null) {
            return n.item;
        } else {
           int maxOfRest = maxRecursive(n.next);
           if (n.item > maxOfRest){
               return n.item;
           }else{
               return maxOfRest;
           }
        }
    }

    public static int maxIterative(Node n) {
        int max = n.item;
        for ( ; n != null; n = n.next) {
            if( n.item > max) {
                max = n.item;
            }

        }
        return max;
    }
}
