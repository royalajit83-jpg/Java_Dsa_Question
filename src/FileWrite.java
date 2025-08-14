import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FileWrite {
    public static String getFileNaame() {
        return FileNaame;
    }

    public static String FileNaame = "index.txt";
    public static void main(String[] args) {


        try (FileWriter write = new FileWriter(FileNaame)){
            write.write("<h1> helloe </h1>");
            write.write("hy everyone how are you ");

            write.flush();

            System.out.println("file created succesfully ");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
