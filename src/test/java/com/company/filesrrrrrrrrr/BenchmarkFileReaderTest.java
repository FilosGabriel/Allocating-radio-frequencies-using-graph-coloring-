package com.company.filesrrrrrrrrr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class BenchmarkFileReaderTest {
    //   Arrange
    @BeforeAll
    public static void init() throws FileNotFoundException {
        benchmarkFileReader = new BenchmarkFileReader(path);
    }

    @Test
    void verifyIfPathIsSetCorrectlyTest() {
        //Act
        final String pathReturned = benchmarkFileReader.getFile();

        //Assert
        assertEquals(path, pathReturned);
    }

    @Test
    void testTypeIsReadedCorrectly() {
        //Act
        final String type = benchmarkFileReader.getData().getFormat().getType();
        //Assert
        assertEquals("SCENARIO", type);
    }

    @Test
        //whenExceptionThrown_thenAssertionSucceeds
    void testIfFileDontExistThenThrowIOException() {
        //Arrange
        assertThrows(FileNotFoundException.class, () -> {
            new BenchmarkFileReader("dasd");
        });
    }


    private static BenchmarkFileReader benchmarkFileReader;
    private final static String path = "C:\\Users\\filos\\dev\\Licenta\\data\\Tiny";
}