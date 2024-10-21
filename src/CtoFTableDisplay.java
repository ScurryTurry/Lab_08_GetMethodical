public class CtoFTableDisplay{
    public static void main(String[] args) {
        System.out.println("Celsius   Fahrenheit");
        for(double cTemp = -100.0; cTemp <= 100; cTemp += 1.0) {
            System.out.printf("%6.2f\t%10.2f\n", cTemp, CtoF(cTemp));
        }
    }
    private static double CtoF(double cTemp)
    {
        return cTemp * 9.0/5 +32;
    }
}
