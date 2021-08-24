class ForArray{
    public static void main(String[] args) {

        String [] [] product = {
            {"chair", "table", "lamp"},
            {"keyboard", "mouse", "microphone"},
            {"lipstick", "roll on", "cream"}
        };

        for(int row = 0; row < product.length; row++){
            for(int column = 0; column < product[row].length; column++){
                System.out.println("row = " + row + " column = " + column + " data = " + product[row][column]);
            }
        }

    }
}