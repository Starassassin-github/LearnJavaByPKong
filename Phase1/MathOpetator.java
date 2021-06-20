import java.util.Scannerl;
class MathOperator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number1: ");
        int a = sc.nextInt();
        System.out.print("Enter a number2: ");
        int b = sc.nextInt();
        
        System.out.println("Summary = "+ (a+b));
        System.out.println("Summary = "+ (a-b));
        System.out.println("Summary = "+ (a*b));
        System.out.println("Summary = "+ (a/b));
        System.out.println("Summary = "+ (a%b));
    }
}