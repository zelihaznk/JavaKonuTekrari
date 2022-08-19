package _28_composition;

public class Anakart {


    private String model;
    private String uretici;
    private int yuva_sayisi;
    private String isletim_sistemi;

    public Anakart(String model, String uretici, int yuva_sayisi, String isletim_sistemi) {
        this.setModel(model);
        this.setUretici(uretici);
        this.setYuva_sayisi(yuva_sayisi);
        this.setIsletim_sistemi(isletim_sistemi);
    }

    public void isletimSistemi_yukle(String isletim_sistemi) {
        this.isletim_sistemi = isletim_sistemi;
        System.out.println("Isletim Sisteminiz :" + isletim_sistemi);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getYuva_sayisi() {
        return yuva_sayisi;
    }

    public void setYuva_sayisi(int yuva_sayisi) {
        this.yuva_sayisi = yuva_sayisi;
    }

    public String getIsletim_sistemi() {
        return isletim_sistemi;
    }

    public void setIsletim_sistemi(String isletim_sistemi) {
        this.isletim_sistemi = isletim_sistemi;
    }




}
