public class Matrix {
    public  void matrixPrinter(int[][] a, int rows, int columns) {
        for(int i = 0; i < rows; i++){
            System.out.print("[");
            for(int j = 0; j < columns; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
    public  int[][] matrixProd(int[][] a, int rowsA, int columnsA, int[][] b, int rowsB, int columnsB) {
        int[][] product = new int[rowsA][columnsB];
        for (int i = 0; i < rowsA; i++) {
            int[] r = new int[columnsB];
            for (int j = 0; j < columnsB; j++) {
                int re = 0;
                for (int k = 0; k < columnsA; k++) {
                    re += a[i][k] * b[k][j];
                }
                r[j] = re;
            }
            product[i] = r;
        }
        return product;
    }
    public  int[][] matrixAdd(int[][] a, int rows, int columns, int[][] b) {
        int[][] added = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            int[] r = new int[columns];
            for(int j = 0; j < columns; j++) {
                r[j] = a[i][j] + b[i][j];
            }
            added[i] = r;
        }
        return added;
    }
    public  int[][] transpose(int[][] a, int rows, int columns) {
        int[][] trp = new int[columns][rows];
        for(int i = 0; i < columns; i++){
            int[] r = new int[rows];
            for(int j = 0; j < rows; j++) {
                r[j] = a[j][i];
            }
            trp[i] = r;

        }
        return trp;
    }
}
