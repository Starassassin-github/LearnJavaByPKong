class Array2dimension{
    public static void main(String[] args) {
        
        String [] [] product = {
            {"chair", "table", "lamp"},
            {"keyboard", "mouse", "microphone"},
            {"lipstick", "roll on", "cream"}
        };
        // product [row] [column]
        System.out.println(product[2][1]);
        System.out.println(product[1][2]);

        product[1][2] = "display";   
        System.out.println(product[1][2]);     


    }
}