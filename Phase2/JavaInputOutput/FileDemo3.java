import java.io.*;
class FileDemo3{
    public static void main(String[] args) {
        // File f = new File("Demo.txt");
        try {
            FileWriter writer = new FileWriter(new File("Introduction.txt"));
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("Halo\n");
            bw.write("write a basic java\n");
            bw.write("Teach by P'Kong");
            bw.close();
            System.out.println("Writed!!!");
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}