class SwapArray{
    public static void main(String[] args) {
        int [] numberA = {10,20,30,59,100,500};

        displayArray(numberA);
        swapElement(numberA, 0, 2);
        displayArray(numberA);
        swapElement(numberA, 2, 5);
        displayArray(numberA);
        
    }

    static void displayArray(int [] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(",");
        }
        System.out.println("}");
    }

    static void swapElement(int [] a, int x, int y){
        // x = start position
        // y = end position
        // get postion temporary
        // 10, 20, 30
        // a, 10 => 30
        int temp = a[x]; // 10
        a[x] = a[y]; // 30
        a[y] = temp;
    }
}