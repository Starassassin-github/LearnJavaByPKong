import java.util.Scanner;
class Assignment6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your money: ");
        int money = sc.nextInt();
        System.out.println("Your Money = " + money);

        if(money >= 1000){
            // 5000 / 1000 = order
            System.out.println("1000 : " + (money / 1000) + " order");
            money %= 1000;
        }
        if(money >= 500){
            System.out.println("500 : " + (money / 500) + " order");
            money %= 500;
        }
        if(money >= 100){
            System.out.println("100 : " + (money / 100) + " order");
            money %= 100;   
        }
        if(money >= 50){
            System.out.println("50 : " + (money / 50) + " order");
            money %= 50;
        }
        if(money >= 20){
            System.out.println("20 : " + (money / 20) + " order");
            money %= 20;
        }
        if(money >= 10){
            System.out.println("10 : " + (money / 10) + " order");
            money %= 10;
        }
        System.out.println("Scarp : " + money);
    }

}