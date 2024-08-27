import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int n;
        int m;
        Matrix mx = new Matrix();
        System.out.println("**********MATRIX OPERATIONS**********");
        System.out.println("#Matrix X");
        System.out.println("Enter number of rows: ");
        n = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        m = scanner.nextInt();
        int[][] x = new int[n][m];
        for(int i = 0; i < n; i++) {
            System.out.println("Enter elements for row "+i);
            int[] row = new int[m];
            for(int j = 0; j < m; j++) {
                row[j] = scanner.nextInt();
            }
            x[i] = row;
        }

        mx.matrixPrinter(x, n, m);
        System.out.println("------------------");
        System.out.println("#Matrix B");
        System.out.println("Enter number of rows: ");
        a = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        b = scanner.nextInt();
        int[][] y = new int[a][b];
        for(int i = 0; i < a; i++) {
            int[] row = new int[b];
            System.out.println("Enter elements for row "+i);
            for(int j = 0; j < b; j++) {
                row[j] = scanner.nextInt();
            }
            y[i] = row;
        }

        mx.matrixPrinter(y, a, b);

        System.out.println("------------------");
        System.out.println("Select the operation: ");
        System.out.println("1. MATRIX ADDITION");
        System.out.println("2. MATRIX MULTIPLICATION");
        System.out.println("3. TRANSPOSE");
        int choice = scanner.nextInt();
        switch (choice) {

            case 2:
                if (m == a) {
                    int[][] result =   mx.matrixProd(x, n, m, y, a, b);

                    System.out.println("------------------");
                    System.out.println("A x B");

                    mx.matrixPrinter(result, n, b);
                    System.out.println("-----------------------------------");

                } else {
                    System.out.println("Matrix multiplication is not possible!");
                }
                break;
            case 1:
                if(n == a && m == b) {
                    int[][] result = mx.matrixAdd(x, n, m, y);
                    System.out.println("A + B");
                    mx.matrixPrinter(result, n, m);
                    System.out.println("-----------------------------------");

                } else {
                    System.out.println("Oops! Matrix addition is not possible😔");
                }
                break;
            case 3:
                int[][] transposeA = mx.transpose(x, n, m);
                int[][] transposeB = mx.transpose(y, a, b);
                System.out.println("-----------------------------------");
                System.out.println("A - TRANSPOSE");
                mx.matrixPrinter(transposeA, m, n);
                System.out.println("-----------------------------------");
                System.out.println("B - TRANSPOSE");
                mx.matrixPrinter(transposeB, b, a);
                System.out.println("-----------------------------------");
                break;

            default:
                System.out.println("Invalid Choice.");
        }
        System.out.println("THANK YOU FOR USING OUR SERVICE 😊");



    }
}