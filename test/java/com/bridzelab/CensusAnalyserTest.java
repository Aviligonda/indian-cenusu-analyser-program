package com.bridzelab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class CensusAnalyserTest {
    CensusAnalyser censusAnalyser;

    @Before
    public void setUp()   {
        censusAnalyser = new CensusAnalyser();
    }

    @Test
    public void givenCsvFileNumberOfRecordsMatchesShouldReturnTrue() throws IOException, CensusIOExceptions {
        censusAnalyser.loadingTheDataFromCsvFile("src/files/censusData.csv");
        Assert.assertTrue(censusAnalyser.checkNumberOfRecords());
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
        } catch (CensusIOExceptions e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenCsvFileIsCorrectBut_DelimiterIsInCorrect_ShouldReturnCustomException() throws IOException {
        try {
            censusAnalyser.loadingTheDataFromCsvFile("src/files/censusDelimeter.csv");
        } catch (CensusIOExceptions e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenCsvFileIsCorrectBut_HeaderIsInCorrect_ShouldReturnCustomException() throws IOException {
        try {
            censusAnalyser.loadingTheDataFromCsvFile("src/files/censusWrongHeaader.csv");
        } catch (CensusIOExceptions e) {
            e.printStackTrace();
        }
    }
}
