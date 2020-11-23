package de.niklaswiemuth.tryjava;

public class Manufacturer {

    public Manufacturer(String countryOfOrigin, String name, int rankedWorldwidePerMarketShare)
    {
        this.countryOfOrigin=countryOfOrigin;
        this.name=name;
        this.rankedWorldwidePerMarketShare=rankedWorldwidePerMarketShare;
    }


    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRankedWorldwidePerMarketShare() {
        return rankedWorldwidePerMarketShare;
    }

    public void setRankedWorldwidePerMarketShare(int rankedWorldwidePerMarketShare) {
        this.rankedWorldwidePerMarketShare = rankedWorldwidePerMarketShare;
    }

    private String countryOfOrigin;
    private String name;
    private int rankedWorldwidePerMarketShare;

}
