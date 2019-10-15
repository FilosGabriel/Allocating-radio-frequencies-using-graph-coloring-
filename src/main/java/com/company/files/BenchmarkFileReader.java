package com.company.files;

import com.company.data.BenchmarkData;
import com.company.data.custom.Format;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BenchmarkFileReader {
    public BenchmarkFileReader(String filePath) throws FileNotFoundException {
        this.filePath = filePath;
        file = Paths.get(filePath);
        FileInputStream fileInputStream = new FileInputStream(file.toString());
        reader = new BufferedReader(new InputStreamReader(fileInputStream));
    }

    public String getFilePath() {
        return filePath;
    }

    public void readEntireFile() {
        data.setFormat(readFormat());
    }

    private Format readFormat() {
        return null;
    }

    private String filePath;
    private Path file;

    private BenchmarkData data;
    private BufferedReader reader;
}
