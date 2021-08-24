import java.io.*;
class FileDemo2{
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader(new File("Score.txt"));
            int data;
            while ((data = reader.read()) != -1 ){
                System.out.printf("%c\n", data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}