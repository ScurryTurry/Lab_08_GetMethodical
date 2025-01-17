import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalCost = 0.0;
        boolean done;

        do{
            double price = SafeInput.getRangedDouble(in, "Enter the price of the item ", 0.50, 10.00);
            totalCost += price;

            done = SafeInput.getYNConfirm(in, "Do you have more?");
        }while(done);

        System.out.printf("The total cost is $%.2f", totalCost);
    }
}
