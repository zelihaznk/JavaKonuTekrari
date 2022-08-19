package _27_exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AttempFileReader {

    public void read(String fileName) throws AttemptException{

        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new AttemptException("Dosya bulunamadi!");
        }

    }


}
