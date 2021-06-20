import java.util.Scanner;
class MinmaxLoop{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int maxNumber = 0, minNumber = Integer.Max_VALUE;
        while (true){
            System.out.println("Enter your number: ");
            int number = kb.nextInt();

            if (number < 0) break;
            if (number > maxNumber) maxNumber = number;
            if (number < minNumber) minNumber = number;
        }
        System.out.println("Max Number = " + maxNumber);
        System.out.println("Min Number = " + minNumber);
    }
}