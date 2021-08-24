import java.util.Scanner;
class ThrowDemo{
    static int balance = 5000;
    public static void main(String[] args) {
        // Withdraw program
        // balance 5000
        try {
            
            Scanner kb = new Scanner(System.in);
            System.out.print("Enter money withdraw: ");
            int money = kb.nextInt();
            // withdraw
            withDraw(money);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void withDraw(int amount) throws Exception{  
        // is money withdraw
        if (amount <= 0) {
            throw new Exception("Please Enter money more than 0.");
        }

        if (amount > balance){
            throw new Exception("Not money Enough");
        
        }
        balance -= amount;
        System.out.println("Withdraw = " + amount);
        System.out.println("Balance = " + balance);

    }
}