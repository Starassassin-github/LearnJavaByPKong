import java.util.Scanner;
class AndOrNot{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = kb.nextInt();

        // ** ( And && ) ** ( Or || ) ** ( Not not)

        if(!(age >= 15)){   //  Opposit
            System.out.println("Youger");
        }else{
            System.out.println("Kid");
        }  
    }  
}