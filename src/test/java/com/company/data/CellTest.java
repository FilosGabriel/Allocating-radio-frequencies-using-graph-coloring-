package com.company.data;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CellTest {

    static Cell cell;

    @BeforeAll
    static void init() {
        //Arrange
        cell = new Cell("site_name", 2, 1.2, 1, 3, "1,2", 2);
    }

    @Test
    void givenCellShouldHaveName() {
        //Act
        var name = cell.getSiteName();
        //Assert
        assertEquals("site_name", name);
    }

    @Test
    void givenCellShouldHaveSectorNumber() {
        //Act
        var sectorNumber = cell.getSectorNumber();
        //Assert
        assertEquals(2, sectorNumber);
    }

    @Test
    void givenCellShouldHaveDemand() {
        //Act
        var demand = cell.getDemand();
        //Assert
        assertEquals(1.2, demand);
    }

    @Test
    void givenCellShouldHaveXValue() {
        //Act
        var x = cell.getX();
        //Assert
        assertEquals(1, x);
    }

    @Test
    void givenCellShouldHaveYValue() {
        //Act
        var y = cell.getY();
        //Assert
        assertEquals(3, y);
    }

    @Test
    void givenCellShouldHaveLocallyBlockedChannels() {
        //Act
        var channels = cell.getLocallyBlockedChannels();
        //Assert
        assertEquals("1,2", channels);
    }

    @Test
    void givenCellShouldHaveCoCellSeparation() {
        //Act
        var separation = cell.getCoCellSeparation();
        //Assert
        assertEquals(2, separation);
    }
}