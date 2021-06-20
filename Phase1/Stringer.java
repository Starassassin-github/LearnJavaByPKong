class Stringer{
    public static void main(String[] args) {
       

        char a = 'A';
        
        System.out.println(a);

        String b = "ABC123", c = "200";
        System.out.println(b);
        System.out.println(c);

        String a = "100", b = "200";

        int c;
        // String => int 
        c = Integer.parseInt(a) + 50;
        c = c + 100; // 150 + 100

        System.out.println(c);
        System.out.println(b);

        // String => Double 
        double c = Double.parseDouble(a);
        c = c + 3.55;
        System.out.println(c);

        // Integer => String
        int num1 = 100;
        String age = String.valueOf(num1);
        System.out.println(age);

        // check type data 
        Integer a = 10;
        double b; 
        String c = "Hello World";
        boolean d;
        char e;
        float f;

        // yes (true) or no (false) instanceof use with Class
        boolean result = c instanceof String;
        System.out.println(result);
    }
}

