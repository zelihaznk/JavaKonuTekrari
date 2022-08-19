package _27_exceptionHandling;

public class AttempSample {

    public static void main(String[] args) {

        AttempFileReader fileReader = new AttempFileReader();

        try {
            fileReader.read("test.txt");
        } catch (AttemptException e) {
            e.printStackTrace();
        }

    }


}
