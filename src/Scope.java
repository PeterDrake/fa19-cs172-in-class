public class Scope {

    public static void main(String[] args) {
        int i = 0;
        for (int j = 0; j < 10; j++) {
            int i = 7;
        }
    }
}
