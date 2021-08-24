import java.util.Scanner;
class ExceptionDemo1{
    public static void main(String[] args) {
        
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);

            
        } catch (ArithmeticException e) {
            System.out.println("Can't division by zero.");
        }

        try {
            int [] item = {10,30,20};
            System.out.println(item[200]);

            
        } catch (ArithmeticException e) {
            System.out.println("Can't division by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is Wrong.");
        }


        try {
            Scanner kb = new Scanner(System.in);
            System.out.print("Enter Number: ");
            int number = kb.nextInt();
            System.out.println(number);

        } catch (ArithmeticException e) {
            System.out.println("Can't division by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is Wrong.");
        } catch (Exception e){
            System.out.println("Please Enter Only Number.");
        }

        // Show Exception
        try {
            Scanner kb = new Scanner(System.in);
            System.out.print("Enter integer : ");
            int number1 = kb.nextInt();
            System.out.println(number1);
        } catch (Exception e) {
            e.printStackTrace();
            
        } finally{
            // do something
            System.out.println("do something...");
        }
        


    }
}