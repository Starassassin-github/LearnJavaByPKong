class WhileLoop{
    public static void main(String[] args) {

        int count = 1;
        while(true){
            // What do ?
            System.out.println("round = " + count + "Hello World");
            count++; // count = 2,3,4,...,10,11
            if(count>100) break;
        }
    }
}