class SearchArray{
    public static void main(String[] args) {
        
        int [] numberA = {10,20,30,40,50,100,200};
        System.out.println(searchElement(numberA, 50));
        
        String [] fruits = {"water melon", "lemon", "apple"};
        System.out.println(searchFriuts(fruits, "lemon"));

    }

    static int searchElement(int [] arr, int number){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == number){
                return i;
            }
        }
        return -1;
    }

    static int searchFriuts(String [] arr, String name){
        for (int i = 0; i < arr.length; i++){
            if (arr[i].equals(name)){
                return i;
            }
        }
        return -1;
    }
}
