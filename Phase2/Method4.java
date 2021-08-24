class Method4{
    public static void main(String[] args) {
        // main program
        int result = maxNumber(3, 13);
        int sum = summation(50,50);
        System.out.println("Maximum is " + result);
        System.out.println("Summary = " + sum);
    }

    /* type data would return to method namemethod (input){
        // calculate
        return type data
        
    }
    */
    
    //check 2 integer 
    static int maxNumber(int a, int b){
        // calculate program
        int max = 0;
        if (a == b){
            max = a;
        }
        else if(a > b){
            max = a;
        }else{
            max = b;
        }
        return max;

    }
    static int mixNumber(int a, int b){
        // calculate program
        if (a < b) {
            return a;
        }else{
            return b;
        }

    }

    static int summation(int x, int y){
        int total = x + y;
        return total;
    }
}