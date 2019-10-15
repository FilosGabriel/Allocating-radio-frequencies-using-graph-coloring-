package com.company.data.custom;

import java.security.InvalidParameterException;

public class Spectrum {
    public Spectrum(int lower, int highest) {
        if (lower > highest) {
            throw new InvalidParameterException("Lower value should be lowest than highest value");
        }
        this.lower = lower;
        this.highest = highest;
    }

    public int getLower() {
        return lower;
    }

    public int getHighest() {
        return highest;
    }

    @Override
    public String toString() {
        return "(" +
                lower +
                ", " + highest +
                ')';
    }

    private int lower;
    private int highest;
}
