package files;

import com.company.files.BenchmarkFileReader;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

class TestBenchmarkReader {
    @Test
    void givenBenchmarkReaderWhenIsCreatedThenShouldHavePath() throws FileNotFoundException {
//        Arrange
        String path = "C:\\Users\\filos\\dev\\Licenta\\data\\Tiny";
        BenchmarkFileReader benchmarkFileReader = new BenchmarkFileReader(path);
//        Act
        var pathReturned = benchmarkFileReader.getFilePath();
//      Assert
        assertEquals(path, pathReturned);
    }

    @Test
    void givenBenchmarkReaderItShouldThrowExceptionIfFileDontExist() {
        assertThrows(FileNotFoundException.class, () -> {
            new BenchmarkFileReader("dasd");
        });
    }
}
