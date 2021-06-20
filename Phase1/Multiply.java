import java.util.Scanner;
class Multiply{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your start: ");
        int start = kb.nextInt();
        System.out.print("Enter your end: ");
        int stop = kb.nextInt();
        // int m = 2; // 2 - 5
        System.out.println("##########");
        for (int m = start; m <= stop; m++) {
            System.out.println("mode = " + m);
            for(int i = 1; i <= 12; i++)
                System.out.println(m + " x " + i + " = " + (m * i));
        }
    }
}