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
}
