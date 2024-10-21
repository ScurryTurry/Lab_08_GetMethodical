import java.util.Scanner;
public class Reggie {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     String userSocial = SafeInput.getRegExString(in, "Enter Your Social [XXX-XX-XXXX]", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("\nThe Social Security Number is: " + userSocial);
     String studentMNum = SafeInput.getRegExString(in, "Enter your UC Student M Number [M12345 or m12345]", "^(M||m)\\d{5}$");
     System.out.println("\nThe Student M Number is: " + studentMNum);
     String menuText = "\nO - Open\tS - Save\tV - View\tQ - Quit";
     String menuRegEx = "^[OoSsVvQq]$";
        System.out.println(menuText);
        String menuChoice = SafeInput.getRegExString(in, "Enter your choice", menuRegEx);
        System.out.println("You chose " + menuChoice);
    }
}