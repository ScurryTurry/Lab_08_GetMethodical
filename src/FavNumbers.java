import java.util.Scanner;
public class FavNumbers
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int favInt = SafeInput.getInt(in, "Enter your favorite number");
        System.out.println("\nFavorite Number: " + favInt);

        double favDouble = SafeInput.getDouble(in, "Enter your favorite number with a decimal point");
        System.out.println("\nFavorite Double: " + favDouble);
    }
}
