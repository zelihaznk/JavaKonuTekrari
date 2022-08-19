package _13_methodYapisi;

public class Overloading2 {
    public static void toplama(int sayi1, int sayi2){
        int sonucInt = sayi1+sayi2;
        System.out.println(sayi1 + " + " + sayi2 + "= " + sonucInt);
    }
    public static void toplama(double sayi1, double sayi2){
        double sonucDouble = sayi1+sayi2;
        System.out.println(sayi1 + "+ "  + sayi2 + "= "  + sonucDouble);
    }

    public static void main(String[] args){
        System.out.println("Tamsayı Toplama :");
        toplama(15,20);
        System.out.println("Küsüratlı Toplama :");
        toplama(20.52,20.49);
    }
}
