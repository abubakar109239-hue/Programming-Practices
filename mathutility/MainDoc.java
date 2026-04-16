package mathutility;
import mathutility.*;
import java.util.Scanner;

public class MainDoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Palindrome
        System.out.print("Enter a number for Palindrome check: ");
        int num1 = sc.nextInt();
        Palindrome p = new Palindrome();
        p.isPalindrome(num1);
        System.out.println();

        //  GCD
        System.out.print("Enter first number for GCD: ");
        int a = sc.nextInt();
        System.out.print("Enter second number for GCD: ");
        int b = sc.nextInt();
        GCD g = new GCD();
        g.a = a;
        g.b = b;
        g.calculate();
        System.out.println();

        //  LCM
        LCM lcmObj = new LCM();
        int lcm = lcmObj.calculate(a, b);
        System.out.println("LCM is: " + lcm);
        System.out.println();

        //  Prime
        System.out.print("Enter a number to check Prime: ");
        int num2 = sc.nextInt();
        Prime primeObj = new Prime();
        if (primeObj.isPrime(num2)) {
            System.out.println(num2 + " is Prime");
        } else {
            System.out.println(num2 + " is Not Prime");
        }
        System.out.println();

        // Reverse
        System.out.print("Enter a number to Reverse: ");
        int num3 = sc.nextInt();
        Reverse revObj = new Reverse();
        int revNum = revObj.reverseNumber(num3);
        System.out.println("Reversed number: " + revNum);
        System.out.println();

        // Pascal Triangle
        System.out.print("Enter number of rows for Pascal Triangle: ");
        int rows1 = sc.nextInt();
        PascalTriangle pascalObj = new PascalTriangle();
        pascalObj.printTriangle(rows1);
        System.out.println();

        // Floyd's Triangle
        System.out.print("Enter number of rows for Floyd's Triangle: ");
        int rows2 = sc.nextInt();
        FloydsTriangle floydObj = new FloydsTriangle();
        floydObj.n = rows2;
        floydObj.display();

        sc.close();
    }
}