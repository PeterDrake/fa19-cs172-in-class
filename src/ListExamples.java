import java.util.ArrayList;

public class ListExamples {

    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<Double>();
        list.add(3.0);
        list.add(8.0);
        StdOut.println(list);
        StdOut.println(list.contains(5));
        StdOut.println(list.indexOf(5));
        StdOut.println(list.size());
        for (Double i : list) {
            StdOut.println(i + " is in the list");
        }
        list.remove(3.0);
        StdOut.println(list);
    }

}
