package _04_ifElseKosulYapisi_AndOr;

public class and_or {
    public static void main(String[] args) {

        /*

        Bu dersimizde bir önceki derse ek olarak AND ve OR kullanımını
        anlatacağız. Nedir bu AND ve OR kullanımı diye sorarsanız şöyle
        anlatayım. Bir önceki dersimde kullandığımız tüm if koşulları
        sadece tek koşul içeriyordu. Örneğin sadece x ‘in 5 ten büyük
        olmasına bakıyorduk. Ama tek koşul olması bazen yetmeyebilir,
        x’in 5’ten büyük olmasının yanında 10’dan küçük olmasıda gerekebilir.
        Bu durumda aşağıdaki gibi iç içe if yapısı kurabiliriz.

         */

        /*

        if(x>5){
           if(x<10){
             //işlemler
            }
         }

         */

        /*
        Yukarıda gördüğümüz gibi iç içe if kullandık ve gerekli koşulu sağladık.
        Ama bu kullanım pratik bir kullanım değildir. Bu gibi birden çok koşul
        için AND (ve) ve OR (veya) yapısını kullanırız.
        Java’da AND için kullanılan işaret -> “&&” , OR için kullanılan işaret
        ise “||” bu ikisidir. Bunlara logical operator adı verilmektedir.

        Bir önceki dersimizden de bildiğimiz üzere if koşulunun içi true ise
        if bloğuna girer,false ise sıradaki else if veya direk else bloğuna girer.
        AND ve OR işlemlerinde ise hangi durumlarda true ,hangi durumlarda false
        geldiğini aşağıdaki tabloda görebilirsiniz.

        A = true ,B=true olsun
         */

        /*

 Logical Operatör	Açıklama/Örnek Kullanım
 && (AND)	İf içindeki tüm koşullar true ise true, değilse false
(A && B) => true
(A && !B) => false

 || (OR)	İf içinde tek bir koşul true ise true, değilse false
(A || B) => true
(A || !B) => true
(!A || !B) => false

         */








    }
}
