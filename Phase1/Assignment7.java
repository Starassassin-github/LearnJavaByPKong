import java.util.Scanner;
class Assignment7{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your Fahrenheit: ");
        float fahren = kb.nextFloat();

        float cel = (fahren - 32) * 5 / 9;
        System.out.println(fahren + " Fahrenheit = " + cel " Celsius");
    }
}