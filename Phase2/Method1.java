class Method1{
    public static void main(String[] args) {
        // call method
       display();
       plus();
       openVideo();
       playVideo();
       pauseVideo();
       playVideo();
       exitProgram();
    }
    //
    static void display(){
        // group set
        System.out.println("Hello World");
    }
    static void plus(){
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("Sum = " + c);
    }

    static void openVideo(){
        // Set do
        System.out.println("Open file Video");
    }
    static void playVideo(){
        // Set do
        System.out.println("Play Video");
    }
    static void pauseVideo(){
        // Set do
        System.out.println("Pause Video");
    }
    static void exitProgram(){
        // Set do
        System.out.println("Clear Memmory");
        System.out.println("Exit Program");
    }
    
}