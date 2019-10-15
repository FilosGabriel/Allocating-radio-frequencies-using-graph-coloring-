package com.company.data;

import java.util.ArrayList;
import java.util.List;

public class Cells {
    public Cells() {
        listOfCells = new ArrayList<>();
    }

    public void addCell(String name, int sector, double traffic, int xPosition, int yPossition) {
        listOfCells.add(new Cell(name, sector, traffic, xPosition, yPossition, null, 0));
    }

    public List<Cell> getListOfCells() {
        return listOfCells;
    }

    public int size() {
        return listOfCells.size();
    }

    private List<Cell> listOfCells;

}
