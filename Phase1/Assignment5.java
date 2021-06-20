import java.util.Scanner;
class Assignment1{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight (kilogram): ");
        double weight = sc.nextDouble();
        
        System.out.print("Enter your height (centimater): ");
        double height = sc.nextDouble();
        height /= 100;

        double bmi = weight / (height * height);
        System.out.println("Your weight " + weight);
        System.out.println("Your height " + height);
        System.out.println("Your bmi is " + bmi);

        String predict = "";
        /*
            less than 18 = lower average
            18.5 - 22.9 = good
            23.0 - 24.9 = more than average
            25.0 - 29.9 = fat
            more than 30 = dangerous
        */

        if(bmi < 18){
            predict = "lower average";
        }
        else if(bmi >= 18.5 && bmi <= 22.9){
           predict = "good";
        }
        else if(bmi >= 23.0 && bmi <= 24.9){
            predict = "more than average";
        }
        else if(bmi >= 25.0 && bmi <= 29.9){
            predict = "fat";
        }
        else if(bmi >= 30 && bmi <= 70.0){
            predict = "dangerous";
        }else{
            predict = "NULL";
        }

        System.out.println("Your predict = "+ predict);
    }
}