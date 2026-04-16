package mathutility;

public class PascalTriangle {

    int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact = fact * i;
        return fact;
    }

    void printTriangle(int rows) {
        int i, j;

        for (i = 0; i < rows; i++) {
            for (j = 0; j <= i; j++) {
                int value = factorial(i) / (factorial(j) * factorial(i - j));
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}