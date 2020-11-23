package de.niklaswiemuth.tryjava;

public class Smartphone {

    public Smartphone(int amountOfStorageInGb, int wifiVersion, float systemVersion, String systemOS, int mpCamera, Manufacturer manufacturer, String cpuName, int amountOfRamInGb) {
        this.amountOfStorageInGb = amountOfStorageInGb;
        this.wifiVersion = wifiVersion;
        this.systemVersion = systemVersion;
        this.systemOS = systemOS;
        this.mpCamera = mpCamera;
        this.manufacturer = manufacturer;
        this.cpuName = cpuName;
        this.amountOfRamInGb = amountOfRamInGb;
    }

    public void UpgradeOSVersion(float systemVersion, float step){
        this.systemVersion=(systemVersion+step);
    }


    public int getAmountOfStorageInGb() {
        return amountOfStorageInGb;
    }

    public void setAmountOfStorageInGb(int amountOfStorageInGb) {
        this.amountOfStorageInGb = amountOfStorageInGb;
    }

    public int getWifiVersion() {
        return wifiVersion;
    }

    public void setWifiVersion(int wifiVersion) {
        this.wifiVersion = wifiVersion;
    }

    public float getSystemVersion() {
        return systemVersion;
    }

    public void setSystemVersion(float systemVersion) {
        this.systemVersion = systemVersion;
    }

    public String getSystemOS() {
        return systemOS;
    }

    public void setSystemOS(String systemOS) {
        this.systemOS = systemOS;
    }

    public int getMpCamera() {
        return mpCamera;
    }

    public void setMpCamera(int mpCamera) {
        this.mpCamera = mpCamera;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCpuName() {
        return cpuName;
    }

    public void setCpuName(String cpuName) {
        this.cpuName = cpuName;
    }

    public int getAmountOfRamInGb() {
        return amountOfRamInGb;
    }

    public void setAmountOfRamInGb(int amountOfRamInGb) {
        this.amountOfRamInGb = amountOfRamInGb;
    }

    private int amountOfStorageInGb;
    private int wifiVersion;
    private float systemVersion;
    private String systemOS;
    private int mpCamera;
    private Manufacturer manufacturer;
    private String cpuName;
    private int amountOfRamInGb;


}

