package com.rest.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class SpecDigit {

    @JsonIgnore
    private String vin;
    @JsonIgnore
    private String modelNumber;
    @JsonIgnore
    private String modelYear;

    private String specCode;
    private String specDigit;
    private String specDigitDesc;

    public SpecDigit() {
    }

    public SpecDigit(String specCode, String specDigit, String specDigitDesc) {
        this.specCode = specCode;
        this.specDigit = specDigit;
        this.specDigitDesc = specDigitDesc;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getModelYear() {
        return modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public String getSpecDigit() {
        return specDigit;
    }

    public void setSpecDigit(String specDigit) {
        this.specDigit = specDigit;
    }

    public String getSpecDigitDesc() {
        return specDigitDesc;
    }

    public void setSpecDigitDesc(String specDigitDesc) {
        this.specDigitDesc = specDigitDesc;
    }
}
