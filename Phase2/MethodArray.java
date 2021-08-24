class MethodArray{
    public static void main(String[] args) {

        int [] numberA = {10,20,30,40,50};
        System.out.println("MAXIMUM is = " + findMaxInArray(numberA));
        System.out.println("MINIMUN is = " + findMinInArray(numberA));
        System.out.println("MAX POSITION is = " + findMaxIndex(numberA));
        System.out.println("MIN POSITION is = " + findMinIndex(numberA));

        int [] numberB = {-10,-20,30,70,-230};
        System.out.println("MAXIMUM is = " + findMaxInArray(numberB));
        System.out.println("MINIMUN is = " + findMinInArray(numberB));

        int [] numberC = {300, 345, 233, 64, 345};
        System.out.println("MAXIMUM is = " + findMaxInArray(numberC));
        System.out.println("MINIMUN is = " + findMinInArray(numberC));
    }

    static int findMaxInArray(int [] arr){
        // find Max in Array
        // get maximum
        int maxValue = arr[0]; // get Max a default
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    static int findMinInArray(int [] arr){
        // find Max in Array
        // get maximum
        int minValue = arr[0]; // get Max a default
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }

    static int findMaxIndex(int [] arr){
        int maxIndex = 0; // get Max index in Array arr
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static int findMinIndex(int [] arr){
        int minIndex = 0; // get Min index in Array arr
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < arr[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }
}