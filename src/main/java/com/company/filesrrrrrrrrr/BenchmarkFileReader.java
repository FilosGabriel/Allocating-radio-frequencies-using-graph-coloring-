package com.company.filesrrrrrrrrr;

import com.company.data.*;
import com.company.data.custom.Format;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;

public class BenchmarkFileReader {

    public BenchmarkFileReader(String path) throws FileNotFoundException {
        file = Paths.get(path);
        data = new BenchmarkData();
        FileInputStream dataFile = new FileInputStream(file.toString());
        reader = new BufferedReader(new InputStreamReader(dataFile));
    }

    public void readEntireFile() throws IOException {
        data.setFormat(readFormat());
//        data.setInfo(readGeneralInfo());
//        data.setCellsInfo(readCells());
    }

    private Format readFormat() throws IOException {
        reader.readLine();
        String type = reader.readLine().split("\\s+")[2].replace(";", "");
        Double ver = Double.valueOf(reader.readLine().split("\\s+")[2].replace(";", ""));
        reader.readLine();
        return new Format(type, ver);
    }

    private GeneralInfo readGeneralInfo() throws IOException {
        reader.readLine();
        reader.readLine();
        String temp = reader.readLine();
        Map<String, String> values = new LinkedHashMap<>();
        String[] temo;
        while (!temp.equals("}")) {
            temo = temp.split("\\s+");
            if (temo.length == 3)
                values.put(temo[1], temo[2].replace(";", ""));
            else {
                temp = "";
                for (int i = 2; i < temo.length; i++)
                    temp += " " + temo[i];
                values.put(temo[1], temp.replace(";", ""));
            }
            temp = reader.readLine();
        }
        return new GeneralInfo(values);

    }


    private Cells readCells() throws IOException {
        reader.readLine();
        reader.readLine();
        String tmp = reader.readLine();
        Cells listCells = new Cells();
        StringBuilder stringBuilder = new StringBuilder();
        while (!tmp.equals("}")) {
            tmp = reader.readLine();
            while (!tmp.contains("}")) {
                stringBuilder.append(tmp);
                tmp = reader.readLine();
            }
            //todo split ; apoi dupa spatiu
            System.out.println(stringBuilder);

        }


//        String name;
//        while (!tmp.equals("}")) {
//            reader.readLine();
//            name = reader.readLine().split("#")[0].replace(" ","").replace(";","");
//            listCells.addCell(name, toIntegerLine(), toDoubleLine(), toIntegerLine(), toIntegerLine());
//            reader.readLine();
//        }
        return listCells;
    }

    private Relations readReleations() throws IOException {
        reader.readLine();
        reader.readLine();
        Relations listOfRelations = new Relations();
        String tmp = reader.readLine();
        while (!tmp.equals("}")) {
            Relation rel = new Relation(Integer.parseInt(tmp.split("\\s+")[0]), Integer.parseInt(tmp.split("\\s+")[1]));
            while (!tmp.equals("}")) {
                rel.set(tmp);
                tmp = reader.readLine();
            }
            tmp = reader.readLine();
            listOfRelations.add(rel);
        }
        return listOfRelations;
    }

    private int toIntegerLine() throws IOException {
        return Integer.parseInt(reader.readLine().split("\\s+")[1].replace(";", ""));
    }

    private double toDoubleLine() throws IOException {
        return Double.parseDouble(reader.readLine().split("\\s+")[1].replace(";", ""));
    }

    public BenchmarkData getData() {
        return data;
    }

    public String getFile() {
        return file.toString();
    }

    private Path file;

    private BenchmarkData data;
    private BufferedReader reader;

}
