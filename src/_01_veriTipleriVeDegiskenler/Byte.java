package _01_veriTipleriVeDegiskenler;

public class Byte {

    public static void main(String[] args) {
        /*
        Tam Sayılar	Reel Sayılar	Karakterler	Mantıksal Değerler
byte	float	char	boolean
short	double
integer
long
Java Veri Tipleri ve Değişkenler ‘in detaylı anlatımlarına geçmeden
önce genel olarak bir değişkenin nasıl tanımlandığını göstermeye çalışalım.

MainClass.javaJava
veriTipi değişkenAdi = değişkenDeğeri;
1
veriTipi değişkenAdi = değişkenDeğeri;
Veri tipleri yukarıdaki tabloda gördüğünüz
byte, short, int, long, float, double, char veya boolean olabilir.
Değişken adı tamamen geliştiriciye kalmış değişkene verilen isimdir.
         */

        /*
        BYTE: byte en küçük tam sayı tipidir. Büyüklüğü 8 bit tir ve
        -128 ile +127 arası değer alır. Kod geliştirirken byte
        anahtar kelimesi ile tanımlama yapılır.
         */

        byte byteDeger =45;
        System.out.println(byteDeger);

        /*
        Yukarıda görmüş olduğunuz kod satırında byte veri tipiyle değeri
        45 olan “byteDeger” değişken adıyla bir tanımlama yapılmıştır.
        Yukarıda tanımlanan byteDeger değişkenine -128’den küçük veya
         +127’den büyük bir değer tanımlandığı takdirde geliştirme anında
         hata ile karşılaşılacaktır.
         */

    }
}
