package com.company.data.custom;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormatTest {
    @Test
    void testToString() {
        //Arrange
        var form = "\nFormat{\n" +
                "   type=     '" + "SCENARIO" + '\'' +
                "\n   version=  " + 1.0 +
                "\n}\n";

        //Assert
        assertEquals(form, format.toString());
    }

    @Test
    void getType() {
//        Act
        var type = format.getType();

//        Assert
        assertEquals("SCENARIO", type);
    }

    @Test
    void getVersion() {

//        Act
        var type = format.getVersion();

//        Assert
        assertEquals(1.0, type);
    }

    @BeforeAll
    static void init() {
        //Arrange
        format = new Format("SCENARIO", 1.0);
    }

    static Format format;
}