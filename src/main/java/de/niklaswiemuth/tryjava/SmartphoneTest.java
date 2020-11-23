package de.niklaswiemuth.tryjava;

public class SmartphoneTest {
    public static void main(String[] args)
    {
        //Create a Manufacturer for the Smartphone

        Manufacturer xiaomi= new Manufacturer("China","Xiaomi",4);

        //Create a Smartphone made by Xiaomi

        Smartphone mi10= new Smartphone(128,6,10.0f,"Android", 108, xiaomi, "Snapdragon 865", 8);

        //Upgrade OS Version to Android 11

        mi10.UpgradeOSVersion(mi10.getSystemVersion(),1.0f);

        //Show device specs:

        System.out.println("Storage: " + mi10.getAmountOfStorageInGb());
        System.out.println("WifiVersion: " + mi10.getWifiVersion());
        System.out.println("SystemVersion: " + mi10.getSystemVersion());
        System.out.println("System OS Name: " + mi10.getSystemOS());
        System.out.println("MP of Main Camera: " + mi10.getMpCamera());
        System.out.println("Manufacturer: " + mi10.getManufacturer().getName() + ", " + mi10.getManufacturer().getCountryOfOrigin());
        System.out.println("CPU Name: " + mi10.getCpuName());
        System.out.println("RAM Capacity: " + mi10.getAmountOfRamInGb());
    }
}
