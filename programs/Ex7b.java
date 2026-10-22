import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("student.txt")) {
            fw.write("101,Aanand srinivasan,78\n");
            fw.write("102,Divya sri,91\n");
            fw.write("103,subramhanian,45\n");

            System.out.println("File written successfully.");

        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
