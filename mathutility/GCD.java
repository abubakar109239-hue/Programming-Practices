package mathutility;

 public class GCD {
    int a, b;

    void calculate() {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD is: " + a);
    }
}