class Method2{
    public static void main(String[] args) {
        // call Method2
        display("WatDhaFlukz"); // WatDhaFlukz => Argument
        display("Hello World");
        display("247");
        fullname("Sorachak", "Kaewhom");
        fullname("247", "248");
        plus(247, 248);
        plus(-247, 248);
        // Error plus(500); 2 argument 
        plus2(12,23,42);
        subtrac(144,343,432);
    }

    // Build Method
    static void display(String message){ // message is parameter
        System.out.println(message);
    }

    static void fullname(String firstname, String lastname){
        System.out.println("firstname = " + firstname + " / lastname = " + lastname);
    }

    static void plus(int a, int b){
        int c = a + b;
        System.out.println("summary = " + c);
    }
    static void plus2(int x, int y, int z){
        int c = x + y + z;
        System.out.println("summary = " + c);
    }
    static void subtrac(int x, int y, int z){
        int c = x - y - z;
        System.out.println("summary = " + c);
    }

}