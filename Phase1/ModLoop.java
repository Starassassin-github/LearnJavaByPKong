import java.util.Scanner;
class ModLoop{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your number: ");
            int number = kb.nextInt();

            if (number < 0) break;

            if (number % 2 == 0) {
                System.out.println("eval");
            }else{
                System.out.println("odd");
            }
        }
    }
}