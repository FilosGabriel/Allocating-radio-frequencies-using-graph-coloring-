package com.company.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CellsTest {

    @Test
    void addCell() {
//        Arrange
        Cells cells = new Cells();
//        Act
        cells.addCell("name", 2, 2.2, 2, 3);
        cells.addCell("nam2e", 2, 2.2, 2, 3);
        cells.addCell("nam2e", 2, 2.2, 2, 3);
        cells.addCell("na3me", 2, 2.2, 2, 3);
        cells.addCell("na4me", 2, 2.2, 2, 3);


//        Assert
        assertEquals(5, cells.getListOfCells().size());
    }

    @Test
    void getListOfCells() {
//        Arrange
        Cells cells = new Cells();
//        Assert
        assertEquals(0, cells.getListOfCells().size());

    }

    @Test
    void size() {
        //        Arrange
        Cells cells = new Cells();
//        Act
        cells.addCell("name", 2, 2.2, 2, 3);
        cells.addCell("nam2e", 2, 2.2, 2, 3);

//Assert
        assertEquals(2, cells.size());
    }
}