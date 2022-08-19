package _27_exceptionHandling;

public class UncheckedExceptions {

    //Unchecked Exceptions

    /*
    Unchecked exception tipinde Runtime Exception Java’da yine kod geliştirme
    esnasında try-catch-finally bloğuyla yakalanabilir ve checked exception
    tipinde olduğu gibi istenildiği gibi işlem devam ettirilebilir.
    Fakat kodu geliştirme esnasında IDE yazılımcıyı uyarmaz. Yani orada bir
    hata olacağı geliştirme esnasında değil çalışma esnasında ortaya çıkar.
    Bir ArrayList nesnesi oluşturup içerisine 5 adet değer koyulduktan sonra,
    ArrayList nesnesi içinden 6. değer çağrıldığında, ExceptionHandling class'ında
    gördüğünüz (**) işaretli IndexOutBoundException sınıfından türetilmiş,
    ArrayIndexOutOfBoundException sınıfından hata fırlatılır.
    Elbette geliştirme esnasında buradaki ArrayList nesnesinden elemanın
    çekildiği satır try-catch bloğuyla kontrol edilebilir, fakat bunu
    geliştiricinin ön görmesi gerekmektedir.

    Bir diğer unchecked exception türü olan Error sınıfları ise kod geliştirme
    esnasında veya çalışma esnasında yazılımcının yakalayamacağı, problemin
    diğer Exception türlerine göre daha ciddi olduğu durumları yansıtmaktadır.
    Kodun çalışması esnasında Java virtual machine içinde uygulamanın
    çalıştırılması için ayrılmış bellek alanın dolması sonucu OutOfMemoryError
    fırlatılır. Bu hatayı kod içinden yakalamamız mümkün değildir.
    Önüne geçmek için çalışmalar yapabiliriz, mesela belliği kontrollü
    kullanırız veya uygulamayı ayağa kaldırırken bellek alanını genişletiriz
    fakat eğer bu hata alınmışsa uygulamanın kapanmaktan başka çaresi kalmamıştır.

     */

    //ORNEK:

    public static void main(String[] args) {
        String name = null;

        //kotu yaklasim.

        try {
            if(name.equals("zeliha")) {
                System.out.println("name : zeliha");
            }
        }catch(NullPointerException e) {
            System.out.println("catch!");
        }

        // guzel bir yaklasim.

        if(name != null && name.equals("zeliha")) {
            System.out.println("name : zeliha");
        }

        //En iyi  yaklasim.
        if("zeliha".equals(name)) {
            System.out.println("name : zeliha");
        }

    }




}
