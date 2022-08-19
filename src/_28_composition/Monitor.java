package _28_composition;

public class Monitor {

    private String model;
    private String uretici;
    private String boyut;
    private Resolution resolution; // composition

    public Monitor(String model, String uretici, String boyut, Resolution resolution) {
        this.setModel(model);
        this.setUretici(uretici);
        this.setBoyut(boyut);
        this.setResolution(resolution);
    }
    public void monitoruKapat(){
        System.out.println("Monitor kapatiliyor...");
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

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }






}
