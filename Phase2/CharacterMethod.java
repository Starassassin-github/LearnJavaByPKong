class CharacterMethod{
    public static void main(String[] args) {

        Character alphabet = new Character('A');
        char c = 'b';
        char alphabet2 = 'A';
        char [] group = {'A', 'B', 'C', 'D'};
        System.out.println(Character.isLetter(alphabet)); // check is String ?
        System.out.println(Character.isLetter(c));  // check is String ?
        System.out.println(Character.isDigit(alphabet));  // check is integer ?
        System.out.println(Character.isDigit(c));  // check is integer ?
        System.out.println(alphabet);
        System.out.println(alphabet2);
        System.out.println(group[1]);

        if (Character.isUpperCase(c)){
            System.out.println("UpperCase");
        }

        if (Character.isLowerCase(c)){
            System.out.println("LowerCase");
        } 

        if (Character.isLowerCase(alphabet)){ // Is running but none String
            System.out.println("LowerCase");
        }
        
        System.out.println("Before = " + c);
        char result = Character.toUpperCase(c);
        char result2 = Character.toLowerCase(c);
        System.out.println("After = " + Character.toUpperCase(c));
        System.out.println("After = " + result);
        System.out.println("After = " + result2);

    }
}