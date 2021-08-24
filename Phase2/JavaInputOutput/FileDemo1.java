import java.io.*;
class FileDemo1{
    public static void main(String[] args) {
        // File f = new File("Demo.txt");
        try {
            FileWriter writer = new FileWriter(new File("Score.txt"));
            writer.write("Hello World");
            writer.write("How are you ?");
            writer.close();
            System.out.println("Writed!!!");
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}