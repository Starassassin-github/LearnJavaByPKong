import java.util.Scanner;
class IfStatement{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = kb.nextInt();ฃ
        // 60
        if(age >= 15){
            System.out.println("Mr. or Miss.");
        }
        else if(age >= 20){
            System.out.println("Graduate");
        }
        else if(age >= 30){
            System.out.println("Worker");
        }
        else if(age >= 40){
            System.out.println("middle life");
        }
        else if(age >= 60){
            System.out.println("to Old");
        }else{
            System.out.println("No data");
        }
        System.out.println("Finish The Program.");
    }
}