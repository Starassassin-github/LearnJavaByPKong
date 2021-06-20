import java.util.Scanner;
class Assignment4{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your Buddhist Era.: ");
        int number = kb.nextInt();

        // Calculate
        // 2564 - 543 => Christian Era.
        // Christian Era. + 543 => Buddhist Era.

        int result = number - 543;
        System.out.print(number + " change to Christian Era. = " + result);
        
    }
}