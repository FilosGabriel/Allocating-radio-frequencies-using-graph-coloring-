package com.company.data;

public class Cell {
    public Cell(String siteName, int sectorNumber, double demand, int x, int y, String locallyBlockedChannels, int coCellSeparation) {
        this.siteName = siteName;
        this.sectorNumber = sectorNumber;
        this.demand = demand;
        this.x = x;
        this.y = y;
        this.locallyBlockedChannels = locallyBlockedChannels;
        this.coCellSeparation = coCellSeparation;
    }

    public String getSiteName() {
        return siteName;
    }

    public int getSectorNumber() {
        return sectorNumber;
    }

    public double getDemand() {
        return demand;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getLocallyBlockedChannels() {
        return locallyBlockedChannels;
    }

    public int getCoCellSeparation() {
        return coCellSeparation;
    }

    private String siteName;
    private int sectorNumber;
    private double demand;
    private int x;
    private int y;
    private String locallyBlockedChannels;
    private int coCellSeparation;
}
