import java.util.Scanner;
class Assignment2{
    // Write program check a number
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a first Number: ");
        int number1 = kb.nextInt();
        System.out.print("Enter a second Number: ");
        int number2 = kb.nextInt();

        if(number1 > number2){
            System.out.println(number1 + "more than" + number2);
        }else if(number1 < number2){
            System.out.println(number1 + "less than" + number2);
        }else{
            System.out.println(number1 + "equal" + number2);
        }
    }
}