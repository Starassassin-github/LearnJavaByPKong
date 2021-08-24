class VariableArg{
    public static void main(String[] args) {
        summation(10,20,30);
        summation(10,20,30,342,5435,6456,45645,234);
        
    }
    
    /*
    public static void summation(int a, int b) {
        int sum += a + b;
        System.out.println("summary = " + sum);
    }

    public static void summation(int a, int b, int c) {
        int sum += a + b +c;
        System.out.println("summary = " + sum);
    }
    */

    public static void summation(int...number){
        int sum = 0;
        for (int i = 0; i < number.length; i++){
            sum += number[i];
        }
        System.out.println("Summary = " + sum);
    }
}