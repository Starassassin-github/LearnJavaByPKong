import java.util.Scanner;
class Assignment3{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the number integer: ");    
        int number = kb.nextInt();

        // % number  % 2 == 0 eval
        // % number  % 2 != 0 odd

        String result = "";

        if(number % 2 == 0){
            result = number + "eval";
        }else{
            result = number + "odd"
        }
        System.out.println(result);

        
    }
}