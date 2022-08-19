package _28_composition;

public class Resolution {

    private int en;
    private int boy;

    public Resolution(int en, int boy) {
        this.setEn(en);
        this.setBoy(boy);
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    /*
    Monitör Objesi içerisinde bir de Resolution objesini eklenmisti.
    Resolution sınıfında en ve boy tanımlaması yaptıktan sonra monitör
    sınıfında bu sınıfı çağırarak composition örneğini de tekrarlamış olacağız.
     */


}
