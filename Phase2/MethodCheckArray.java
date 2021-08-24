class MethodCheckArray{
    public static void main(String[] args) {

        int [] numberA = {10,200,30,40,50};
        int [] numberB = {10,20,30,40,50};

        System.out.println("result = " + compareArray(numberA, numberB));
    }

    static boolean compareArray(int [] a, int [] b){
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++){
            if (a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}