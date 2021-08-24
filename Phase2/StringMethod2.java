class StringMethod2{
    public static void main(String[] args) {

        String message = "Happy New Year 2020 | Happy Birth Day 2020";
        System.out.println("Before = " + message);
        message = message.replaceFirst("2020", "2021"); // Change first sentence
        System.out.println("After1 = " + message);
        message = message.replace("2020", "2021"); // Change all sentence
        System.out.println("After2 = " + message);

        // String => Array 
        String data = "mango,water melon,apple,banana";
        String [] fruit = data.split(",");
        System.out.println(fruit[0]);

        
        // subString(start at Index = 0, end - 1);
        String name = "WatDhaFlukz";
        String word = name.substring(6,11); // 0 - 2
        System.out.println(word);


        // String => Array Character
        String babe = "Mookiiz";
        char [] alphabet = babe.toCharArray();
        System.out.println(alphabet[0]);

        // Array Character => String
        char [] pkong = {'k', 'o','n', 'g'};
        String result = String.copyValueOf(pkong);
        System.out.println(result);


        // trim Array == strip in Python
        String babeFlukz = "    WatDhaFlukz  ";
        System.out.println(babeFlukz.length());
        System.out.println(babeFlukz);

        babeFlukz = babeFlukz.trim();
        System.out.println(babeFlukz.length());
        System.out.println(babeFlukz);

        // Upper, Lower
        String babeMookz = "Mookiiz";
        System.out.println(babeMookz.toLowerCase());
        System.out.println(babeMookz.toUpperCase());

        // toString change to integer to string
        int number = 100;
        double number2 = 3.1456;
        String toString = String.valueOf(number);
        String toString2 = String.valueOf(number2);
        System.out.println(toString);
        System.out.println(toString2);


    }
}