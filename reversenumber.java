
package loopp2;
import java.util.Scanner;
public class reversenumber {
    public static void main(String[] args) {
      int number, lastDigit, reverse = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        number = scan.nextInt();

        do {
            lastDigit = number % 10;
            System.out.println("lastDigit = " + lastDigit);

            reverse = (reverse * 10) + lastDigit;
            System.out.println("reverse = " + reverse);

            number = number / 10;
            System.out.println("number = " + number);

            System.out.println();
        } while (number > 0);

        System.out.println("That number reversed is " + reverse);
    }
}
