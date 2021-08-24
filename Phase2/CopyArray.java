class CopyArray{
    public static void main(String[] args) {
        int [] numberA = {10,20,30,40,50,100,200};
        int [] numberB = CopyArray(numberA);
        displayArray(numberA);
        displayArray(numberB);
    }

    static void displayArray(int [] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(",");
        }
        System.out.println("}");
    }

    static int [] CopyArray(int [] a) {
        // throw Array A = 7 // new Array = 7 blank
        int [] newArr = new int[a.length];
        for (int i = 0; i < a.length; i++){
            newArr[i] = a[i];
        }
        return newArr;
    }
}