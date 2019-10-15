package com.company;

import com.company.filesrrrrrrrrr.BenchmarkFileReader;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {

        String a = "C:\\Users\\filos\\dev\\Licenta\\data\\Tiny";
        BenchmarkFileReader reader = new BenchmarkFileReader(a);
        reader.readEntireFile();
        System.out.println(reader.getData());

    }
}
