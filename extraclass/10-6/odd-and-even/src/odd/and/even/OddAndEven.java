package odd.and.even;

import java.util.Scanner;

public class OddAndEven {

    public static void main(String[] args) {
        int number;
        System.out.println("Enter a number: ");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        while (number != 0) {
            number = in.nextInt();
            if (number % 2 == 0) {
                System.out.println("It's a even number");
            } else {
                System.out.println("It's an odd number");
            }
        }

    }

}
