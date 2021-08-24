import java.util.Scanner;
class Method3{
    public static void main(String[] args) {
        // main program
        String myIP = getIP();
        System.out.println(myIP);
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double salary = kb.nextDouble();
        System.out.println("Your salary = " + salary);
        double bonus = getbonus();
        salary += bonus;
        System.out.println("salary + bonus = " + salary);
        System.out.println("Address = " + getMyAddress());
    }

    // modifier type data, return to main program namemethod(){}

    // return value ==> static String ip(){}
    // not return value ==> static void ip(){}

    static String getIP(){
        return "127.0.0.1";
    }

    static Double getbonus(){
        return 1000.0;
    }

    static void fullname(){
        // set second program
    }

    static String getMyAddress(){
        String city = "Rayong";
        return city;
    }
}