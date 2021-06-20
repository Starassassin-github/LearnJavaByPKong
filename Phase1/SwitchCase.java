import java.util.Scanner;
class SwitchCase{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter your mount: ");
        int mount = kb.nextInt();
        String name;
        // if(mount == 1){
        //     name = "January";
        // }else if(mount == 2){
        //     name = "Febuary";
        // }else if(mount == 3){
        //     name = "March";
        // }else{
        //     name = "NULL";
        // }
        // System.out.println(name);

        switch (mount) {
            case 1:
                name = "January";
                break;
            case 2:
                name = "Febuary";
                break;
            case 3:
                name = "March";
                break;

            default:
                name = "NULL";
                break;
        }
        System.out.println(name);
    }
}