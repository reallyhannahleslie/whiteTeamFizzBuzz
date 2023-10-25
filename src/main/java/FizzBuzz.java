import java.sql.SQLOutput;

import java.util.Scanner;

public class FizzBuzz {
    public FizzBuzz(int args) {
        System.out.println("Please provide a number: ");
        Scanner sc = new Scanner(System.in);

        CheckFizzBuzz(args);
    }

    public static String CheckFizzBuzz(int num) {

        for (int i = 1; i <= num; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                return "FizzBuzz";
            }
            else if (i % 3 == 0) {
                return "Fizz";
            }
            else if (i % 5 == 0) {
                return "Buzz";
            }
            else {
                return Integer.toString(i);
            }
        }

    }

    }