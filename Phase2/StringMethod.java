class StringMethod{
    public static void main(String[] args) {
        // definition
        String name1 = "WatDhaFlukz";
        String city = new String(" Chonburi ");
        String name2 = "WatDhaMookz";

        System.out.println(name1);
        System.out.println(city);

        // Concatenation => connect String
        String result = name1 + city;
        System.out.println(result.concat(".com"));
        System.out.println(name1 + city + ".com");

        // find length String
        int count = name1.length();
        System.out.println(count);
        System.out.println(name1.length());
        System.out.println(city.length());

        // find Index String (order index)
        System.out.println(name1.charAt(3));

        // check equals String
        boolean getResult = name1.equals(name2); // #equals# check lower and upper
        System.out.println(getResult);
        if (getResult) { 
            System.out.println("same");
        }else{
            System.out.println("not same");
        }

        if (name1.equalsIgnoreCase(name2)){ //    #equalsIgnorCase# not check lower and upper
            System.out.println("same");
        }else{
            System.out.println("not same");
        }

        // chek Withs String
        String fullname = "MR.Sorachak Kaewhom";
        String code = "34923455TH";

        boolean getStart = fullname.startsWith("MR.");
        if (getStart) {
            System.out.println("boy");
        }else{
            System.out.println("girl");
        }

        if (code.endsWith("TH")) {
            System.out.println("Thailand");
        }else{
            System.out.println("not in system");
        }

        // Search String and return index
        // get return is Integer
        System.out.println(fullname.indexOf("Kaew"));


    }
}