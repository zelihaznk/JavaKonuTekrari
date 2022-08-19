package _27_exceptionHandling;

public class ExceptionHandling {
    public static void main(String[] args) {

      //Java Exception Handling (Hata Yakalama)

        /*
        Exception sınıfları Java’da diğer sınıfların üretildiği Object
        sınıfından türemektedir. Throwable sınıfı Object sınıfının bir alt
        sınıfıdır. Throwable sınıfından ise Exception sınıfı türer
        Exception sınıfından da bildiğimiz checked ve unchecked olarak
        bilinen diğer Exception sınıfları türetilir.
         Aşağıdaki grafik yazılanları daha net bir şekilde görmenize yardımcı olacaktır.

         */

        /*
                                             Throwable
                                                ||
              A) Error(**)                                                       B) Exception(*)
                                                                                     ||
                                                                                     ||
                                           B1) IOException(*)           B2) ClassNot             B3) CloneNot                  B4) Runtime
                                                      ||              Found Exception(*)         Supported Exception(*)           Exception(**)
                                                      ||                                                                          ||
                                              * EOFException                                                                      ||
                                              * FileNotFound                                                                 ** Aritmetic
                                                 Exception                                                                      Exception
                                              * MalformedURL                                                                 ** ClassCast
                                                 Exception                                                                      Exception
                                              * UnknownHost                                                                  ** Illegal Argument
                                                 Exception                                                                      Exception
                                                                                                                             ** Illegal State
                                                                                                                                Exception
                                                                                                                             ** IndexOut OfBounds
                                                                                                                                Exception
                                                                                                                             ** NoSuch Element
                                                                                                                                Exception
                                                                                                                             ** NullPointer
                                                                                                                                Exception


         */

        /*
        Yukarıdaki görselde (**) ile gösterilen Error ve Runtime Exception ve Runtime Exceptiondan türeyen alt Exception sınıfları Unchecked Exception olarak işaretlenmiştir.
        (*) ile gösterilenler ise Exception sınıfıları ise Checked Exception olarak işaretlenmiştir.
         */













    }
}
