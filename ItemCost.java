import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Item Cost Calculator ===");
        System.out.print("Enter the name of the item: ");
        String itemName = scanner.nextLine();

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the unit price: ");
        double unitPrice = scanner.nextDouble();

        double totalCost = quantity * unitPrice;

        System.out.println("\n--- Receipt ---");
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: $" + unitPrice);
        System.out.println("Total Cost: $" + totalCost);

        scanner.close();
    }
}
