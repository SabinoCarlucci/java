import java.util.Scanner;

public class CheckEvenOddNumber {
    
    public static void main (String[] args) {
        
        int number;

        System.out.println("Insert a number");

        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();
        
        if (isEven(number)) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

    }
        
    private static boolean isEven (int numberToCheck) {
        return numberToCheck % 2 == 0;
    }

}