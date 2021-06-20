import java.util.Scanner;
class NestedIf{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter you age: ");
        int age = kb.nextInt();

        if(age <= 15){
            System.out.println("grade 7 - 9");
            if(age == 15){
                System.out.println("grade 9");
            }
            else if(age == 14){
                System.out.println("grade 8");
            }
            else if(age == 13){
                System.out.println("grade 7");
            }else{
                System.out.println("lower grade");
            }
        }else{
            System.out.println("grade 9 - 12");
        }
    }
}