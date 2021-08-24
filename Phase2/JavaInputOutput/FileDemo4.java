import java.io.*;
class FileDemo4{
    public static void main(String[] args) {
        try {
            FileReader  reader = new FileReader(new File("Introduction.txt"));
            BufferedReader br = new BufferedReader(reader);
            String message = "";

            while ((message = br.readLine()) != null){
                System.out.println(message);
            }
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}