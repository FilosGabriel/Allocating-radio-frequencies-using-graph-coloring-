package com.company.filesrrrrrrrrr;

import com.company.data.BenchmarkData;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class BenchmarkFileWriter {
    public static void write(BenchmarkData data, String location, String name) throws IOException {
        Files.write(Paths.get(location + "\\" + name),
                toList(data),
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);
    }

    private static List<String> toList(BenchmarkData data) {
        List<String> lines = new ArrayList<>();
        lines.add("FORMAT {");
        lines.add("  TYPE                        " + data.getFormat().getType());
        lines.add("  VERSION                     " + data.getFormat().getVersion());
        lines.add("");
        lines.add("GENERAL_INFORMATION {");

        var generalInfo = data.getGeneralInfo();
        for (var entry : generalInfo.getValues().entrySet())
            lines.add("  " + entry.getKey() + "       " + entry.getValue() + ";");
        lines.add("}");
        lines.add("");

        lines.add("CELLS {");
        var cells = data.getCellsInfo().getListOfCells();
        for (int i = 1; i <= cells.size(); i++) {
            lines.add(i + "{");
            var cell = cells.get(i);
            lines.add(cell.getSiteName());
            lines.add(String.valueOf(cell.getSectorNumber()));
            lines.add(String.valueOf(cell.getDemand()));
            lines.add("LOC(" + cell.getX() + "," + cell.getY() + ");");
            lines.add("}");
        }
        lines.add("}");
        lines.add("");

        lines.add("CELL_RELATIONS {");

        return lines;
    }
}
