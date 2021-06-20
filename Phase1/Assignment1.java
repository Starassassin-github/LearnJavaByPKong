import java.util.Scanner;
class Assignment1{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight (kilogram): ");
        double weight = sc.nextDouble();
        
        System.out.print("Enter your height (centimater): ");
        double height = sc.nextDouble();
        height /= 100;

        double bmi = weight / (height * height);
        System.out.println("Your weight " + weight);
        System.out.println("Your height " + height);
        System.out.println("Your bmi is " + bmi);
    }
}