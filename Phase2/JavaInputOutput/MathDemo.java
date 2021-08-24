import java.lang.Math;
class MathDemo{
    public static void main(String[] args) {
        // classMath;
        System.out.println(Math.PI);
        System.out.println(Math.E);
        // PI
        int r = 2;
        double area = Math.PI * r * r ;
        System.out.println(area);
        // ABS
        int number = -30;
        System.out.println(Math.abs(number));
        // CEIL
        double number2 = 23.3;
        System.out.println(Math.ceil(number2) + " ceil"); // Ceil up
        System.out.println(Math.floor(number2) + " floor"); // Floor down

        // x <= .5 Floor down
        // x > .5 Ceil up
        System.out.println(Math.rint(number2) + " rint");

        // x  >= .5 Ceil up
        // x <= .4 Floor down
        System.out.println(Math.round(15.3) + " round");
        System.out.println(Math.round(15.4) + " round");
        System.out.println(Math.round(15.5) + " round");

        // find root square
        System.out.println(Math.sqrt(9) + " root of 9");

        // Pow
        System.out.println(5*5*5*5);
        System.out.println(Math.pow(5,4));
    }
}