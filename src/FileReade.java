import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReade {
    public static void main(String[] args) throws IOException {
      FileWrite file = null;
        try (FileReader read = new FileReader(FileWrite.getFileNaame())){
            int rd = 0;
            do {
                rd = read.read();
                System.out.print((char) rd);

            }while (rd!=-1);

        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
