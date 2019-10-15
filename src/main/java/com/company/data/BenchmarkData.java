package com.company.data;

import com.company.data.custom.Format;

public class BenchmarkData {

    public void setInfo(GeneralInfo info) {
        this.info = info;
    }

    public void setCellsInfo(Cells cellsInfo) {
        CellsInfo = cellsInfo;
    }

    public void setCellRelations(Relations cellRelations) {
        this.cellRelations = cellRelations;
    }


    public GeneralInfo getGeneralInfo() {
        return info;
    }

    public Cells getCellsInfo() {
        return CellsInfo;
    }

    public Relations getCellRelations() {
        return cellRelations;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "BenchmarkData{" +
                format +
                info +
                ", CellsInfo=" + CellsInfo +
                ", cellRelations=" + cellRelations +
                '}';
    }

    private Format format;
    private GeneralInfo info;
    private Cells CellsInfo;
    private Relations cellRelations;
}
