import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


    public class Main {
        public static void main(String[] args) {
            String sourcePath = "E:\\code gym\\module 2\\BT-Copy-file-nhi-phan\\src\\filegoc";
            String sourceDestination = "E:\\code gym\\module 2\\BT-Copy-file-nhi-phan\\src\\filecoppy";
            FileInputStream inputStream;
            FileOutputStream outputStream;
            byte[] allBytes;
            long fileSize;
            try {
                inputStream = new FileInputStream(sourcePath);
                outputStream = new FileOutputStream(sourceDestination);
                fileSize = new File(sourcePath).length();
                allBytes = new byte[(int) fileSize];
                while (inputStream.read(allBytes) != -1){
                    outputStream.write(allBytes);
                }
                System.out.println("Successful!");
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }

