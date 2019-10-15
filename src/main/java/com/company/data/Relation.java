package com.company.data;

public class Relation {

    public Relation(int cellID1, int cellId2) {
        this.cellID1 = cellID1;
        this.cellId2 = cellId2;
    }

    public int getCellID1() {
        return cellID1;
    }

    public int getCellId2() {
        return cellId2;
    }

    public boolean isHandover() {
        return handover;
    }

    public int getSeparation() {
        return separation;
    }

    public double getDownlinkArea() {
        return downlinkArea;
    }

    public double getUplinkArea() {
        return uplinkArea;
    }

    public double getDownlinkTraffic() {
        return downlinkTraffic;
    }

    public double getUplinkTraffic() {
        return uplinkTraffic;
    }

    public void set(String values) {
        String[] val = values.split("\\s+");
        switch (val[0]) {
            case "H":
                handover = val[1].equals("1");
                break;
            case "S":
                separation = Integer.parseInt(val[1]);
                break;
            case "DA":
                downlinkArea = Double.parseDouble(val[1]);
                break;
            case "UA":
                uplinkArea = Double.parseDouble(val[1]);
                break;
            case "DT":
                downlinkTraffic = Double.parseDouble(val[1]);
                break;
            case "UT":
                uplinkTraffic = Double.parseDouble(val[1]);

        }

    }

    private int cellID1;
    private int cellId2;
    private boolean handover;
    private int separation;
    private double downlinkArea;
    private double uplinkArea;
    private double downlinkTraffic;
    private double uplinkTraffic;


}
