package ro.sda.curs10.generycTypes;

public class Iphone {

    private String iOSVersion;
    private String model;

    public Iphone(String iOSVersion, String model) {
        this.iOSVersion = iOSVersion;
        this.model = model;
    }

    public String getiOSVersion() {
        return iOSVersion;
    }

    public String getModel() {
        return model;
    }

    public void setiOSVersion(String iOSVersion) {
        this.iOSVersion = iOSVersion;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
