class ForEach{
    public static void main(String[] args) {

        // For Each print Array
        int [] number = {324,23,675,86,12,34};
        String [] fruits = {"mango", "lemon", "water melon"};

        int sum = 0;
        for(int item : number){
            sum += item;
        }
        System.out.println(sum);
        ////////////
        ////////////
        for(String data : fruits){
            System.out.println(data);
        }
    }
}