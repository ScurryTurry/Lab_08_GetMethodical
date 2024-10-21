import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String userName = SafeInput.getNonZeroLenString(in,"Enter your username");
        System.out.println("\nUser Name: " + userName);

        int userInt = SafeInput.getInt(in, "Enter a number");
        System.out.println("\nUser Number: " + userInt);

        double userDouble = SafeInput.getDouble(in, "Enter a number with a decimal point");
        System.out.println("\nUser Double: " + userDouble);

        int userRangedInt = SafeInput.getRangedInt(in, "Enter a number between", 1, 10);
        System.out.println("\nUser Range: " + userRangedInt);

        double userRangeDouble = SafeInput.getRangedDouble(in, "Enter a number between", 1.0, 10.0);
        System.out.println("\nUser Double Range: " + userRangeDouble);

        boolean continueYN = SafeInput.getYNConfirm(in, "Would you like to continue?");
        System.out.println("\nUser chose: " + continueYN);

        String userSocial = SafeInput.getRegExString(in, "Enter your social", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("\nUser Social: " + userSocial);
    }
}