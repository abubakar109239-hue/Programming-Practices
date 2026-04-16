 package mathutility;

 class Palindrome {

    public void isPalindrome(int number) {
    int original = number;
    int rev = 0;

    while (number != 0) {
        int digit = number % 10;
        rev = rev * 10 + digit;
        number /= 10;
    }

    if (original == rev) {
        System.out.println("The no is Palindrome");
    } else {
        System.out.println("The no is not Palindrome");
    }
}
}