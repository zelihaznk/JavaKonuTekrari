package _21_NesneVeSinifYapisi._25_inheritance;

public class ObjectSinifi {

    //Object Sınıfı

    /*
    Java Inheritance aslında temelde var olan hatta yazılımcıların
    farkında olmadan kullandıkları bir yapıdır. Java’da kullanılan
    tüm sınıflar Object sınıfından  türetilmiştir. Bir sınıfın tipi
    bilinmiyorsa bu sınıf new operatörüyle Object sınıfına eşitlenebilir.
    Bu bir problem yaratmayacaktır, çünkü temelde
    Object sınıfından türemektedir.  Tüm sınıflar Object sınıfından
    türedikleri için de Object sınıfı içindeki değişken ve metotları
    miras alırlar.
     */

    public ObjectSinifi(){
        super();
    }

    public int hashCode(){
        return super.hashCode();
    }

    public boolean equals(Object obj){
        return super.equals(obj);
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public String toString(){
        return super.toString();
    }

   /* protected void finalize() throws Throwable {
        super.finalize();
    }
    */

    /*
    Yukarıdaki örnekte görüldüğü gibi oluşturulan sınıf Object
    sınıfındaki tüm metotları miras almıştır. Object sınıfı
    tüm sınıfların superclass ‘ı diyebiliriz.
     */















}
