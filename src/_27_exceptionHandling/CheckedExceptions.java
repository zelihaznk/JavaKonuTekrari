package _27_exceptionHandling;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptions {

    //Checked Exceptions

    /*
    Checked Exception Java’da kod geliştirme esnasında try-catch-finally
    bloğu içerisinde yakalanan ve daha sonra işlem yapılabilen, istenildiği
    takdirde bypass edilerek programın çalışmasına belkide kullanıcının
    hiç haberi olmadan devam edilmesini sağlayan exception çeşitleridir.
    Checked Exception alındığında çalışma anında düzeltme yapıp düzgün
    parametrelerle kodun çalışmasına devam edilebilir. Checked Exception
    sınıflarının tamamı Exception sınıfından türetilmiştir.
    Gelişmiş IDE’ler sayesinde checked exceptionların kontrolleri daha
    kolay bir şekilde sağlanmaktadır. Eğer kodunuzu notepad ile değilde
    daha gelişmiş bir IDE  ile geliştiriyorsanız (örn: intellij idea,
    eclipse, netbeans) ve yazdığınız kodda Checked Exception varsa IDE
    sizi uyarıyor ve bu fırlatılan exception’ ı handle etmeniz yani
    yakalayıp gerekli işlemi yapmanız gerektiğini söylüyor.
    İşte bu durumda yazılımcılar olarak bizler, ya exception’ ın fırlatıldığı
    satırı try-catch bloğu içine alıyoruz ya da bir üst metoda throws ediyoruz.
     */

    //ORNEK:

    public static void main(String[] args) {
        try {
            //FileWriter class'i checked exception.
            FileWriter fw = new FileWriter("file.txt");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void throwsExample() throws IOException {

        FileWriter fw = new FileWriter("file.txt");
    }
}











