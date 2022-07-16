package com.bridzelab;

public class CensusCSVData {
    // Headers in the CSV files
    public int srNumber;
    public String stateName;
    public int tin;
    public String stateCode;

    public CensusCSVData(int srNumber, String stateName, int tin, String stateCode) {
        this.srNumber = srNumber;
        this.stateName = stateName;
        this.tin = tin;
        this.stateCode = stateCode;
    }
}
