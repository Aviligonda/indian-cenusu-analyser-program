package com.bridzelab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class CensusAnalyserTest {
    CensusAnalyser censusAnalyser;

    @Before
    public void setUp() throws Exception {
        censusAnalyser = new CensusAnalyser();
    }

    @Test
    public void givenCsvFileNumberOfRecordsMatchesShouldReturnTrue() throws IOException, CensusIOExceptions {
        censusAnalyser.loadingTheDataFromCsvFile("src/files/censusData.csv");
        Assert.assertEquals(true, censusAnalyser.checkNumberOfRecords());
    }

    @Test
    public void givenCsvFileIncorrect_ShouldReturnCustomException() throws IOException {
        try {
            censusAnalyser.loadingTheDataFromCsvFile("src/files/stateCensusData.csv");
        } catch (CensusIOExceptions e) {
            e.printStackTrace();

        }
    }

    @Test
    public void givenCsvFileIsCorrectBut_TypeIncorrect_ShouldReturnCustomException() throws IOException {
        try {
            censusAnalyser.loadingTheDataFromCsvFile("src/files/censusWrongDataType.csv");
        }catch (CensusIOExceptions e){
            e.printStackTrace();
        }
    }
}
