import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int birthYear = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2024);
        int birthMonth = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);
        int birthDay = 0;
            switch (birthMonth){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, 31); //Jan, Mar, May, July, Aug, Oct, Dec
                break;
                case 2:
                    birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, 29); //Feb
                break;
                case 4: case 6: case 9: case 11:
                    birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, 30); //April, June, Sept, Nov
                break;
            }
        int birthHour = SafeInput.getRangedInt(in, "Enter your birth hour", 0, 23);//1-24 Doesn't make sense because 00:00 is midnight
        int birthMinute = SafeInput.getRangedInt(in, "Enter your birth minute", 0, 59);//Could be born on the hour so 1 doesn't make sense for start

        System.out.println("You were born: " + birthMonth + " " + birthDay + " " + birthYear + " at " + birthHour + ":" + birthMinute);
    }
}
