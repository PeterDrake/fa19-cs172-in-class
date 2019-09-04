public class SpeedReader {

    public static void main(String[] args) {
        while (true) {
            In file = new In("speed.txt");

            while (!file.isEmpty()) {

                String s = file.readLine();

                int i = 0;

                while (i < s.length()) {
                    String w = "";
                    while (i < s.length() && s.charAt(i) != ' ') {
                        w = w + s.charAt(i);
                        i++;
                    }
                    i++;
                    StdDraw.clear();
                    StdDraw.text(0.5, 0.5, w);
                    StdDraw.pause(250);
                }
            }
            StdDraw.pause(500);
        }
    }
}
