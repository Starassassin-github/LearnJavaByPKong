class NestedLoop{
    public static void main(String[] args) {
        // loop out
        for(int i = 1; i <= 3; i++){
            System.out.println("round out = " + i);
            // loop in
            for(int j = 1; j <= 5; j++){
                System.out.println("round in = " + j);
            }
        }

    
        System.out.println("");
        // while loop

        int i = 1, j = 5
        while(i <= 3){
            System.out.println("round out = "+ i);
            j = 1;
            while(j <= 5){
                System.out.println("round in = " + j);
                j++; // 6
            }
            i++; // 2
        }
    }
}