package bridgelab.naresh.day7;

public class StdArrayIO {

  
    private StdArrayIO() { }

    public static double[] readDouble1D() {
        int n = BLStdIn.readInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = BLStdIn.readDouble();
        }
        return a;
    }
    public static void print(double[] a) {
        int n = a.length;
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            System.out.printf("%9.5f ", a[i]);
        }
        System.out.println();
    }
    public static double[][] readDouble2D() {
        int m = BLStdIn.readInt();
        int n = BLStdIn.readInt();
        double[][] a = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = BLStdIn.readDouble();
            }
        }
        return a;
    }

    public static void print(double[][] a) {
        int m = a.length;
        int n = a[0].length;
        System.out.println(m + " " + n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%9.5f ", a[i][j]);
            }
            System.out.println();
        }
    }
    public static int[] readInt1D() {
        int n = BLStdIn.readInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = BLStdIn.readInt();
        }
        return a;
    }
    public static void print(int[] a) {
        int n = a.length;
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            System.out.printf("%9d ", a[i]);
        }
        System.out.println();
    }
    public static int[][] readInt2D() {
        int m = BLStdIn.readInt();
        int n = BLStdIn.readInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = BLStdIn.readInt();
            }
        }
        return a;
    }
    public static void print(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        System.out.println(m + " " + n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%9d ", a[i][j]);
            }
            System.out.println();
        }
    }
    public static boolean[] readBoolean1D() {
        int n = BLStdIn.readInt();
        boolean[] a = new boolean[n];
        for (int i = 0; i < n; i++) {
            a[i] = BLStdIn.readBoolean();
        }
        return a;
    }
    public static void print(boolean[] a) {
        int n = a.length;
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            if (a[i]) System.out.print("1 ");
            else      System.out.print("0 ");
        }
        System.out.println();
    }
    public static boolean[][] readBoolean2D() {
        int m = BLStdIn.readInt();
        int n = BLStdIn.readInt();
        boolean[][] a = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = BLStdIn.readBoolean();
            }
        }
        return a;
    }
    public static void print(boolean[][] a) {
        int m = a.length;
        int n = a[0].length;
        System.out.println(m + " " + n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j]) System.out.print("1 ");
                else         System.out.print("0 ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {


        double[] a = StdArrayIO.readDouble1D();
        StdArrayIO.print(a);
        System.out.println();


        double[][] b = StdArrayIO.readDouble2D();
        StdArrayIO.print(b);
        System.out.println();


        boolean[][] d = StdArrayIO.readBoolean2D();
        StdArrayIO.print(d);
        System.out.println();
    }

}