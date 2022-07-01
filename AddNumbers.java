import java.util.Scanner;

public class AddNumbers {

    public static void main (String[] args) {
        int number_1, number_2, sum;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        number_1 = scanner.nextInt();

        System.out.println("Enter the second number");
        number_2 = scanner.nextInt();

        scanner.close();

        sum = number_1 + number_2;

        System.out.println("The sum is " + sum);
    }
}
