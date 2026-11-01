import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Average Calculator ===");
        System.out.print("How many numbers do you want to average? ");
        int count = scanner.nextInt();

        if (count <= 0) {
            System.out.println("Please enter a valid count greater than zero.");
        } else {
            double sum = 0;
            for (int i = 1; i <= count; i++) {
                System.out.print("Enter number " + i + ": ");
                sum += scanner.nextDouble();
            }

            double average = sum / count;
            System.out.println("The average is: " + average);
        }

        scanner.close();
    }
}
