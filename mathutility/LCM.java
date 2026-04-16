package mathutility;

public class LCM {

    int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    int calculate(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}