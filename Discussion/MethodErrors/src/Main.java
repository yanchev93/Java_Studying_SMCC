public class Main {
    public static void main(String[] args) {
        int[] x = new int[] {
            4, 7, 3, 0, 8
        } ;
        int i;
        for (i = 0; i < 4; ++i) {
            x[i] = x[i + 1];
        }
        for (int j = 0; j < x.length; j++) {
            System.out.println(x[j]);
        }
    }
}
