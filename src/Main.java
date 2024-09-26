import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // Declare variables
        Scanner in = new Scanner(System.in);
        double itemCost = 0;
        double shippingCost = 0;
        System.out.print("Please enter the price of your item: ");

        // Check if input is a valid item price
        if (in.hasNextDouble())
        {
            itemCost = in.nextDouble();

            // If item cost < 100, then set shipping cost equal to 2% of item cost
            if (itemCost < 100)
            {
                shippingCost = itemCost * .02;
            }

            System.out.println("Your shipping cost is: " + shippingCost);
            System.out.println("Your total cost is: " + (shippingCost + itemCost));
        } else {
            System.out.println("Invalid item price: " + in.nextLine());
        }
    }
}