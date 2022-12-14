package Algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {
    List<String> primeList = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public void primeNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter max number: ");
        String input = scanner.nextLine();
        int maxNumber = Integer.parseInt(input);
        System.out.println("List of the prime number between 0 - " + maxNumber);

        for (int num = 0; num <= maxNumber; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {

                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true)
                primeList.add(Integer.toString(num));
            if (isPalindrome(num))
                list.add(num);
        }
        System.out.println();
        System.out.println("Prime Numbers List: " + primeList);
        System.out.println("Prime Pallindromes are: " + list);
    }

    public static boolean isPalindrome(int number) {
        int num = number;
        int palindrome = 0;
        while (number > 0) {
            int remainder = number % 10;
            palindrome = palindrome * 10 + remainder;
            number /= 10;
        }

        if (num == palindrome)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println("welcome to prime number checker");
        PrimeNumber prime = new PrimeNumber();
        prime.primeNum();
    }
}