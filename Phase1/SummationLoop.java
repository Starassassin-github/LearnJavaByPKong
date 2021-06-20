import java.util.Scanner;
class SummationLoop{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int sum = 0, count = 0, avg = 0;
        while(true){
            System.out.print("Enter your number: ");
            int number = kb.nextInt();

            if (number < 0) break;
            count++;
            sum += number; // summation 0 + 1
        }
        System.out.println("Summation = " + sum);
        System.out.println("Times = " + count);
        System.out.println("Average = " + (sum / count));
    }
}