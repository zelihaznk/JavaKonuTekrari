package _31_collections;

public class Main {
    public static void main(String[] args) {
        CreateCode createCode = new CreateCode();
        String ayrac = "---------------";
        System.out.println(ayrac + "\n<Oluşturulan Lisans Anahtarları>\n" + ayrac);
        for (int i = 0; i < 5; i++) {
            System.out.println("-> Oluşturulan " + (i + 1) + ". Lisans Anahtarı: " + createCode.newCode() + "\n" + ayrac);
        }
    }
}
