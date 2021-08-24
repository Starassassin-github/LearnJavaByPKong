class Method5{
    public static void main(String[] args) {
        int [] numberA = {10,20,30,40,50};
        

        int [] numberB = {-10,-20,30,70,-230};
        

        double [] numberC = {300.34, 345.34, 233.46, 64.00, 345.57};
        

        displayArray(numberA);
        displayArray(numberB);

        System.out.println(""); // print blank

        displayArray2(numberA);
        displayArray2(numberB);

        System.out.println(""); // print blank

        displayDouble(numberC);


        
    }

    // show number in array with method
    static void displayArray(int [] arr){
        for (int i = 0; i  < arr.length; i++){
            System.out.println("order = " + i + " is " + arr[i]);
        }
        System.out.println("#####end#####");
    }

    static void displayArray2(int [] arr){
        System.out.print("{");
        for (int i = 0; i  < arr.length; i++){
            System.out.print(arr[i]);
            if (i < arr.length - 1){
                System.out.print(",");
            }
        }
        System.out.println("}");
    }

    static void displayDouble(double [] arr){
        System.out.print("{");
        for (int i = 0; i  < arr.length; i++){
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(",");
            
        }
        System.out.println("}");
    }

}