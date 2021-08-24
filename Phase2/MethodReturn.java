class MethodReturn{
    public static void main(String[] args) {
        connectServer(30);
        System.out.println("");
        connectServer(2000);
        
    }
    
    public static void connectServer(int ping){
        System.out.println("Show ping = " + ping);
        if (ping > 100) {
            return;
        }
        System.out.println("Connect server");
    }
}