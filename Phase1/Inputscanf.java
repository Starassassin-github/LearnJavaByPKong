import java.util.Scanner;
class Inputscanf{
    public static void main(String[] args) {
        // input data
        // What type? ...,integer ,float ,long , double, String
        // What do String?
        // What number ? => calculate ? or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ")
        String name = sc.nextLine(); // String from Keyboard => name
        String name2 = sc.next(); // read string and not read blank to skip it

        System.out.print("Date3 : ")
        int year = sc.nextInt(); // Int from keyboard => Year

        int age = 2564 - year; // Calculate age


        System.out.println("Your name is " + name);
        System.out.println("Your name is " + name2);
        System.out.println("Year of birth " + year);
        System.out.println("Age is " + age);

    }
}