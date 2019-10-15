package com.company.data.custom;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.*;

class SpectrumTest {

    static Spectrum spectrum;

    @BeforeAll
    static void init() {
        spectrum = new Spectrum(1, 2);
    }

    @Test
    static void givenSpectrumShouldThrowExceptionWhenLowerValueIsSmallestThanHighestValue() {
        assertThrows(InvalidParameterException.class, () -> {
            new Spectrum(3, 2);
        });
    }

    @Test
    void givenSpectrumShouldHaveLowerValue() {
        assertEquals(1, spectrum.getLower());
    }

    @Test
    void givenSpectrumShouldHaveHighestValue() {
        assertEquals(2, spectrum.getHighest());

    }

    @Test
    void givenSpectrumShouldBeCapableTo() {
        assertEquals("(" +
                1 +
                ", " + 2 +
                ')', spectrum.toString());
    }
}