package com.company.data.custom;

public class Format {
    public Format(String type, double version) {
        this.type = type;
        this.version = version;
    }

    @Override
    public String toString() {
        return "\nFormat{\n" +
                "   type=     '" + type + '\'' +
                "\n   version=  " + version +
                "\n}\n";
    }

    public String getType() {
        return type;
    }

    public double getVersion() {
        return version;
    }

    private String type;
    private double version;
}
