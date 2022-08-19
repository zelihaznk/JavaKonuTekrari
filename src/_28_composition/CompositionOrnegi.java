package _28_composition;

public class CompositionOrnegi {


    public class Motor {
        private static int motor_gucu = 3600;

        public void calis() {
            System.out.println("Motor Calisiyor") ;
        }

        public void dur() {
            System.out.println("Motor Durdu") ;
        }
    }


    //Şimdi bu Motor sınıfını, arabamızın içerisine yerleştirelim;

    public class AileArabasi {
        private Motor m = new Motor();
        public void hareketEt() {
            m.calis();
            System.out.println("Aile Arabasi Calisti");
        }
        public void dur() {
            m.dur();
            System.out.println("Aile Arabasi Durdu");
        }
        public void main(String args[]) {
            AileArabasi aa = new AileArabasi() ;
            aa.hareketEt();
            aa.dur();
        }
    }

    /*
    AileArabası sınıfının içerisine, Motor tipinde global bir alan
    yerleştirilerek, bu iki sınıf birbirine bağlanmış oldu.
    AileArabası sınıfının hereketEt() ve dur() metotlarında, önce
    Motor sınıfına ait yordamlar (methods) direkt olarak çağrıldı.

    Motor sınıfının private erişim belirleyicisine sahip olan motor_gucu
    alanına, AileArabasi sınıfının içerisinde ulaşamayız.
    AileArabasi sınıfı Motor sınıfının sadece iki adet public
    yordamına (method) erişebilir: calis() ve dur().
     */

}
