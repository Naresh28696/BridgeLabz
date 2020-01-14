package bridgelab.naresh.day10;

public class ArrayOperations {

	private ArrayOperations() { }

    /**
     * Reads a 1D array of doubles from standard input and returns it.
     *
     * @return the 1D array of doubles
     */
    public static double[] readDouble1D() {
        int n = StdIn.readInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = StdIn.readDouble();
        }
        return a;
    }

    /**
     * Prints an array of doubles to standard output.
     *
     * @param a the 1D array of doubles
     */
    public static void print(double[] a) {
        int n = a.length;
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            System.out.printf("%9.5f ", a[i]);
        }
        System.out.println();
    }

        
    /**
     * Reads a 2D array of doubles from standard input and returns it.
     *
     * @return the 2D array of doubles
     */
    public static double[][] readDouble2D() {
        int m = StdIn.readInt();
        int n = StdIn.readInt();
        double[][] a = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = StdIn.readDouble();
            }
        }
        return a;
    }

    /**
     * Prints the 2D array of doubles to standard output.
     *
     * @param a the 2D array of doubles
     */
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


    /**
     * Reads a 1D array of integers from standard input and returns it.
     *
     * @return the 1D array of integers
     */
    public static int[] readInt1D() {
        int n = StdIn.readInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = StdIn.readInt();
        }
        return a;
    }

    /**
     * Prints an array of integers to standard output.
     *
     * @param a the 1D array of integers
     */
    public static void print(int[] a) {
        int n = a.length;
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            System.out.printf("%9d ", a[i]);
        }
        System.out.println();
    }

        
    /**
     * Reads a 2D array of integers from standard input and returns it.
     *
     * @return the 2D array of integers
     */
    public static int[][] readInt2D() {
        int m = StdIn.readInt();
        int n = StdIn.readInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = StdIn.readInt();
            }
        }
        return a;
    }

    /**
     * Print a 2D array of integers to standard output.
     *
     * @param a the 2D array of integers
     */
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


    /**
     * Reads a 1D array of booleans from standard input and returns it.
     *
     * @return the 1D array of booleans
     */
    public static boolean[] readBoolean1D() {
        int n = StdIn.readInt();
        boolean[] a = new boolean[n];
        for (int i = 0; i < n; i++) {
            a[i] = StdIn.readBoolean();
        }
        return a;
    }

    /**
     * Prints a 1D array of booleans to standard output.
     *
     * @param a the 1D array of booleans
     */
    public static void print(boolean[] a) {
        int n = a.length;
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            if (a[i]) System.out.print("1 ");
            else      System.out.print("0 ");
        }
        System.out.println();
    }

    /**
     * Reads a 2D array of booleans from standard input and returns it.
     *
     * @return the 2D array of booleans
     */
    public static boolean[][] readBoolean2D() {
        int m = StdIn.readInt();
        int n = StdIn.readInt();
        boolean[][] a = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = StdIn.readBoolean();
            }
        }
        return a;
    }

   /**
     * Prints a 2D array of booleans to standard output.
     *
     * @param a the 2D array of booleans
     */
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


   /**
     * Unit tests {@code ArrayOperations}.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
    	System.out.println("2D Integer array.");
        // read and print an array of doubles
        int[][] a = ArrayOperations.readInt2D();
        ArrayOperations.print(a);
        System.out.println();


    	System.out.println("2D Double array.");
        // read and print a matrix of doubles
        double[][] b = ArrayOperations.readDouble2D();
        ArrayOperations.print(b);
        System.out.println();


    	System.out.println("2D Booelan array.");
        // read and print a matrix of doubles
        boolean[][] d = ArrayOperations.readBoolean2D();
        ArrayOperations.print(d);
        System.out.println();
    }


	
}
